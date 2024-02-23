package u7.carritosuper;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Principal {
		
	public static void main(String[] args) {
		
		Set <Cliente> clientes =new TreeSet<Cliente>();
		List <Articulo> articulos =new LinkedList<Articulo>();
		Map <Integer,String> cp= new HashMap<Integer,String>();
		Stack <String> domicilio =  new Stack<String>();
		
		Cliente c1=new Cliente("Juan",23);
		Cliente c2=new Cliente("Ana",24);
				
		Articulo a1=new Articulo("001","Lápiz",4.50);
		Articulo a2=new Articulo("002","Goma",3.20);
		Articulo a3=new Articulo("003","Sacapuntas",2.70);
		
		clientes.add(c1);
		clientes.add(c2);	
		clientes.add(c2); //duplicado
		System.out.println(clientes);

		articulos.add(a3);
		articulos.add(a1);
		articulos.add(a2);
		System.out.println(articulos);

		cp.put(41927,"Mairena del Aljarafe");
		cp.put(41950,"Castilleja de la Cuesta");
		cp.put(41110,"Bollullos de la Mitación");
		System.out.println(cp);
		
		domicilio.push("1ºF");
		domicilio.push("Nº12");
		domicilio.push("Avda Pablo Picasso");
		domicilio.push("Mairena del Aljarafe");

		
		System.out.println(domicilio.pop());
		System.out.println(domicilio);
		System.out.println(domicilio.peek());//Muestra el tope de la pila
		
						
		System.out.println("\n-1-----------\n");		
		Iterator<Cliente> it = clientes.iterator();
		
	    while(it.hasNext()) {
	      Cliente obj = (Cliente) it.next();
	      System.out.println(obj);
	    }
	    
		
		System.out.println("\n-2----------\n");	
		Iterator<Articulo> it2 = articulos.iterator();
		 
	    while(it2.hasNext()) {
	      Articulo obj = (Articulo) it2.next();
	      System.out.println(obj);
	    }
			    
        //Iterador de mapa
		System.out.println("\n-3-----------\n");	
		Iterator<Map.Entry<Integer,String>> it3 = cp.entrySet().iterator();
		 
	    while(it3.hasNext()) {
	      Map.Entry <Integer,String> entry = it3.next();
	      System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
	    }

	    System.out.println("\n-4-----------\n");
	    Carrito carrito=new Carrito(c1,cp.get(41927),domicilio);
	    carrito.add_articulos(articulos);
	    System.out.println(carrito.toString());
		
	}

}
