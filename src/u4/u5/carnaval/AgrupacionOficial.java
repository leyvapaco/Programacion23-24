package u4.u5.carnaval;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
	
	protected int puntos= 0;
	protected Integrante[] integrantes;
	
	AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numIntegrantes) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		this.integrantes = new Integrante [numIntegrantes];
		this.puntos=0;
	}
	
	
	public void insertar_integrante(Integrante i) {
		int j=0;
		while ((this.integrantes[j]!=null)&&(j<this.integrantes.length)) {
			j++;
		}//Busco la posición del array en la que añadir al estudiante
		
		this.integrantes[j]=i;
		}
				
	public boolean eliminar_integrante(Integrante i) {
		int j=0;
		while ((this.integrantes[j]!=i)&&(j<this.integrantes.length)) {
			j++;
		}//busco cual objeto del array coincide con el que busco para eliminar
		
		if (j<this.integrantes.length) {
			this.integrantes[j] = null;
				return true;
		}
		else return false;
	}
	
	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	//Metodos abstractos de la clase
	public abstract void caminito_del_falla();
	
	@Override
	public abstract void cantar_la_presentacion();

	@Override
	public abstract void mostrar_tipo();


	@Override
	public String toString() {
		return super.toString()+" puntos=" + puntos + ", integrantes=" + Arrays.toString(integrantes);
	}

	

}
