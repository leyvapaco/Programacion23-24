package u4.u5.carnaval;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {

	@Override
	public String toString() {
		return "Comparsa [empresaAtrezo=" + empresaAtrezo + ", puntos=" + puntos + ", nombre=" + nombre + ", autor="
				+ autor + ", autorMusica=" + autorMusica + ", autorLetra=" + autorLetra + ", tipo=" + tipo
				+ ", integrantes=" + Arrays.toString(integrantes) + "]";
	}

	private String empresaAtrezo;
	
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo , String empresaAtrezo, int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo, numIntegrantes);
		this.empresaAtrezo = empresaAtrezo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminito_del_falla() {
		System.out.println("La comparsa " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación de la Comparsa con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("La Comparsa "+this.nombre + " va de "+ this.tipo);
		
	}

}
