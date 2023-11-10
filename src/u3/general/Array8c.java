package u3.general;

import java.util.Scanner;

class Array8c {
    public static void main( String args[] ) {
 
       String[][] coches = {{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}}; 
           
       for (int i=0; i<4; i++){
           for (int j=0; j<2; j++){  
        	   System.out.print("i:"+i+" j:"+j+" " );
        	   System.out.println(coches[i][j] );
       }
       	System.out.println();
    }
   }
}
 