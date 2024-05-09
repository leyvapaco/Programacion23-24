package u8.examen;


public class Jugador {
	public int dorsal;
	public String nombre;
	public String demarcacion;
	public double ficha;
	
	public Jugador() {;

	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion.replaceAll("\\s{2,}"," ");;
		this.demarcacion = this.demarcacion.replaceAll("\\n\\r", "");
		this.demarcacion = demarcacion;
	}

	public double getFicha() {
		return ficha;
	}

	public void setFicha(double ficha) {
		this.ficha = ficha;
	}

	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + ", ficha=" + ficha
				+ "]";
	}
	
	
}

