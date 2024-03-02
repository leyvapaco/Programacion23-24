package u7.t2.act15;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import u7.ejemplos2.Articulo;

public class Principal {
	public static void main(String[] args) {
		ListaOrdenada lista =new ListaOrdenada();
	
		lista.insertarOrdenado(2);
		System.out.println(lista);
		lista.insertarOrdenado(5);
		System.out.println(lista);
		lista.insertarOrdenado(3);	
		System.out.println(lista);
		
	}

}
