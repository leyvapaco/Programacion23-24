package ev2.examen;


public class LenteSol extends Lente {
	private static final long serialVersionUID = 1L;

	public enum COLOR{VERDE, MARRON, GRIS};
	private COLOR color;

	LenteSol(char pos, COLOR color) {
		super(pos);
		this.color = color;
	}

	
	public void dimeTipoLente() {
		System.out.println("Sol: "+this.getClass().getName());
	}
	
	@Override
	public String toString() {
		return "LenteSol [color=" + color + ", pos=" + pos + "]";
	}
	
	

}
