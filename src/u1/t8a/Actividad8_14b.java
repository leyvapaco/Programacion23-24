package u1.t8a;
// Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello
// asteriscos (*).
// Por ejemplo, para n=4:
import java.util.Scanner;

//Triángulo

public class Actividad8_14b {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce altura:");
    int n = sc.nextInt();
    
    System.out.println("Introduce carácter de relleno:");
    String r = sc.next();
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
          }
    	
      for (int j = 1; j <= i; j++) {
        System.out.print(r);
      }
      System.out.println();
    }
  }
}
