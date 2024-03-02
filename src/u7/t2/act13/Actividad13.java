package u7.t2.act13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Actividad13 {
	
	public static void main(String[] args) {
		
        List<Integer> lista1 = new ArrayList <>();
        
        lista1.add(3);
        lista1.add(1);
        lista1.add(4);
        lista1.add(2);
        
        List<Integer> lista2 = new ArrayList <> () ;
        
        lista2.add(7);
        lista2.add(4);
        lista2.add(6);
        lista2.add(5);
        
        Collections.sort(lista1);
        Collections.sort(lista2);
        
        List<Integer> fusion = fusionarListas(lista1, lista2);

        System.out.println("Lista fusionada: " + fusion);
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
    }

    public static List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> fusion = new ArrayList<>();
        int i = 0, j = 0;

        // Agregar los elementos de lista1
        while (i < lista1.size()) {
            fusion.add(lista1.get(i));
            i++;
        }

        // Agregar los elementos de lista2
        while (j < lista2.size()) {
            fusion.add(lista2.get(j));
            j++;
        }

        return fusion;
    }

}
