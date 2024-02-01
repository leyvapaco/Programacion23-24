package u5.t1.actividad8;

public class Caja {
	protected final double ancho;
	protected final double alto;
	protected final double fondo;
	protected final String unidades;
	
	public Caja(double ancho, double alto, double fondo, String u){
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidades = u;
	}
	
	public double getVolumen() {
		double volumen;
		if(this.unidades == "cm") {
			volumen = (this.ancho * this.alto * this.fondo) / 1000000;
		}else {
			volumen = this.ancho * this.alto * this.fondo;
		}
		return volumen;
		
	}
	
	public String toString() {
		
		String cadenaTotal = "ANCHO: "+this.ancho+" "+this.unidades+"   ALTO: "+this.alto+" "+this.unidades+"  FONDO: "+this.fondo+" "+this.unidades;
		return cadenaTotal;
		
	}
}
