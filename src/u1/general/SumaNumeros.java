package u1.general;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
		 
		int edad;
			
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print( "Introduce tu edad: " );
	    
			edad= teclado.nextInt();
		   
			if (edad>=18) {
		    	System.out.println( "Puedes pasar " );
		    } else {
		    	System.out.println( "No puedes pasar, eres menor de edad " );	    	
		    }
			
		} while (edad<18);
			
		System.out.println( "¡Bienvenido!, ¿qué desea tomar?" );
			
	}
}
