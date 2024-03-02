package u7.t2.act11;

import java.util.HashSet;
import java.util.Set;

public class Actividad11 {

public static void main (String[]args) {
		
		Set<Integer> conjunto1 = new HashSet<>();
		
		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);
		
		Set<Integer> conjunto2 = new HashSet<>();
		
		conjunto2.add(3);
		conjunto2.add(4);
		conjunto2.add(5);
		
		Set<Integer> unionSet = diferencia(conjunto1, conjunto2);
        System.out.println("Unión de conjunto1 y conjunto2: " + unionSet);
    }
		

	    public static <T> Set<T> diferencia(Set<T> conjunto1, Set<T> conjunto2) {
	        Set<T> diferenciaSet = new HashSet<>(conjunto1);
	        diferenciaSet.removeAll(conjunto2);
	        return diferenciaSet;
	    }

}
