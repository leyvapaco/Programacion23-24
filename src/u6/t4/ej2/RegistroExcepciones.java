package u6.t4.ej2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Clase para registrar excepciones en un archivo de registro
public class RegistroExcepciones {
    // Método para registrar excepciones en el archivo de registro
    public static void registrarExcepcion(String codigo, String mensaje) {
    	String ruta = "C:\\pruebaficheros\\";
        String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String registro = fechaHora + " - " + codigo + " - " + mensaje;
        try {
            FileWriter writer = new FileWriter(ruta + generarNombreArchivo(), true);
            writer.write(registro + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para generar el nombre del archivo de registro con la fecha y hora actual
    private static String generarNombreArchivo() {
        String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        return "log_" + fechaHora + ".log";
    }
}