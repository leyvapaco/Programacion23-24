package ev2.examen.copy;

public class Montura {
	protected String marca;
	protected enum MATERIAL {PASTA, METAL};
	protected MATERIAL mat;
	protected String color;
	
	Montura(String color, String marca, MATERIAL mat){
		this.color = color;
		this.marca = marca;
		this.mat = mat;
	}
	
	
}
