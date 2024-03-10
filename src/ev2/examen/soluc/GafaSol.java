package ev2.examen.soluc;

public class GafaSol extends Gafa implements Promocion, Comparable<GafaSol> {
	private static final long serialVersionUID = 1L;
	private String nombreProveedor;
	private static int descuento=0;//Descuento para todas las gafas graduadas
	
	public GafaSol(Montura mont, LenteSol lenteI, LenteSol lenteD,  double coste, double precioVenta, Proveedor prov) {
		super(mont,lenteI,lenteD,coste,precioVenta);
		this.nombreProveedor = prov.getNombre();
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	//Implementamos la interfaz Promocion
	@Override
	public void aplicarDescuento(int descuento)  {
		precioVenta=precioVenta -(this.precioVenta * descuento / 100);
	}

	public static int getDescuento() {
		return descuento;
	}

	public static void setDescuento(int descuento) {
		GafaSol.descuento = descuento;
	}
	
	public int compareTo(GafaSol o) {
		return this.getNombreProveedor().compareTo(o.getNombreProveedor());
	}

	@Override
	public String toString() {
		return  "nombreProveedor=" + nombreProveedor +" "+ super.toString();
	}

	
}
