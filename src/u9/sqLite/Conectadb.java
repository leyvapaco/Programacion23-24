package u9.sqLite;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectadb {
	 public static void main ( String args[] ){
		 
	      Connection connection = null;     
	 
	      try{
	    	//  Class.forName("org.sqlite.JDBC");

	         connection = DriverManager.getConnection( "jdbc:sqlite:C:\\Users\\leyva\\u9BD\\sampledatabase2.db");
	         if ( connection != null ){
	            System.out.println("Conexión exitosa!");            
	            
	            
	         }
	      }
	      catch ( Exception ex ) {
	         System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
	         System.out.println("Error en la conexión");
	      }
	   }
}
