package u7.ejemplos2;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class Carrito {
	
	public static void imprimir(Collection coleccion) {
		System.out.println(coleccion);
    }

	
	public static void main(String[] args) {
		
		Collection <Cliente> clientes =new TreeSet<Cliente>();
		Collection <Articulo> articulos =new LinkedList<Articulo>();
		
		Cliente c1=new Cliente("Juan",23);
		Cliente c2=new Cliente("Ana",24);
		
		Articulo a1=new Articulo("001","Lápiz",4.50);
		Articulo a2=new Articulo("002","Goma",3.20);
		Articulo a3=new Articulo("003","Sacapuntas",2.70);

		clientes.add(c1);
		clientes.add(c2);	
		clientes.add(c2); //duplicado

		articulos.add(a3);
		articulos.add(a1);
		articulos.add(a2);

				
		System.out.println("----------------\n");
			
		Iterator<Cliente> it = clientes.iterator();
		 
	    while(it.hasNext()) {
	      Cliente obj = (Cliente) it.next();
	      System.out.println(obj);
	    }
	    
	    //Como imprimir recibe una Lista, ambas llamadas funcionan:
	    
		System.out.println("------------\n");	
		imprimir(clientes);
		
		System.out.println("------------\n");	
		Iterator<Articulo> it2 = articulos.iterator();
		 
	    while(it2.hasNext()) {
	      Articulo obj = (Articulo) it2.next();
	      System.out.println(obj);
	    }
		
		System.out.println("------------\n");	
		imprimir(articulos);


		
	}

}
