package quienesquienv3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;



public class Principal {
	public static void main(String[] args) {
		
		Tablero tablero1= new Tablero();
		Personaje personaje1=new Personaje();
		Personaje personaje2=new Personaje();
		
		personaje1=cargaJSON ("personaje1");
		System.out.println("\n"+personaje1);
				
		personaje2=cargaJSON ("personaje2");
		System.out.println("\n"+personaje2);
			
		tablero1.addPersonaje(personaje1);
		tablero1.addPersonaje(personaje2);
		
		System.out.println("\n"+tablero1);
		

	}
	
	public static Personaje cargaJSON (String nomFichero){

	     // Creo una instancia de GSON
        Gson gson = new Gson();

        // Leo el fichero
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("src\\quienesquienv3\\"+nomFichero+".json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Creo una persona desde JSON
        Personaje personaje = gson.fromJson(fichero, Personaje.class);

        return(personaje);

	}
	
}
