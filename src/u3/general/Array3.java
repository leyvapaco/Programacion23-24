package u3.general;

import java.util.Scanner;

class Array3 {
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
 
        int[] datos = new int[5];
        for (int i=0; i<5; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }
 
        for (int i=4; i>=0; i--)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }
    }
}
 