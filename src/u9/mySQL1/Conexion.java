package u9.mySQL1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	
	//Usar esta URL para la primera vez que conectamos:
	private static final String URL = "jdbc:mysql://localhost:33060/classicmodels";

	//Una vez conectados, usar esta URL en lugar de la anterior
	//private static final String URL = "jdbc:mysql://localhost:33060/classicmodels?useSSL=false";
	private static final String USUARIO = "root";
	private static final String CLAVE = "paco";

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public Connection conectar() {
		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión OK");

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}

		return conexion;
	}
}