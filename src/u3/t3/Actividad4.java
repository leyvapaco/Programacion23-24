package u3.t3;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		
	    final int TAM = 4;

	    boolean acertado=false;

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
	    	
	    	for (int i=0; i<TAM; i++) {
	    		combinacion[i] = sc.nextInt();
	    	}
	    	
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
