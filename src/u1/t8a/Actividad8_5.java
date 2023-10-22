package u1.t8a;

import java.util.Scanner;

public class Actividad8_5 {
	
	// Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
	// A continuación, solicitará por teclado un valor que debe estar dentro del rango.
	// Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
	
	public static void main (String[] arg) {
		

		Scanner sc = new Scanner(System.in);
		
		int maxValue;
		int minValue;
		int valorIntroducido;
		
		
		System.out.println("Introduce el valor máximo del rango: ");
		
		maxValue=sc.nextInt();
		
		
		System.out.println("Introduce el valor mínimo del rango: ");
		
		minValue=sc.nextInt();
		
		System.out.println("Introduce un valor dentro del rango: ");
		
		valorIntroducido=sc.nextInt();
		
		while ((valorIntroducido > maxValue) || (valorIntroducido < minValue)) {
		
		System.out.println("Valor introducido incorrecto, por favor introduce un valor dentro del rango: ");
		
		valorIntroducido=sc.nextInt();
		
	} 
		System.out.println("Valor introducido correcto.");
		
	
	}
	
	
	


}
