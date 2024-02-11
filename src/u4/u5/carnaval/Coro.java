package u4.u5.carnaval;

public class Coro extends AgrupacionOficial {
	protected int numBandurrias;
	protected int numGuitarras;
	
	Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numBandurrias , int numGuitarras,int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo,numIntegrantes);
		this.numBandurrias = numBandurrias;
		this.numGuitarras = numGuitarras;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminito_del_falla() {
		System.out.println("El coro " + this.nombre +" va caminito del falla");	
		
	  //Alternativa:
	  //System.out.println(this.getClass().getSimpleName() + this.nombre +" va caminito del falla");	 
		
		
	}

	@Override
	public void cantar_la_presentacion() {
		System.out.println("Cantando la presentación del coro con nombre " + this.nombre);
		
	}

	@Override
	public void mostrar_tipo() {
		super.toString();
		System.out.println("El coro "+this.nombre + " va de "+ this.tipo);
		
	}

	@Override
	public String toString() {		
		return  this.getClass().getSimpleName()+" "+super.toString()+" numBandurrias=" + numBandurrias + ", numGuitarras=" + numGuitarras + "]";
	}


	
}
