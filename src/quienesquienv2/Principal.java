package quienesquienv2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;



public class Principal {
	public static void main(String[] args) {
			
		Personaje personaje1=new Personaje();
		Personaje personaje2=new Personaje();
		
		personaje1=cargaJSON ("personaje1");
		System.out.println("\n"+personaje1);
		
		personaje1.damePista();
		
		personaje2=cargaJSON ("personaje2");
		System.out.println("\n"+personaje2);
		
		personaje2.damePista();

	}
	
	public static Personaje cargaJSON (String nomFichero){

	     // Creo una instancia de GSON
        Gson gson = new Gson();

        // Leo el fichero
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("src\\quienesquienv2\\"+nomFichero+".json"))) {
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
