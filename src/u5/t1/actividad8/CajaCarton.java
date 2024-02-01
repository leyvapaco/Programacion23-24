package u5.t1.actividad8;

public class CajaCarton extends Caja{
	int etiqueta;
	public CajaCarton(double ancho, double alto, double fondo) {
		super(ancho, alto, fondo, "cm");
		this.etiqueta = (int) (Math.random() * 9999) + 1000;
		
	}
	
	public String getUnidades() {
		return this.unidades;
	}
	
	public double getVolumen() {
		double volumen = (this.ancho * this.alto * this.fondo) * 0.8;
		volumen = volumen / 1000000;
		return volumen;
	}
	
	public double getSuperficie() {
		double area = 2 * (this.ancho * this.alto + this.alto * this.fondo + this.ancho * this.fondo);
		
		return area;
	}
	
	public String toString() {
		String valorAncho = String.valueOf(this.ancho);
		String valorAlto = String.valueOf(this.alto);
		String valorFondo = String.valueOf(this.fondo);
		String valorEtiqueta = String.valueOf(this.etiqueta);
		String cadenaTotal = "ANCHO: "+valorAncho+" "+this.unidades+"   ALTO: "+valorAlto+" "+this.unidades+"  FONDO: "+valorFondo+" "+this.unidades+"   ETIQUETA: "+valorEtiqueta;
		return cadenaTotal;
		
	}

}
