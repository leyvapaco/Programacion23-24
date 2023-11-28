package u3.t2;

/* Diseñar una actividad que pida al usuario que introduzca una 
 * frase por teclado e indique cuántos espacios en blanco tiene.
 */

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		
		
	    System.out.println("Introduce la frase:");
	    String frase = sc.nextLine();
	    int contador=0;
	    
	    for (int i=0; i<frase.length();i++) {
	    	if (frase.charAt(i)==' ')
	    		contador++;
	    }
	    System.out.println("La frase tiene "+contador+" espacios");
	
	}
}
