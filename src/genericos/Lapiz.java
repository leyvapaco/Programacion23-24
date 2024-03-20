package genericos;


public class Lapiz extends MaterialOficina implements Comparable<Lapiz> {
	protected  double dureza; //Observar comparador si Double
	
	public Lapiz(String marca, double pvp, double dureza) {
		super(marca,pvp);
		this.dureza = dureza;
	}
	
	@Override
	public String toString() {
		return "Lápiz [marca=" + marca + ", dureza=" + dureza + "]";
	}
	
	//Double dureza
	 /*
	@Override
	public int compareTo(Lapiz o) {
		return this.dureza.compareTo(o.dureza);
	}*/
	
	
	//double dureza
	@Override
	public int compareTo(Lapiz o) {
		
		if(this.dureza<o.dureza)
	          return -1;
	    else if(o.dureza<this.dureza)
	          return 1;
	    return 0;
	}
	
}
