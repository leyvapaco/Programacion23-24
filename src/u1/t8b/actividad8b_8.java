package u1.t8b;

import java.util.Scanner;

public class actividad8b_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escibre la altura de la barra");
    int n = sc.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n; j++) {
        if ((j == 1) || (j == n)) {
          System.out.print("*");
        } else {
          System.out.printf(" ");
        }
      }
      System.out.println("");
    }
    for (int i = 1; i <= n; i++) {
      if ((i == 1) || (i == n)) {
        System.out.printf(" ");
      } else {
        System.out.printf("*");
      }
    }
  }
}
