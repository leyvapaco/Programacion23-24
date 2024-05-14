package u9.mySQL3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OfficeModel {

        public static Integer insertOffice(Connection con, Office office) throws SQLException{
            Integer rowsAffected=0;

            String sql="INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia=con.prepareStatement(sql);

            sentencia.setString(1,office.getOfficeCode());
            sentencia.setString(2,office.getCity());
            sentencia.setString(3,office.getPhone());
            sentencia.setString(4,office.getAddressLine1());
            sentencia.setString(5,office.getAddressLine2());
            sentencia.setString(6, office.getState());
            sentencia.setString(7,office.getCountry());
            sentencia.setString(8,office.getPostalCode());
            sentencia.setString(9,office.getTerritory());

            rowsAffected=sentencia.executeUpdate();

            return rowsAffected;
        }

    }
