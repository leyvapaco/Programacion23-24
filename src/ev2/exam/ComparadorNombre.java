package ev2.exam;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<GafaSol>{

	@Override
	public int compare(GafaSol o1, GafaSol o2) {
		return o1.getNombreProveedor().compareTo(o2.getNombreProveedor());
	}

}
