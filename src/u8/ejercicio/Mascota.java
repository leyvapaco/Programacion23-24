package u8.ejercicio;

public class Mascota {
	private String tipo;
	private String nombre;
	private String chip; //sólo para perros
	private String propietario; //dni del propietario
	
	public Mascota() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Mascota [tipo=" + tipo + ", nombre=" + nombre + ", chip=" + chip + ", propietario=" + propietario + "]";
	}
	
	
	

}
