package u4.u5.carnaval;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera{

	@Override
	public String toString() {
		return "Chirigota [numCuples=" + numCuples + ", puntos=" + puntos + ", nombre=" + nombre + ", autor=" + autor
				+ ", autorMusica=" + autorMusica + ", autorLetra=" + autorLetra + ", tipo=" + tipo + ", integrantes="
				+ Arrays.toString(integrantes) + "]";
	}
	protected int numCuples;

	
	Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo,int numCuples,int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo, numIntegrantes);
		this.numCuples = numCuples;
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminito_del_falla() {
		
		System.out.println("La chirigota " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación de la Chirigotacon nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("La chirigota "+this.nombre + " va de "+ this.tipo);
	}
	public void amo_a_escucha() {
		System.out.println("Amo a escucha la Chirigota "+this.nombre);
	}
	
	
}
