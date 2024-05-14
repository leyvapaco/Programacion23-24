package u9.mySQL3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmployeeModel {
    public static void insertEmployee(Connection con, Employee employee) throws SQLException{

        String sql="INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setInt(1,employee.getEmployeeNumber());
        sentencia.setString(2,employee.getLastName());
        sentencia.setString(3,employee.getFirstName());
        sentencia.setString(4,employee.getExtension());
        sentencia.setString(5,employee.getEmail());
        sentencia.setString(6, employee.getOfficeCode());
        sentencia.setInt(7,employee.getReportsTo());
        sentencia.setString(8,employee.getJobTittle());

        sentencia.executeUpdate();
    }
    
    public static void updateEmployeeEmail(Connection con, Employee employee) throws SQLException{

        String sql="UPDATE employees SET "
        		+ "email=? "
        		+ "WHERE employeeNumber=?";
        PreparedStatement sentencia=con.prepareStatement(sql);

        sentencia.setString(1,employee.getEmail());
        sentencia.setInt(2,employee.getEmployeeNumber());

        sentencia.executeUpdate();
    }

}
