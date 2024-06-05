package u9.examen.solucion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
       Connection con=Conexion.conectar();

        try{
            con.setAutoCommit(false);

            Employee empleado1 = new Employee(
                    9104,
                    "Alonso",
                    "Fernando",
                    "8181",
                    "alo@classicmodelcars.com",
                    "4",
                    1102,
                    "Piloto");
            
            Employee empleado2 = new Employee(
                    9105,
                    "Newey",
                    "Adrian",
                    "8181",
                    "alo@classicmodelcars.com",
                    "4",
                    1102,
                    "Ingeniero");
            
            EmployeeModel.insertEmployee(con,empleado1);
            EmployeeModel.insertEmployee(con,empleado2);

            System.out.println("Insertado empleado");
            
            empleado1.setOfficeCode("5");
            
            EmployeeModel.updateEmployeeOffice (con,empleado1);

            System.out.println("Modificada oficina del empleado1");  
            
            EmployeeModel.deleteEmployee(con, empleado2);
            
            System.out.println("Borrado empleado2");  

            con.commit();
               
        }catch (SQLException e){
            System.out.println("error: " +e.getMessage());
            try{
                if (con!=null){
                    System.out.println("Dejamos la BBDD en estado consistente.");
                    con.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
