package ev2.exam;

public class GafaGraduada extends Gafa {
	private static final long serialVersionUID = 1L;
	private static int descuento=0; //Descuento para todas las gafas de sol
	
	public GafaGraduada( Montura mont, LenteGraduada lenteI, LenteGraduada lenteD,  double coste, double precioVenta) {
		super(mont,lenteI,lenteD,coste,precioVenta);
	}

	//Implementamos la interfaz Promocion
	@Override
	public void aplicarDescuento(int descuento) {
		precioVenta=precioVenta -(this.precioVenta * descuento / 100);
	}

	public static void setDescuento(int descuento) {
		GafaGraduada.descuento = descuento;
	}

	public static int getDescuento() {
		return descuento;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}	
	
}
