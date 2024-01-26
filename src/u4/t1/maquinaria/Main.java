package u4.t1.maquinaria;

import java.util.Scanner;

import u4.t1.ferroviaria.JefeEstacion;
import u4.t1.ferroviaria.Maquinista;
import u4.t1.ferroviaria.Mecanico;
import u4.t1.ferroviaria.Personal;

public class Main {
	public static void main(String[] args) {
			
			//ACTIVIDAD 9
			Maquinista maquinista1 = new Maquinista("AA", "12568932U", 15478, "Rango 3");
			Mecanico mecanico1 = new Mecanico("ABC", "45576832G", "Frenos");
			JefeEstacion jefe1 = new JefeEstacion("CDF", "35678921X");
			
			Vagon vagon1 = new Vagon(4321, 288, "Carbón");
			Vagon vagon2 = new Vagon(4322, 588, "Madera");
			
			Locomotora locomotora1 = new Locomotora("2467 SCP", 7600,"2010", mecanico1);
			Tren tren1 = new Tren(locomotora1, maquinista1);
			
			tren1.addVagon(vagon1);
			tren1.addVagon(vagon2);
			
			
			//INFO DEL PERSONAL
			System.out.println();
			System.out.println("--INFO MAQUINISTA--");
			maquinista1.getInfoPersonal();
			System.out.println("\n---INFO MECANICO---");
			mecanico1.getInfoPersonal();
			System.out.println("\n-----INFO JEFE-----");
			jefe1.getInfoPersonal();
			
			
			//INFO DE LAS MAQUINAS
			System.out.println();
			System.out.println("\n----INFO VAGÓN-----");
			vagon1.getInfoMaquinaria();
			System.out.println("\n----INFO VAGÓN-----");
			vagon2.getInfoMaquinaria();
			System.out.println("\n--INFO LOCOMOTORA--");
			locomotora1.getInfoMaquinaria();
	
			//INFO DEL TREN
			System.out.println();
			System.out.println("\n----INFO TREN-----");
			tren1.getInfoMaquinaria();	
			tren1.acelera();
			tren1.frena();
			
			System.out.println("\n----INSTANCE OF-----");
			
			Personal per1=new Personal("Paco","24.345.678D");

			//Prueba a comentar la linea anterior
			// y descomentar la siguiente y observa la salida
			//Personal per1=new JefeEstacion("Paco","24.345.678D");
			
			// Añado un objeto de tipo Personal
			// para ver uso de instanceof 
			// y sobrecarga de método de Object toString()
			
			if (per1 instanceof JefeEstacion) {
				System.out.println(per1.getClass().toString());
			}
		
			
			System.out.println(per1.toString());
			
	}
}
