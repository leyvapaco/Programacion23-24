package u7.t1.act2;


/* Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <= 20; i++) {
            Integer num = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            lista.add(num);
        }

        System.out.println("Lista de números aleatorios:");
        lista.forEach(num -> System.out.print(num+", "));// Imprimir la lista de números aleatorios
        
        System.out.println("\n");
        Collections.sort(lista); // Ordenar la lista
        
        
        System.out.println("\nLista de números ordenados Asc:");
        lista.forEach(num -> System.out.print(num+", ")); // Imprimir la lista de números ordenados
        
        System.out.println("\n");
      
        Collections.reverse(lista); // Invertir la lista
        
       // ComparadorInverso c = new ComparadorInverso();
       //  Collections.sort(l,c); // Ordenar la lista inversa
        
               
        System.out.println("\nLista de números ordenados Desc:");
        lista.forEach(num -> System.out.print(num+", ")); // Imprimir la lista de números ordenados
    }
}
