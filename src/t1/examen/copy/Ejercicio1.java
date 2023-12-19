package t1.examen.copy; //Iván

import java.util.Scanner;

public class Ejercicio1 {
	//FUNCIÓN DE CONFIRMACIÓN A TRAVÉS DE UN STRING
	public static boolean confirmacion(String respuesta) {
		//DECLARACIÓN DE VARIABLES
		boolean confirmacion = false;
		
		//SWITCH QUE NOS SELECCIONARÁ LAS OPCIONES CORRECTAS Y EL ESTADO DEL BOOLEANO
		switch (respuesta) {
		case "s", "S" , "si" , "SI", "j", "ja", "YA":
			System.out.println("Respuesta aceptada, usted ha confirmado.");
			confirmacion = true;
			break;
			
		case "n", "N", "no", "NO", "nein","Nein":
			System.out.println("Respuesta aceptada, usted no ha confirmado.");
			confirmacion = true;
			break;
		
		default:
			System.out.println("Respuesta no aceptada. Inténtelo de nuevo.");
			confirmacion = false;
			break;
		}
		return confirmacion;
	}
	
	public static void main(String[] args) {
		//DECLARACIÓN DE VARIABLES
		String respuesta;
		Scanner sc = new Scanner(System.in);
		
		//BUCLE WHILE IMPLEMENTANDO LA FUNCIÓN
		do {
			System.out.println("¿Desea confirmar?");
			respuesta = sc.next();
		}while(confirmacion(respuesta) == false); //condición para que el bucle while se repita
		sc.close();
	}
}
