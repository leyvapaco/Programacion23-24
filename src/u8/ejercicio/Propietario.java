package u8.ejercicio;

public class Propietario {
	private String dni;
	private String nombre;
	
	Propietario(){}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Propietario [dni=" + dni + ", nombre=" + nombre + "]";
	};
	
}
