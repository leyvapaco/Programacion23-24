package u1.t8b;
// Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números
// enteros a
// partir de uno que se introduce por teclado.
import java.util.Scanner;

public class Actividad8b_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + " " + ((int) Math.pow(i, 2)) + " " + ((int) Math.pow(i, 3)));
    }
  }
}
