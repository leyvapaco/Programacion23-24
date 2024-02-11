package u4.u5.carnaval;

public abstract class Agrupacion implements Comparable<Agrupacion>{
	protected String nombre;
	protected String autor;
	protected String autorMusica;
	protected String autorLetra;
	protected String tipo;

	private static int numAgrupaciones;
	
	
	Agrupacion(String nombre,String autor,String autorMusica,String autorLetra , String tipo){
		this.nombre = nombre;
		this.autor = autor;
		this.autorMusica = autorMusica;
		this.autorLetra = autorLetra;
		this.tipo = tipo;

		numAgrupaciones = getNumAgrupaciones() + 1;
	}
		
	
	@Override
	public int compareTo(Agrupacion agrupacion) {
			return this.nombre.compareTo(agrupacion.nombre);
	}
	
	
	public abstract void cantar_la_presentacion();
	
	public abstract void mostrar_tipo();

	public static int getNumAgrupaciones() {
		return numAgrupaciones;
	}


	@Override
	public String toString() {
		return "[nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetra="
				+ autorLetra + ", tipo=" + tipo  ;
	}
	
	
}
