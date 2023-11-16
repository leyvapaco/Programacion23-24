package u3.t3;

import java.util.Scanner;

public class ejemplosBurbuja {
	
	public static int[] burbuja1( int [ ] num )
    {
         int i;
         boolean flag = true;
         int temp;
         while ( flag )
         {
                flag = false;   
                for( i=0;  i < num.length -1;  i++ )
                {
                       if ( num[ i ] > num[i+1] )  
                       {
                               temp = num[ i ];
                               num[ i ] = num[ i+1 ];
                               num[ i+1 ] = temp;
                               flag = true; 
                      } 
                } 
          } 
         return num;
    }
	
	//Función equivalente a la anterior
	private static void burbuja2(int[] num) {
		
		int temp;
		
	    for (int i = 0; i < num.length; i++) {

	        for (int j = 0; j < num.length - 1; j++) {
	            if (num[j] > num[j+1]) {
	            	temp = num[ j ];
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
	            }
	        }
	    }
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		
	    final int TAM = 6;

	    int[] tabla = {5,3,7,6,2,1};
  
	    //Probar con ambas funciones y comprobar el resultado
	    burbuja1(tabla); 
	 //   burbuja2( alfa2 );
	    
	    for (int i=0; i<TAM; i++) {
	    	System.out.print("\n"+tabla[i]);
	    }

	 
	}	
}
