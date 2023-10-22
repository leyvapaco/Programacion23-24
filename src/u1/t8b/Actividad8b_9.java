package u1.t8b;

import java.util.Scanner;

public class Actividad8b_9 {
  public static void main(String[] args) {
	    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce altura:");

    int n = sc.nextInt();
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n + 1) / 2; j++) {
        if (i == n) {
          System.out.printf("*");
        }
      }
      System.out.println("*");
    }
  }
}
