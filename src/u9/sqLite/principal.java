package u9.sqLite;
import java.sql.*;

public class principal {
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\leyva\\u9BD\\sampledatabase2.db");
            Statement statement= connection.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println("nombre: " + rs.getString("firstName"));
            }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            } finally{
                try {
                    if (connection!=null) {
                        connection.close();
                    }
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
