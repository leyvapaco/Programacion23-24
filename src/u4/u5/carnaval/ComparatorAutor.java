package u4.u5.carnaval;

import java.util.Comparator;

public class ComparatorAutor  implements Comparator<AgrupacionOficial> {

	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		if ((o1==null) ||(o2==null) )
			return 0;
		
		return o1.autor.compareTo(o2.autor);
	}

}
