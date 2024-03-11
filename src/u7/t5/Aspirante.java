package u7.t5;

import java.io.Serializable;
import java.util.ArrayList;

public class Aspirante implements Serializable {
	
	private static final long serialVersionUID = 5L;
	
	private String nombre;
	private String dni;
	private String tlf;
	private ArrayList<Double> calificaciones = new ArrayList<Double>();
	
	Aspirante (String nombre, String dni, String tlf){
		
		this.nombre=nombre;
		this.dni=dni;
		this.tlf=tlf;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public ArrayList<Double> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(ArrayList<Double> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", dni=" + dni + ", tlf=" + tlf + "]";
	}
	
	

}
