package u9.mySQL1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;

		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM employees");

			while (rs.next()) {
				int idUsuario = rs.getInt("employeeNumber");
				String usuario = rs.getString(2);
				String clave = rs.getString(3);

				System.out.println(idUsuario + " - " + usuario + " - " + clave);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}

				if (stm != null) {
					stm.close();
				}

				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}