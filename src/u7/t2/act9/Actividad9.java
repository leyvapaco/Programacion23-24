package u7.t2.act9;

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {

	public static void main (String[]args) {
		
		Set<Integer> conjunto1 = new HashSet<>();
		
		conjunto1.add(3);
		conjunto1.add(2);
		conjunto1.add(7);
		
		Set<Integer> conjunto2 = new HashSet<>();
		
		conjunto2.add(3);
		conjunto2.add(6);
		conjunto2.add(8);
		
		Set<Integer> unionSet = union(conjunto1, conjunto2);
        System.out.println("Unión de conjunto1 y conjunto2: " + unionSet);
    }
		

	    public static <T> Set<T> union(Set<T> conjunto1, Set<T> conjunto2) {
	        Set<T> unionSet = new HashSet<>(conjunto1);
	        unionSet.addAll(conjunto2);
	        return unionSet;
	    }
}


