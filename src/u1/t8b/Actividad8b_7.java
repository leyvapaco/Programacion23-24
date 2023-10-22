package u1.t8b;
// Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
import java.util.Scanner;

public class Actividad8b_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Escribe un numero por teclado: ");
    int n = sc.nextInt();
    int alReves = 0;
    int resto = 0;
    while (n > 0) {
      resto = n % 10;
      alReves = alReves * 10 + resto;
      n = n / 10;
    }
    System.out.println(alReves);
  }
}
