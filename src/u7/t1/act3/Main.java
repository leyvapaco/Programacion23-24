package u7.t1.act3;
/*Crear una colección de 20 números enteros aleatorios menores que 10,
 *  guardarlos por orden decreciente a medida 
 *  que se vayan generando y mostrar la colección por pantalla.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Integer num = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
            boolean insertado = false;
            for (int j = 0; j < lista.size(); j++) {
                if (num > lista.get(j)) {
                    lista.add(j, num);
                    insertado = true;
                    break;
                }
            }
            if (!insertado) {
                lista.add(num);
            }
        }

        System.out.println("Lista de números aleatorios:");
        lista.forEach(num -> System.out.print(num + ", ")); // Imprimir la lista de números aleatorios
    }
}
