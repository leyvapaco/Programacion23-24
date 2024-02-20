package u6.t4.ej2;

//Excepción para edad incorrecta
class EdadErroneaException extends Exception {
 public EdadErroneaException(String mensaje) {
     super(mensaje);
 }
}

//Excepción para menor de edad
class MenorDeEdadException extends Exception {
 public MenorDeEdadException(String mensaje) {
     super(mensaje);
 }
}
//Clase Cliente
public class Cliente {
 private String nombre;
 private int edad;

 public Cliente(String nombre, int edad) throws EdadErroneaException, MenorDeEdadException {
     if (edad < 0 || edad > 100) {
         throw new EdadErroneaException("Imposible crear el cliente. La edad debe estar entre 0 y 100 años. (Edad indicada: " + edad + ")");
     } else if (edad < 18) {
         throw new MenorDeEdadException("Imposible crear el cliente. El cliente no puede ser menor de edad. (Edad indicada: " + edad + ")");
     }
     this.nombre = nombre;
     this.edad = edad;
 }

 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }
}

