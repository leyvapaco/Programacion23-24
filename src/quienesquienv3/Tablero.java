package quienesquienv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//v4: Añadimos atributo y método para establecer aleatoriamente un personaje secreto

public class Tablero {
	HashSet<Personaje> setPersonajes;
	Map<String,ArrayList<String>> mapaPistas;

	
	public Tablero() {
		setPersonajes= new HashSet();
		mapaPistas= new HashMap<String,ArrayList<String>>();
		
	}
	
	
	public void addPersonaje(Personaje p) {
		setPersonajes.add(p);
		
		ArrayList<Pista> pistas = p.dameTodasLasPistas();							
				
		for (Pista pista:pistas){
					
			if (mapaPistas.containsKey(pista.getAtributo())) {
				ArrayList<String> personajes = mapaPistas.get(pista.getAtributo());
				personajes.add(p.getIdentidad());			
				mapaPistas.put(pista.getAtributo(),personajes);
			}else {
				ArrayList<String> personajes = new ArrayList();
				personajes.add(p.getIdentidad());	
				mapaPistas.put(pista.getAtributo(),personajes);
			}		
		}
	}
	
	
	@Override
	public String toString() {
		return "Tablero [setPersonajes=" + setPersonajes + "\n\nmapaPistas=" + mapaPistas + "]";
	}
	
}
