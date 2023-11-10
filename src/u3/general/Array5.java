package u3.general;

import java.util.Scanner;

class Array5 {
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        final int TAM=50;
        
        int[] pares = new int[TAM];
        int j=0;
        
        for (int i=1; i<=100; i++)
        {
        	if (i%2==0) {
        		pares[j] = i;
        		j++;}
        }
        
         for (int k=0; k<pares.length; k++)
        	         {
           	System.out.println("datos["+k+"]:"+pares[k] );
        }
    }
}
 