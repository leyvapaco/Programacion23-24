package u7.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists {
	
	public static void imprimir(List<Cliente> lista) {
        for (Cliente elemento : lista)
            System.out.print(elemento.toString()+"\n");
        System.out.println();
    }
	
	public static void imprimirOrdenada(List lista) {
        Collections.sort(lista);
        imprimir(lista);
    }
	
	public static void main(String[] args) {
		
		List <Cliente> miLista1 =new ArrayList<Cliente>();
		LinkedList <Cliente> miLista2 =new LinkedList<Cliente>();
		
// https://www.w3schools.com/java/java_linkedlist.asp
// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		
		Cliente c1=new Cliente("Juan",23);
		Cliente c2=new Cliente("Ana",24);
		Cliente c3=new Cliente("Eva",21);
		
		miLista1.add(c1);
		miLista1.add(c2);
		miLista1.add(c3);
		
		miLista2.add(c1);
		miLista2.add(c2);
		miLista2.add(c3);
		
		miLista2.addFirst(c1);
		//miLista2.push(c1); Permitido si el tipo de miLista2 es LinkedList
				
		
		for (int i=0; i<miLista1.size(); i++)
			System.out.println("Cliente "+miLista1.get(i).getNombre());
		System.out.println("----------------\n");
		
		for (Cliente cli:miLista1)
			System.out.println("Cliente "+cli.getNombre());
		
		System.out.println("----------------\n");
			
		Iterator<Cliente> it = miLista1.iterator();
		 
	    while(it.hasNext()) {
	      Cliente obj = (Cliente) it.next();
	      System.out.println(obj);
	    }
	    
	    //Como imprimir recibe una Lista, ambas llamadas funcionan:
	    
		System.out.println("------------ArrayList:\n");	
		imprimir(miLista1);
		
		System.out.println("------------ArrayList (ordenado):\n");	
		
		imprimirOrdenada(miLista1);
		
		System.out.println("------------LinkedList:\n");	
		imprimir(miLista2);

		System.out.println("------------LinkedList (ordenado):\n");
		imprimirOrdenada(miLista1);
		
	}

}
