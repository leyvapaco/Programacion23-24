package u4.u5.carnaval;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	protected int numMiembros;
	
	Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numMiembros) {
		super(nombre, autor, autorMusica, autorLetra, tipo,4);
		this.numMiembros = numMiembros;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminito_del_falla() {
	System.out.println("El cuarteto " + this.nombre +" va caminito del falla");	 
		
	}

	@Override
	public void cantar_la_presentacion() {
		// TODO Auto-generated method stub
		System.out.println("Cantando la presentación del cuarteto con nombre " + this.nombre);
	}

	@Override
	public void mostrar_tipo() {
		System.out.println("El cuarteto "+this.nombre + " va de "+ this.tipo);
	}
	public void amo_a_escucha() {
		System.out.println("Amo a escucha la Cuarteto "+this.nombre);
		
	}

	@Override
	public String toString() {
		return "Cuarteto [numMiembros=" + numMiembros + ", puntos=" + puntos + ", nombre=" + nombre + ", autor=" + autor
				+ ", autorMusica=" + autorMusica + ", autorLetra=" + autorLetra + ", tipo=" + tipo + ", integrantes="
				+ Arrays.toString(integrantes) + "]";
	}
}
