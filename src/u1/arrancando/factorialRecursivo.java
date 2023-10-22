package u1.arrancando;

import java.util.Scanner;

public class factorialRecursivo {
	
	public static long factorial(long numero) {
		if (numero <= 1)
			return 1;
		return numero * factorial(numero - 1);
	}
	
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print( "Introduzca número para el que quiere calcular el factorial: " );
	    
	    numero = teclado.nextInt();
	
		System.out.println("El factorial de "+numero+" es "+factorial(numero));
	}
}
