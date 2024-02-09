package u6.ficheros.texto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFR {
public static void main(String[] args) {
	 String texto ="";	
	
	 try {
		 FileReader in = new FileReader("C:\\pruebaficheros\\usuarios.txt");
	 
		 int c = in.read();
		 while (c != -1) {
			 texto += (char) c;
			 c = in.read();
		 }
		 in.close();
		 
		 } catch (IOException ex) {
		 System.out.println(ex.getMessage());
		 }
	 	System.out.println(texto);
	}
}
