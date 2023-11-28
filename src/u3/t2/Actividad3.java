package u3.t2;

/*
 Diseñar un programa que pida una frase al usuario, 
 e indique si el carácter de la posición central es o no 
 un espacio.
*/


import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Introduce la frase");
	    String frase=sc.nextLine();
	    
	    int posCentral=frase.length()/2;
	    
	    System.out.println("Longitud cadena:"+frase.length());
	    System.out.println("Posición central:"+posCentral);
	    
	    if (frase.charAt(posCentral)==(' ')) {
	    	System.out.println("Es un espacio");
	    }else {
	    	System.out.println("No es un espacio");
	    }    
	}
}
