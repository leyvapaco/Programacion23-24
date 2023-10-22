package u1.t8b;

import java.util.Scanner;

public class Actividad8b_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escibre un numero por teclado: ");
    int n = sc.nextInt();
    int fibo = 0;
    int num = 1;
    int n_ant = 0;
    int i;
    for (i = 0; i <= n; i++) {
      System.out.print(fibo + " ");
      fibo = n_ant + num;
      n_ant = num;
      num = fibo;
    }
  }
}
