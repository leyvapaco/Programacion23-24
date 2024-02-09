package u6.ficheros.texto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBW {
	public static void main(String[] args) {
		try {
			 BufferedWriter out = new BufferedWriter(new FileWriter("C:\\pruebaficheros\\Machado.txt"));
			 String cad = "Mi infancia son recuerdos de un patio de Sevilla";
			 for (int i = 0; i < cad.length(); i++) {
			 out.write(cad.charAt(i));
			 }
			 cad = "y un huerto claro donde madura el limonero";
			 out.newLine();
			 out.write(cad);
			 out.close();
			 } catch (IOException ex) {
			 System.out.println(ex.getMessage());
			 }
	}
}