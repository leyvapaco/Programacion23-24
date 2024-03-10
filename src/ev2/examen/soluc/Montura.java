package ev2.examen.soluc;

import java.io.Serializable;

public class Montura implements Serializable{
	private static final long serialVersionUID = 1L;
	private String marca;
	public enum MATERIAL {PASTA, METAL};
	private MATERIAL mat;
	private String color;
	
	Montura( String marca,String color, MATERIAL mat){
		this.marca = marca;
		this.color = color;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Montura [marca=" + marca + ", mat=" + mat + ", color=" + color + "]";
	}
	
	
}
