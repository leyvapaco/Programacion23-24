package genericos;

import java.util.ArrayList;


import java.util.List;

public class Genericos2 {

		public static <T> void fill(List<T> list, T val) {
		    for (int i = 0; i < list.size(); i++)
		           list.set(i, val);
		   }
	
		 public static void main(String[] args) {

		       List<String> strings = new ArrayList<>();
		       strings.add("Nana");
		       strings.add("Nene");
		       strings.add("Nini");

		       fill(strings, "Nono");

		       System.out.println(strings);

		       List<Integer> numeros = new ArrayList<>();
		       numeros.add(1);
		       numeros.add(2);
		       numeros.add(3);

		       fill(numeros, 888);
		       System.out.println(numeros);
		   }
		
}
