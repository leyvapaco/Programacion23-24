package t1.examen.copy; //Daniel

import java.util.Scanner;

public class Ejercicio2 {
	public static String pasarMayus(String cadena, char a) {
		// Suponemos que la cadena y el carácter que se nos dan son en minúsculas
		// Devolvemos la cadena reemplazando el carácter dado por su versión mayúscula usando .toUpperCase()
		return cadena.replace(a, Character.toUpperCase(a)); 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		char caracter;
		
		try {
			System.out.println("Introduce una cadena:");
			cadena=sc.nextLine(); // Recogemos la cadena a utilizar
			System.out.println("Introduce un carácter:");
			caracter=sc.next().charAt(0); // Recogemos el carácter a utilizar
		} catch (Exception e) {
			System.out.println("Respuesta no válida.");
			System.out.println("Introduce una cadena:");
			cadena=sc.nextLine();
			System.out.println("Introduce un carácter:");
			caracter=sc.next().charAt(0); 
		}
		
		// Por último llamamos a la función pasarMayus() y imprimimos nuestro mensaje
		System.out.println("La cadena resultante al poner la letra '"+caracter+"' en mayúsculas es '"+pasarMayus(cadena, caracter)+"'"); 
	}	
}
