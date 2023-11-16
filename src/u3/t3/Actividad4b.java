package u3.t3;

import java.util.Scanner;

public class Actividad4b {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
	
	    boolean acertado=false;
	    
	    System.out.println('7'-'0');
	    
	    
	    System.out.println("¿Cuántos dígitos quieres para la clave:?");
		int digitos = sc.nextInt();
		
		final int TAM=digitos;
	    int[] clave = new int[TAM];
	    int[] combinacion = new int[TAM];
	    
    	System.out.println("Clave generada:");
	    for (int i=0; i<TAM; i++) {
	    	clave[i]=(int)(Math.random()*5+1); 
	    	System.out.print(clave[i]);
	    }
	    	
	    while(!acertado) {
	    	acertado=true;    
	
	    	System.out.println("\nIntroduce combinación (pulse intro después de cada dígito):");
	    	String teclado = sc.next(); //Leemos la cadena
	    	
	    	System.out.println("ascii:"+(int)teclado.charAt(0));
	    	    	
	       	for (int i=0; i<TAM; i++) {
	    		combinacion[i]=teclado.charAt(i)-'0';
	    	}
	       	
	    	/* alternativa
	    	 
	    	for (int i=0; i<TAM; i++) {
		    	combinacion[i]=Character.getNumericValue(teclado.charAt(i));
	    	}*/
	    	
	 	    	
	    	for (int i=0; i<TAM; i++) {
	    		if(combinacion[i]>clave[i]) {
	    			System.out.println(combinacion[i]+" es mayor");
	    			acertado=false;
	    		}
	    		else if(combinacion[i]<clave[i]) {
	    				System.out.println(combinacion[i]+" es menor");
	    				acertado=false;
	    			 }
	    			 else 
	    				System.out.println(combinacion[i]+" es igual");
	    	}   
    	}
    	System.out.println("¡Has acertado!");
	}
}	
