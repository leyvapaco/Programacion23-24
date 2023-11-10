package u3.general;

import java.util.Scanner;

class Array8b {
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        String[] coches = {"kia","renault","seat","audi"}; 
        /*
        coches[0]="kia"; 
        coches[1]="renaut";*/
           
        for (int i=0; i<coches.length; i++){
           	System.out.println("Marca:"+coches[i] );
           	if (coches[i].equals("kia")) 
         	System.out.println("Modelo sportage");
         	System.out.println();
        }
    }
}
 