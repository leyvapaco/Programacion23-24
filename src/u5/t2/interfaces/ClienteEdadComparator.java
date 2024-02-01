package u5.t2.interfaces;

import java.util.Comparator;

import u4.t1.interfaces.Empleado;

public class ClienteEdadComparator implements Comparator<Cliente>{
	
	    	 @Override
	 	    public int compare(Cliente c1, Cliente c2) {
	 	        if (c1.getEdad() < c2.getEdad()) {
	 	            return -1;
	 	        } else if (c1.getEdad() > c2.getEdad()) { 
	 	            return 1;
	 	        } else {
	 	            return 0;
	 	        }
	 	    }

}
