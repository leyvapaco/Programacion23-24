package u7.t2.act14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
        List<Character> cadena = leeCadena();
        System.out.println("La cadena ingresada es: ");
        for (char c : cadena) {
            System.out.print(c+"\n");
        }
    }

    public static List<Character> leeCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String input = scanner.nextLine();
        List<Character> caracteres = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            caracteres.add(input.charAt(i));
        }

        return caracteres;
    }

}
