package u7.t5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Aprobados {
	static LinkedHashMap<Integer, ArrayList<Double>> listadoCalificaciones=new LinkedHashMap<Integer, ArrayList<Double>>();
	static LinkedHashMap<Integer, Aspirante> listadoAspirantes = new LinkedHashMap<Integer, Aspirante>();
	HashMap<Aspirante, Double> notas = new HashMap();
	{
	
	try {
		
		 ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\oposiciones\\calficiaciones.dat"));
		 
		listadoCalificaciones = (LinkedHashMap<Integer, ArrayList<Double>>) in.readObject();
		 
		 
		
	}catch(IOException | ClassNotFoundException e ) {
		System.out.println(e.getMessage());
	}
	
	try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\oposiciones\\aspirantes.dat"));
		
		listadoAspirantes = (LinkedHashMap<Integer, Aspirante>) in.readObject();
		
	}catch(IOException | ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
	
	double calcularMedia(Integer id_aspirante) {
		double media=0;
		double sumatorio=0;
		ArrayList<Double> aux = listadoCalificaciones.get(id_aspirante);
		
		Iterator<Double> it =  aux.iterator();
		while (it.hasNext()) {
			
			sumatorio+=it.next();

		}
		try {
		media = sumatorio/aux.size();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return media;
	}
	
	void crearTabla(LinkedHashMap<Integer, Aspirante>listadoAspirantes, LinkedHashMap<Integer, ArrayList<Double>> listadoCalificaciones){
		
		
		
		
		for (Integer index : listadoAspirantes.keySet()) {
			
		Aspirante aux = listadoAspirantes.get(index);
		 
				
		notas.put(aux, calcularMedia(index));
			
			
		}
		
		
		
	}

	@Override
	public String toString() {
		
		for (Aspirante aspirante : notas.keySet()) {
			
			
			
		}
		
		
		return "Aprobados [toString()=" + super.toString() + "]";
	}
	
	
}
