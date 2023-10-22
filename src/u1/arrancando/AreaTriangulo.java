package u1.arrancando;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base en cm: ");
        int base = teclado.nextInt();
   
        System.out.print("Introduce la altura en cm: ");
        int altura = teclado.nextInt();
  
        float area= (float) base* altura /2;
        
        System.out.println("El area es: "+area+" cm2");
    }
}
