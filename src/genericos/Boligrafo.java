package genericos;


public class Boligrafo extends MaterialOficina implements Comparable<Boligrafo> {
	protected  String color;
	
	public Boligrafo(String marca, String color, double pvp) {
		super(marca, pvp);
		this.color = color;
	}
	
		
	@Override
	public String toString() {
		return "Boligrafo [color=" + color + ", marca=" + marca + ", pvp=" + pvp + "]";
	}


	@Override
	public int compareTo(Boligrafo o) {
		return this.color.compareTo(o.color);
	}
	
	
}
