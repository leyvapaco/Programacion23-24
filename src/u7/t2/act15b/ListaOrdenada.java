package u7.t2.act15b;

import java.util.LinkedList;

public class ListaOrdenada<E extends Comparable<E>> extends LinkedList<E> {

    // Método para insertar un nuevo elemento ordenado
    public void insertarOrdenado(E elemento) {
        // Si la lista está vacía o el nuevo elemento es mayor que el último elemento,
        // simplemente lo agregamos al final
    	if (isEmpty() || elemento.compareTo(getLast()) >= 0) {
    		addLast(elemento);
    		return;
    	}

    	// Si el nuevo elemento es menor que el primer elemento,
    	// lo agregamos al principio
    	if (elemento.compareTo(getFirst()) <= 0) {
    		addFirst(elemento);
            return;
        }

    	// Recorremos la lista para encontrar la posición de inserción
        for (int i = 0; i < size(); i++) {
            E elementoActual = get(i);
            // Si encontramos un elemento mayor al nuevo elemento,
            // lo insertamos antes de ese elemento
            if (elemento.compareTo(elementoActual) < 0) {
            	add(i, elemento);
            	return;
            }
        }
    }

    public static void main(String[] args) {
    	ListaOrdenada<String> lista = new ListaOrdenada<>();
    	lista.insertarOrdenado("zoe");
    	lista.insertarOrdenado("paco");
    	lista.insertarOrdenado("carlos");
    	lista.insertarOrdenado("yolanda");
    	lista.insertarOrdenado("raul");
    	
    	System.out.println("Lista ordenada: " + lista);
    }
}

