package u3.general;

//Array4.java
//Leer y mostrar datos de un array, usando constantes
//Introducción a Java, Nacho Cabanes

import java.util.Scanner;

class Array4 {
 public static void main( String args[] ) {

     Scanner teclado = new Scanner(System.in);
     final int TAMANYO = 5;

     int[] datos = new int[TAMANYO];
     for (int i=0; i<TAMANYO; i++)
     {
         System.out.print( "Deme el dato "+i+": " );
         datos[i] = teclado.nextInt();
     }

     for (int i=TAMANYO-1; i>=0; i--)
     {
         System.out.println( "El dato "+ i +" vale " + datos[i] );
     }
 }
}