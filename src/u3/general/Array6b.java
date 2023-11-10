package u3.general;
import java.util.Scanner;

class Array6b {
    public static void main( String args[] ) {
    	
        final int TAM=50;      
        int[] datosPares = new int[TAM];
        int[] datosImpares = new int[TAM];        
        int j=0;
        int k=0;
        
        for (int i=1; i<100; i++)
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

        for (int i=0; i<TAM; i++)
           	System.out.println("Pares["+i+"]:"+datosPares[i] );
 
        System.out.println("--------------------");           	
       
        /* También podemos usar la longitud del array (.length) en lugar de la constante:*/
        
        for (int i=0; i<datosImpares.length; i++)
           	System.out.println("Impares["+i+"]:"+datosImpares[i] );    
    }
}
 