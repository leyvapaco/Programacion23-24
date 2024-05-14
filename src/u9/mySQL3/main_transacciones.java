package u9.mySQL3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main_transacciones {
    public static void main(String[] args) {
       Connection con=Conexion.conectar();

        try{
            con.setAutoCommit(false);

            OfficeModel.insertOffice(con,
                    new Office(
                            "9",
                            "Sevilla",
                            "+34 955 123 123",
                            "Avda Castilleja",
                            "default",
                            "",
                            "Spain",
                            "41940",
                            "EMEA"));

            System.out.println("Insertada oficina");

            EmployeeModel.insertEmployee(con,
                    new Employee(
                            9000,
                            "Perez",
                            "Paco",
                            "8181",
                            "pacoperez@classicmodelcars.com",
                            "9",
                            1102,
                            "Comercial"));
           
            System.out.println("Insertado empleado");


            EmployeeModel.insertEmployee(con,
                    new Employee(
                            9001,
                            "Molina",
                            "Pedro",
                            "8181",
                            "pedromolina@classicmodelcars.com",
                            "1",
                            1102,
                            "Comercial"));

            System.out.println("Insertado empleado");
            
             EmployeeModel.updateEmployeeEmail (con,
                    new Employee(
                            9001,
                            "Molina",
                            "Pedro",
                            "8181",
                            "pedromolina@gmail.com",
                            "1",
                            1102,
                            "Comercial"));

            System.out.println("Modificado empleado");
            

            ClienteModel.insertCliente(con,
                    new Cliente(
                            500,
                            "miEmpresa",
                            "apellido",
                            "nombre",
                            "609876543",
                            "Avda",
                            "Avda2",
                            "Tomares",
                            "Sevilla",
                            "41940",
                            "Spain",
                            1002,
                            0));

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
