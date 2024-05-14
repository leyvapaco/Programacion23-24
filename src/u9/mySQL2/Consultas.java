package u9.mySQL2;

import java.sql.*;
import java.util.Scanner;

public class Consultas {	
	  public static void datosJefe(Connection connection) {
	        try {

	        	Statement statement = connection.createStatement();	        	
	        	statement.setQueryTimeout(30);
	        	
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Introduzca el número de empleado (p.e 1056): ");
	            //empleado 1056 tiene como jefa a 1002 Diane Murphy
	            String cn = sc.nextLine();
	 
	            String sql="SELECT lastName,firstName FROM `employees` WHERE employeeNumber = (select reportsTo from employees where employeeNumber=?)";

	            PreparedStatement sentencia=connection.prepareStatement(sql);

	            sentencia.setInt(1,Integer.parseInt(cn));

	            ResultSet rs=sentencia.executeQuery();

	            while (rs.next()) {
	            	System.out.println("--infoPedido---JEFE de "+cn+"--");
	                System.out.println("lastName :" + rs.getString(1));
	                System.out.println("FirstName :" + rs.getString(2));
	                System.out.println("-----------------");
	            }    

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } 
	    }
	  
	  
	  public static void infoPedido(Connection connection) {
	        try {

	        	Statement statement = connection.createStatement();	        	
	        	statement.setQueryTimeout(30);
	   
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Introduzca el número del pedido (p.e 10100) ");
	             //pedido 10100 tiene datos. Total: 10.223,83 euros
	            String cn = sc.nextLine();

	            String sql="SELECT  O.orderNumber, P.productName, O.quantityOrdered, O.priceEach, "
	            		+ "(select sum(O.quantityOrdered*O.priceEach) FROM orderdetails O where O.orderNumber=?) total "
	            		+ "FROM orderdetails O, products P WHERE \n" +
	                     "O.orderNumber=? \n" +
	                     "and P.productCode=O.productCode";

	            PreparedStatement sentencia=connection.prepareStatement(sql);
           
	            sentencia.setInt(1,Integer.parseInt(cn));
	            sentencia.setInt(2,Integer.parseInt(cn));

	            ResultSet rs=sentencia.executeQuery();

	            while (rs.next()) {
	            	 System.out.println("--infoPedido-----------");
	                 System.out.println("order :" + rs.getString(1));
	                 System.out.println("Nombre :" + rs.getString(2));
	                 System.out.println("Precio :" + rs.getString(3));
	                 System.out.println("Cantidad :" + rs.getString(4));
	                 System.out.println("Total :" + rs.getString(5));
	                 System.out.println("-----------------");
	             }
	         }  catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } 
	}  
	 
	  
	  public static void pagosCliente(Connection connection) {
	        try {

	        	Statement statement = connection.createStatement();	        	
	        	statement.setQueryTimeout(30);
	   
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Introduzca el número del cliente (p.e 201)"); 
	            String cn = sc.nextLine();

	            ResultSet rs = statement.executeQuery("SELECT C.contactFirstName,C.contactLastName,C.country, sum(P.amount) FROM customers C, payments P WHERE " +
	                    "C.customerNumber=P.customerNumber AND " +
	                    "C.customerNumber="+cn);

	            while (rs.next()) {

	            	System.out.println("--pagosCliente------------");
	                System.out.println("Nombre :" + rs.getString("contactFirstName"));
	                System.out.println("Apellido :" + rs.getString("contactLastName"));
	                System.out.println("País :" + rs.getString("country"));
	                System.out.println("Pagos :" + rs.getString(4));
	                System.out.println("-----------------");
	            }
	         }  catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } 
	}    
	 
    public static void main(String[] args) {
        //Creamos el objeto conexión
		Conexion conexion = new Conexion();
		Connection connection = conexion.conectar();   
  		
		try {
			
			datosJefe(connection);
			infoPedido(connection);
			pagosCliente(connection);		
				
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }   
 }
