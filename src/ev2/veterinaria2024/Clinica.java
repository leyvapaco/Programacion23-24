package ev2.veterinaria2024;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Clinica {

	private Map<Animal,Set<Consulta>> mapaConsultas; 
	private  Set<Perro> setPerros; //Para poder resolver perrosByRaza()
	
	public Clinica(){
		this.mapaConsultas= new LinkedHashMap<Animal,Set<Consulta>>();
		this.setPerros= new TreeSet<Perro>();
	}
	
	
	public void addConsulta( Consulta consulta) {
      
		Animal clave= consulta.getAnimal(); //La clave del mapa es un Animal
		
		if (!mapaConsultas.containsKey(clave)) { //Si no existe creamos la entrada en el mapa
			mapaConsultas.put(clave, new HashSet<Consulta>());
	    }
		mapaConsultas.get(clave).add(consulta);
		
		//Si es un perro, lo añadimos al set de Perros
		if  (clave instanceof Perro) {
			 setPerros.add((Perro) clave);
		}
		System.out.println("Añadida consulta para "+consulta.getAnimal());
      
	}	
	
	
	public void getConsultas( Animal animal) {
	      
		if (mapaConsultas.containsKey(animal)) {
			
			//Necesitamos las consultas por orden de inserción: LinkedHashSet
			Set<Consulta> listaConsultas = new LinkedHashSet<>(mapaConsultas.get(animal));
			
			Iterator<Consulta> it = listaConsultas.iterator();
			
			System.out.println("\nConsultas realizadas a "+animal.toString());
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
			
	    } else
	    	System.out.println("No se encontraron consultas");
      
	}	
	
	public  void perrosByRaza() {
		System.out.println("\nPerros ordenados por raza:");
		System.out.println(setPerros); //Usa el orden establecido en el compareTo de Perro.java
	}
	
	public void aFichero() {//Vuelca en un fichero las claves del mapa, esto es, los Animales

        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("veterinaria2024.dat"));

            Iterator  itr = mapaConsultas.entrySet().iterator();
            
            while (itr.hasNext()) {
                Map.Entry e = (Map.Entry) itr.next();
                Animal animal = (Animal) e.getKey();
                s.writeObject(animal);
            }
            s.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        System.out.println("\nFichero creado (animales que han asistido a consulta)");
    }

}
