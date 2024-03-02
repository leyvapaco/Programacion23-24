package u7.t2.act12;

import java.util.HashSet;
import java.util.Set;

public class Actividad12 {

	public static void main (String[]args) {
		
		Set<Integer> conjunto1 = new HashSet<>();
		
		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);
		
		Set<Integer> conjunto2 = new HashSet<>();
		
		//conjunto2.add(1);
		conjunto2.add(2);
		conjunto2.add(3);
		conjunto2.add(4);
		conjunto2.add(5);
	    System.out.println("¿El conjunto1 está incluido en conjunto2? " + incluido(conjunto1, conjunto2));
	}

	public static <T> boolean incluido(Set<T> conjunto1, Set<T> conjunto2) {
        return conjunto2.containsAll(conjunto1);
    }

}
