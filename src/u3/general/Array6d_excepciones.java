package u3.general;
import java.util.Scanner;

/*función y paso por referencia*/


class Array6d_excepciones {
	
	public static void escribeArray(int[] datos) {
		datos[49]=8;
		System.out.println("La longitud del array es:"+datos.length);
		
        /*for (int i=0; i<datos.length; i++)
        System.out.println("Datos["+i+"]:"+datos[i] );*/
   	}
	
	
    public static void main( String args[] ) {
    	
        final int TAM=50;      
        int[] datosPares = new int[TAM];
        int[] datosImpares = new int[TAM];        
        int j=0;
        int k=0;
        
        try {
        
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
 
        	escribeArray(datosPares);
        	//   escribeArray(datosImpares);
        
        
        	System.out.println("---------------");
        	for (int i=1; i<datosPares.length; i++)
        		System.out.println("Pares["+i+"]:"+datosPares[i] );
    
        }    catch (Exception e)  {
    		System.out.println("Error inesperado:"+e.getMessage());
    		System.out.println("Vuelva en unos minutos"); 
 		}
    }
}
 