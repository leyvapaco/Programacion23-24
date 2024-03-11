package ev2.exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Optica {
	private String nombre;
	public enum Tipo{GRADUADA,SOL};
	
	//Mapa con clave el tipo de gafa (graduada o sol) y su valor un set de gafas.
	//Set porque no hay 2 gafas iguales porque se diferencian por un atributo: id
	
	private Map<Tipo,Set<Gafa>> stock; 
	private static int contadorGafas=0;
		
	public Optica(String nombre){
		this.nombre=nombre;
		this.stock= new HashMap<Tipo,Set<Gafa>>();
	}
		
	public static void cuantasGafas() {
		System.out.println("El numero de gafas en Stock es: "+contadorGafas);
	}
	
	public void addGafa(Tipo tipo, Gafa gafa) {
        if (!stock.containsKey(tipo)) {
            stock.put(tipo, new HashSet<Gafa>());
	    }
        stock.get(tipo).add(gafa);
        contadorGafas++;	       
	}
		
	public void delGafas(Gafa gafa) {
		//En alguno de los dos tipos debe de estar...
		stock.get(Tipo.GRADUADA).remove(gafa);
		stock.get(Tipo.SOL).remove(gafa);
		contadorGafas --;
	}
	
	public void damePrecioGafa(Gafa gafa) throws VentasPerdidasException {
		System.out.println("PVP de gafa con id "+gafa.getId()+": "+gafa.getPrecioVenta()+" euros");
		if (gafa.precioVenta<gafa.coste) {
			throw new VentasPerdidasException();
		}
	}

	public void gafasByProvedor() {
		// Obtengo los valores asociados a la clave Tipo.SOL
		// Los vuelco en un TreeSet para que use el comparador por defecto de Gafa_sol
		
        Set<Gafa> lista_gafas = new TreeSet<>(stock.get(Tipo.SOL));
        System.out.println("\nGafas ordenadas por nombre de proveedor:\n"+lista_gafas);
	}
	
		
	public void costeGafasByTipo(Tipo tipo) {
		double costeTotal = 0;
		//Debe ser un HashSet porque si fuese TreeSet necesitaría también un comparador en GafaGraduada
	
		Set<Gafa> lista_gafas = new HashSet<>(stock.get(tipo));
	       
		Iterator<Gafa> it = lista_gafas.iterator();
		while(it.hasNext()) {
			costeTotal+= it.next().coste;
		}
		
		System.out.println("\nCoste total del tipo "+tipo+":"+costeTotal+" euros\n");	
	}	
	
	public void pruebaFicheros() {
		Ficheros.escribeFicheroSol(stock);
		Ficheros.cargaFicheroSol();
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
	
	
	
	
	

