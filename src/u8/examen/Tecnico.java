package u8.examen;


public class Tecnico {
	public String nombre;
	public String puesto;
	
	public Tecnico() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + ", puesto=" + puesto + "]";
	}



	
	
}
