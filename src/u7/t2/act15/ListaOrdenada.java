package u7.t2.act15;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import u7.ejemplos2.Articulo;

public class ListaOrdenada extends LinkedList{
	
	private List <Integer> miLista;
	
	ListaOrdenada(){
		miLista =new LinkedList<Integer>();
	}
	
	void insertarOrdenado( Integer elemento) {
		int tam=miLista.size();
		int i=0;
		while (i<tam) {
			int actual=miLista.get(i);
			if (actual<elemento)
				i++;	
				break;
		}		
	
		miLista.add(i,elemento);
	}

	@Override
	public String toString() {
		return "miLista=" + miLista ;
	}
	
	

}
