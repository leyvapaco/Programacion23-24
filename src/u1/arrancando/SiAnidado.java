package u1.arrancando;

import java.util.Scanner;

public class SiAnidado {
	public static void main(String[] args) {
		 
		int edad;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print( "Introduzca la edad: " );
	    
	    edad = teclado.nextInt();
	
	    if (edad>60) {
	    	System.out.println("Es mayorcete");
	    	if (edad>70)
	    		System.out.println("Tiene más de 70");	    		
	    }	    
	    else if (edad>40)
	    	System.out.println("Es madurito");
	    	else if (edad>20)
	    		System.out.println("Está en la flor de la vida");
	    		else
	    		System.out.println("Es demasiado joven");    		
		
	}
}
