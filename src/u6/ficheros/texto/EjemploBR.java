package u6.ficheros.texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBR {
	public static void main(String[] args) {
		 String texto ="";	
		 try {
			 BufferedReader in = new BufferedReader(new FileReader("C:\\pruebaficheros\\usuarios.txt"));

			 String linea = in.readLine();
			 while (linea != null) {
			 texto += linea+"\n";
			 linea = in.readLine();
			 }
			 in.close();
			 } catch (IOException ex) {
			 System.out.println(ex.getMessage());
			 }
			 System.out.println(texto);
		
	}
}