package ev2.veterinaria2024;

import java.io.Serializable;

public class Propietario implements Serializable{
	private String telefono;
	private String nombre;
	
	public Propietario(String telefono, String nombre) {
		this.telefono = telefono;
		this.nombre = nombre;
	}
}
