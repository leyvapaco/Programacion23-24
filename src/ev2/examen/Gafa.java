package ev2.examen;

import java.io.Serializable;
//Todas las clases que vayan a almacenarse en fichero deben implementar Serializable
//En este caso, al indicar que el padre es Serializable, también lo serán los hijos


public abstract class Gafa implements Promocion,Serializable{
	private static final long serialVersionUID = 1L;
	private static Integer cuantas=0; //Contador de gafas
	protected  Integer id; //Identificador secuencial de la gafa
	protected  Montura montura;
	protected  Lente lenteI;
	protected  Lente lenteD;
	protected  double coste; //Coste de proveedor
	protected  double precioVenta;
	
	
	public Gafa(Montura mont, Lente lenteI, Lente lenteD,  double coste, double precioVenta){
		cuantas++;
		this.id=cuantas;
		this.montura = mont;
		this.lenteI=lenteI;
		this.lenteD=lenteD;
		this.coste = coste;
		this.precioVenta= precioVenta;
	}
	
	public abstract void aplicarDescuento(int descuento);
	
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public double getCoste() {
		return coste;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Gafa [id=" + id + ", montura=" + montura + ", lenteI=" + lenteI + ", lenteD=" + lenteD + ", coste="
				+ coste + ", precioVenta=" + precioVenta + "]";
	}

	
		
}
