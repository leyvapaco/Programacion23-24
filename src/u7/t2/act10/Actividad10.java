package u7.t2.act10;

import java.util.HashSet;
import java.util.Set;

public class Actividad10 {

public static void main (String[]args) {
		
		Set<Integer> conjunto1 = new HashSet<>();
		
		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);
		
		Set<Integer> conjunto2 = new HashSet<>();
		
		conjunto2.add(3);
		conjunto2.add(4);
		conjunto2.add(5);
		
		Set<Integer> unionSet = interseccion(conjunto1, conjunto2);
        System.out.println("Intersección de conjunto1 y conjunto2: " + unionSet);
    }
		

	    public static <T> Set<T> interseccion(Set<T> conjunto1, Set<T> conjunto2) {
	        Set<T> interseccionSet = new HashSet<>(conjunto1);
	        interseccionSet.retainAll(conjunto2);
	        return interseccionSet;
	    }
}
