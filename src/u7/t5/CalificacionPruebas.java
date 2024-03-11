package u7.t5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public  class CalificacionPruebas {
	
	
	
	Scanner sc = new Scanner(System.in);
	static LinkedHashMap<Integer, ArrayList<Double>> listadoCalificaciones=new LinkedHashMap<Integer, ArrayList<Double>>();
	{
		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\oposiciones\\ids_aspirantes.dat"));
			
			while(true) {
			listadoCalificaciones.put(in.read(), new ArrayList<Double>());
			
			
			double nota=sc.nextDouble();
			listadoCalificaciones.get(in.read()).add(nota);
			in.close();
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	
static void guardarFichero(){
		
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\oposiciones\\calficiaciones.dat"));
			
			out.writeObject(listadoCalificaciones);
			out.flush();
			out.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
		
}

