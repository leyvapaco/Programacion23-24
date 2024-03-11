package u7.t5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Scanner;

public  class IntroducirAspirante implements Serializable{

	private static final long serialVersionUID = 4L;
	Scanner sc = new Scanner(System.in);
	static int numAspirantes=0;
	
	
	static LinkedHashMap<Integer, Aspirante> listadoAspirantes = new LinkedHashMap<Integer, Aspirante>();
	
	
	
	void InsertaAspirante(){
		
		boolean finalizado=false; 
		String nombre;
		String dni; 
		String tlf;
		do {
		numAspirantes+=1;
		System.out.println("Introduce el nombre del aspirante");
		nombre=sc.nextLine();
		System.out.println("Introduce el dni del aspirante");
		dni=sc.nextLine();
		System.out.println("Introduce el telefono del aspirante");
		tlf=sc.nextLine();
		
		listadoAspirantes.put(numAspirantes, new Aspirante(nombre, dni, tlf));
		 
		 System.out.println("¿Quiere introudcir otro aspirante? S/N");
		 String continuar=sc.next();
		 if (continuar.equalsIgnoreCase("n"))
			 finalizado=true;
		 }while(!finalizado);
		
		System.out.println("Guardando Ficheros...");
		
		IntroducirAspirante.guardarFichero();
	}
	
	
	
	static void guardarFichero(){
		
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\oposiciones\\aspirantes.dat"));
			
			out.writeObject(listadoAspirantes);
			out.flush();
			out.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\oposiciones\\ids_aspirantes.dat"));
			
			out.writeObject(listadoAspirantes.keySet());
			out.flush();
			out.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}


