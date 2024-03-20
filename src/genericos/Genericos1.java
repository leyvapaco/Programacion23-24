package genericos;

import java.util.ArrayList;
import java.util.List;

public class Genericos1 {
	
		   public static void main(String[] args) {

		      List list = new ArrayList();

		      list.add(100);
		      list.add(200);
		      list.add("Pepe");
		      list.add("Paco");

		       System.out.println((Integer) list.get(0) + (Integer) list.get(1));
		       System.out.println((Integer) list.get(2) + (Integer) list.get(3));
		   
		       System.out.println(list.get(0));
		       System.out.println(list.get(1));
		       System.out.println(list.get(2));
		       System.out.println(list.get(3));
		   
		   }
		
}
