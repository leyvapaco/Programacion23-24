package u4.u5.carnaval;

import java.util.Arrays;

public class COAC {
	private AgrupacionOficial[] grupos;
		
	
	public COAC(){
		this.grupos = new AgrupacionOficial[4];
	}
	
		
	
	public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
		int j=0;
		while ((this.grupos[j]!=null)&&(j<this.grupos.length)) {
			j++;
		}//Busco la posición del array en la que añadir al estudiante
		
		this.grupos[j]=agrupacion;
		}
				
	 public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
		int j=0;
		boolean encontrado=false;
		while ((this.grupos[j]!=agrupacion)&&(j<this.grupos.length)) {
			j++;
		}//busco cual objeto del array coincide con el que busco para eliminar

		if (j<this.grupos.length) {
			encontrado=true;
		}
		
		//Adelanto en 1 posicion el resto de elementos del array para que no queden nulos en medio del array.
		while (j<this.grupos.length-1) {
			this.grupos[j]=this.grupos[j+1];
			j++;}
		

		return encontrado;
	}
	 
	 
	 public void ordenar_por_puntos() {
		 ComparatorPuntos comparador = new ComparatorPuntos(); //comparo usando el objeto comparador para ese atributo
		 Arrays.sort(grupos,comparador);
	 }
	
	 public void ordenar_por_nombre() { // Por default usa el compareTo establecido, que es nombre
		 Arrays.sort(grupos);
	 }
	 
	
	 public void ordenar_por_autor() {
		 ComparatorAutor comparador = new ComparatorAutor(); //comparo usando el objeto comparador para ese atributo
		 Arrays.sort(grupos,comparador);
	 }
	
		@Override
	public String toString() {
		return "COAC [grupos=" + Arrays.toString(grupos) + "]";
	}

	
	
}
