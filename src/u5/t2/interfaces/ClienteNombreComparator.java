package u5.t2.interfaces;

import java.util.Comparator;

import u4.t1.interfaces.Empleado;

public class ClienteNombreComparator implements Comparator<Cliente>{
	
	    	 @Override
	 	    public int compare(Cliente c1, Cliente c2) {
	    		 return  c1.getNombre().compareTo(c2.getNombre());
	 	    }

}
