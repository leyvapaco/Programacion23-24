package u4.u5.carnaval;

import java.util.Arrays;

public class Romancero extends Agrupacion implements Callejera{
	@Override
	public String toString() {
		return "Romancero [tematicaCartelo=" + tematicaCartelo + ", nombre=" + nombre + ", autor=" + autor
				+ ", autorMusica=" + autorMusica + ", autorLetra=" + autorLetra + ", tipo=" + tipo + ", integrantes="
				+ "]";
	}

	protected String tematicaCartelo;
	
	Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo,String tematica) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		this.tematicaCartelo = tematica;
		// TODO Auto-generated constructor stub
	}

	public void amo_a_escucha() {
		System.out.println("Amo a escucha el Romancero "+this.nombre);
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación del Romancero con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("El Romancero "+this.nombre + " va de "+ this.tipo);
		
	}
	
}
