package genericos;

public class Bola {
	private String tipo;
	private String color;
	
	public Bola(String tipo, String color) {
		this.tipo = tipo;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Bola [tipo=" + tipo + ", color=" + color + "]";
	}
}
