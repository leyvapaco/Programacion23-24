package u1.arrancando;
import java.util.Scanner;

public class factorial {
	
	public static long factorial(long numero) {
		
		if (numero == 0)
			return 1;
		
		long factorial = 1;
		
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}
	
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print( "Introduzca número para el que quiere calcular el factorial: " );
	    
	    numero = teclado.nextInt();
	
		System.out.println("El factorial de "+numero+" es "+factorial(numero));
		System.out.println("Fin");
	}
}
