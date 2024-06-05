package u9.examen.solucion;

import java.sql.*;
import java.util.Scanner;

public class Consultas {	
	  public static void pagosCliente(Connection connection) {
	        try {

	        	Statement statement = connection.createStatement();	        	
	        	statement.setQueryTimeout(30);
	        	
	            Scanner sc = new Scanner(System.in);
	            System.out.println("\nIntroduzca el número de cliente (p.e 151): ");
	            //Cliente número 151 tiene un total de pagos de 177.913,95
	            
	            String cn = sc.nextLine(); 
           
	            String sql="select C.customerName,  sum(P.amount) from customers C, payments P \n"
	            		+ "where C.customerNumber=P.customerNumber and \n"
	            		+ "C.customernumber=? \n"
	            		+ "group by C.customerName";
	            
	            PreparedStatement sentencia=connection.prepareStatement(sql);

	            sentencia.setInt(1,Integer.parseInt(cn));

	            ResultSet rs=sentencia.executeQuery();

	            while (rs.next()) {
	            	System.out.println("--pagosCliente-----------");
	            	System.out.println("Número cliente: "+cn);
	                System.out.println("Nombre :" + rs.getString(1));
	                System.out.println("Importe total :" + rs.getString(2) + " euros");
	                System.out.println("-------------------------");
	            }    

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } 
	    }
	  
	  
	  public static void informeCategoría(Connection connection) {
	        try {

	        	Statement statement = connection.createStatement();	        	
	        	statement.setQueryTimeout(30);
	   
	            Scanner sc = new Scanner(System.in);
	            System.out.println("\nIntroduzca el nombre de la categoría: (P.e Ships) ");
	             
	            String cn = sc.nextLine();

	            String sql = "select P.productname, sum(D.quantityOrdered) \n"+
	            		"from products P, orderdetails D \n"+
	            		"where productline like ? and P.productCode=D.productCode \n"+
	            		"group by P.productname";
	            		            		

	            PreparedStatement sentencia=connection.prepareStatement(sql);
           
	            sentencia.setString(1,cn);

	            ResultSet rs=sentencia.executeQuery();

	            System.out.println("--informeCategoría-----------");
           	 	System.out.println("Nombre categoría: "+cn);
           	 	
	            while (rs.next()) {
	                 System.out.println("Nombre producto :" + rs.getString(1));
	                 System.out.println("Unidades vendidas :" + rs.getInt(2)+"\n");
	             	}
	            	System.out.println("-------------------------");
	         }  catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } 
	}  
	  
	
	 
    public static void main(String[] args) {
		Conexion conexion = new Conexion();
		     		
		try {
			Connection connection = conexion.conectar();
			
			pagosCliente(connection);
			informeCategoría(connection);
				
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }   
 }
