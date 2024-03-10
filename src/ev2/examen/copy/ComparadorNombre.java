package ev2.examen.copy;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Gafa_sol>{

	@Override
	public int compare(Gafa_sol o1, Gafa_sol o2) {
		return o1.nombreProveedor.compareTo(o2.nombreProveedor);
	}

}
