package u1.arrancando;

import java.util.Scanner;

public class MayorEdad {
	public static void main(String[] args) {
		 
		int primerNumero;
		int segundoNumero;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print( "Introduzca el primer número: " );
	    
	    primerNumero = teclado.nextInt();
	    System.out.print( "Introduzca el segundo número: " );
	    segundoNumero = teclado.nextInt();
	 
	    System.out.print( "Su suma es: " );
	    System.out.println( primerNumero+segundoNumero );
		
	}
}
