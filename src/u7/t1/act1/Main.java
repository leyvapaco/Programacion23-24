package u7.t1.act1;


/*Crear una colección de 20 números enteros aleatorios menores que 100, 
y guardarlos en el orden en que se vayan generando;
mostrar por pantalla dicha lista una vez creada.
Ordenarla en sentido creciente y volverla a mostrar por pantalla.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i <= 20; i++) {
            Integer num = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            lista.add(num);
        }

        System.out.println("Lista de números aleatorios:");
        lista.forEach(elemento -> System.out.print(elemento+", "));// Imprimir la lista de números aleatorios
        
        //Alternativa para imprimir toda la lista
        //System.out.println("\n"+l);
        
        
        System.out.println("\n");
        Collections.sort(lista); // Ordenar la lista
        
        System.out.println("\nLista de números ordenados:");
        lista.forEach(elemento -> System.out.print(elemento+", ")); // Imprimir la lista de números ordenados
    
        //Actividad 2. Orden inverso
        Collections.reverse(lista); // Invertir la lista
        System.out.println("\n\nLista de números ordenados decreciente:");
        System.out.println(lista);
    
    }
}
