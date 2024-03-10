package ev2.examen.copy;

public class Gafa {
	
	protected String tipo;
	protected Integer id;
	protected Montura montura;
	protected Lente lenteD;
	protected Lente lenteI;
	public int coste;
	protected int precioVenta;
	protected static int ContadorGafas;
	
	Gafa(Integer id, Montura mont,int coste, int precioVenta){
		this.id = id;
		this.montura = mont;
		this.coste = coste;
		this.precioVenta= precioVenta;
	}
	
	

	public static int cuantasGafas() {
		return ContadorGafas;
	}
}
