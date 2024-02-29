package u7.t1.act4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una oracion:");// Pido por consola una frase.
        String line = sc.nextLine();

        String[] ArrayPalabras = line.split(" ");// Creo el array , arraylist y arrayList para los repetidos.
        List<String> palabras = new ArrayList<String>();
        Set<String> palabrasRepes = new HashSet<String>();
        Set<String> palabrasDif = new HashSet<String>();

        for (String palabra : ArrayPalabras) {// Rellena el arraylist con los datos del array usando una variable auxiliar.
            palabras.add(palabra);
        }

        for (int i = 0; i < palabras.size(); i++) {
            boolean repetida = false;

            for (int j = 0; j < palabras.size(); j++) {
                if (i != j && palabras.get(i).equals(palabras.get(j))) {
                    palabrasRepes.add(palabras.get(i));
                    repetida = true;
                    break;
                }
            }

            if (!repetida) {
                palabrasDif.add(palabras.get(i));
            }
        }

        System.out.println("Esta es la oracion que ha introducido:");
        System.out.println(line);
        System.out.println("\n");
        System.out.println("Estas son las palabras que se repiten en la frase:");
        System.out.println(palabrasRepes);
        System.out.println("\n");
        System.out.println("Estas son las palabras que no se repiten:");
        System.out.println(palabrasDif);
        System.out.println("\n");
        System.out.println("Todas las palabras en la frase:");
        System.out.println(palabras);
    }
}	
	 
	 
	 
	 
 
 

