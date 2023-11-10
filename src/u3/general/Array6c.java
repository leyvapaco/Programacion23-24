package u3.general;
import java.util.Scanner;

class Array6c {
    public static void main( String args[] ) {
    	
        final int TAM=50;      
        int[] datosPares = new int[TAM];
        int[] datosImpares = new int[TAM];        
        int j=0;
        int k=0;
              
        for (int i=1; i<=100; i++)
        {
        	if (i%2==0) {
        		datosPares[j] = i;
        		j++;
        	}   	
        	else {
        		datosImpares[k] = i;
        		k++;    		
        	}	
        }      
        
        Scanner teclado = new Scanner(System.in);
        boolean opcionIncorrecta;
            	
        do {
        
        	opcionIncorrecta=false;
        	System.out.println("Indique orden de visualización ascendente/descendente:");
        	String opcion= teclado.nextLine(); 
        	
       
        	switch(opcion) {
    		case "ascendente":
    			
    	        for (int i=0; i<TAM; i++)
    	           	System.out.println("Pares["+i+"]:"+datosPares[i] );
    	 
    	        System.out.println("--------------------");           	
    	       
    	        for (int i=0; i<TAM; i++)
    	           	System.out.println("Impares["+i+"]:"+datosImpares[i] );    
    	    break;
    		
    		case "descendente":
    			
    			for (int i=TAM-1; i>=0; i--)
    	           	System.out.println("Pares["+i+"]:"+datosPares[i] );
    	 
    	        System.out.println("--------------------");           	
    	       
       	        for (int i=TAM-1; i>=0; i--)
    	           	System.out.println("Impares["+i+"]:"+datosImpares[i] );    
        	    break;
        	    
        	default:
        		opcionIncorrecta=true;
        		System.out.println("Opción no válida");
        	}
        } while (opcionIncorrecta==true);
     }
}
 