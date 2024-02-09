package u6.ficheros.binarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjemploFIS2 {
	public static void main(String[] args) {

	try {
		FileInputStream archivo = new FileInputStream("C:\\pruebaficheros\\enteros.dat");
		FileInputStream archivo2 = new FileInputStream("C:\\pruebaficheros\\cadena.dat");
		 
		try {
			int [] tabla = new int[10];
			ObjectInputStream in = new ObjectInputStream(archivo);
		    tabla = (int[]) in.readObject();
			 
			for (int i = 0; i < tabla.length; i++) {
					System.out.println(tabla[i]);}
			in.close();
		} catch (ClassNotFoundException ex) {
			 System.out.println(ex.getMessage());}
			 
		 try {	
			 ObjectInputStream in = new ObjectInputStream(archivo2);
			 String cadena = (String) in.readObject();
			 System.out.println(cadena);
			 in.close();
		} catch (ClassNotFoundException ex) {
			 System.out.println(ex.getMessage());} 


		 
	}catch(IOException e){
			System.out.println("Error al leer el fichero!");}
	      
    }
}