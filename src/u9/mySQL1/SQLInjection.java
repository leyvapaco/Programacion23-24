package u9.mySQL1;
import java.sql.*;
import java.util.Scanner;

public class SQLInjection {

    public static void main(String[] args) {

		Conexion conexion = new Conexion();
		Connection cn = null;

        try {
            //Creo la conexión a la base de datos
            // La paso el nombre de la base de datos classimodels
            // El usuario de la base de datos user=usuario
            // La contraseña password=usuario
        	cn = conexion.conectar();
  
            ///Creo el objeto para ejecutar la sentencias SQL
            Statement statement = cn.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Solicito los datos del cliente. P:e 172 es un cliente existente
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el número del cliente");
            String consola = sc.nextLine();

            String query = "select * from customers where customerNumber="+consola;

            System.out.println("Esta es la consulta construida: " + query);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery(query);

            //Recorremos el conjunto de resultados

            while (rs.next()) {
                String number = rs.getString("customerNumber");
                String name = rs.getString("customerName");
                String address = rs.getString("addressLine1");
                String country = rs.getString("country");

                System.out.println("-------------------------");
                System.out.println("CustomerNumber: " + number);
                System.out.println("CustomerName: " + name);
                System.out.println("Address: " + address);
                System.out.println("Country: " + country);
                System.out.println("-------------------------");

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
