package u3.t2;

/*Introducir por teclado dos palabras 
 * e indicar cuál de ellas es la más corta.
 */

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
				
	    System.out.println("Introduce la primera palabra:");
	    String p1 = sc.nextLine();
	
	    System.out.println("Introduce la segunda palabra:");
	    String p2 = sc.nextLine();
	    
	    if (p1.length()<p2.length()) 
	    	System.out.println(p1+" es más corta");
	    else  if (p1.length()>p2.length()) 
	    	System.out.println(p2+" es más corta");	 
	    else
	    	System.out.println("son iguales");
	}
}
