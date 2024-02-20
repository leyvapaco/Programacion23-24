package u6.t4.ej2;


//Clase Main
public class Main {
 public static void main(String[] args) {
     try {
         // Creamos un cliente con edad incorrecta
         Cliente cliente1 = new Cliente("Juan", -33);
     } catch (EdadErroneaException e) {
         RegistroExcepciones.registrarExcepcion("EX001", e.getMessage());
         System.out.println("Error: " + e.getMessage());
     } catch (MenorDeEdadException e) {
         RegistroExcepciones.registrarExcepcion("EX002", e.getMessage());
         System.out.println("Error: " + e.getMessage());
     }

     try {
         // Creamos un cliente menor de edad
         Cliente cliente2 = new Cliente("Pedro", 16);
     } catch (EdadErroneaException e) {
         RegistroExcepciones.registrarExcepcion("EX001", e.getMessage());
         System.out.println("Error: " + e.getMessage());
     } catch (MenorDeEdadException e) {
         RegistroExcepciones.registrarExcepcion("EX002", e.getMessage());
         System.out.println("Error: " + e.getMessage());
     }
 }
}
