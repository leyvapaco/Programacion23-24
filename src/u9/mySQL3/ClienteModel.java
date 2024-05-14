package u9.mySQL3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteModel{
        public static void insertCliente(Connection con, Cliente cliente) throws SQLException {
  
        String sql="INSERT INTO customers VALUES (?, ?, ?, ?, ?, ?, NULL, ?, NULL, NULL, ?, NULL, NULL)";

        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,cliente.getCustomerNumber());
        sentencia.setString(2,cliente.getCustomerName());
        sentencia.setString(3,cliente.getContactLastName());
        sentencia.setString(4,cliente.getContactFirstName());
        sentencia.setString(5,cliente.getPhone());
        sentencia.setString(6, cliente.getAddressLine1());
        sentencia.setString(7,cliente.getCity());
        sentencia.setString(8,cliente.getCountry());

        sentencia.executeUpdate();
    }
           
}
