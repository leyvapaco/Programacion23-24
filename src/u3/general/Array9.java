package u3.general;

import java.util.Arrays;
import java.util.Collections;

class Array9 {
 public static void main( String args[] ) {

	 Integer [] numeros = {105, 7, 156, 40};

	 for (int i : numeros) {
	 	System.out.println("El valor es: " + i + ".");
	 }
	
	 /*****************/
	 System.out.println();
	 System.out.println("Menor a mayor:");
	 
	 Arrays.sort(numeros);

	 
	 for (int i : numeros) {
		 System.out.println("El valor es: " + i + ".");
	 }
	 
	 /*****************/
	 System.out.println();
	 System.out.println("Mayor a menor:");
	 
	 Arrays.sort(numeros, Collections.reverseOrder());

	 for (int i : numeros) {
		 System.out.println("El valor es: " + i + ".");
	 }
	 
	 
 }
}