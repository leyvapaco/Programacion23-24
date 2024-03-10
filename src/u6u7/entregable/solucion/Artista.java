package u6u7.entregable;

import java.io.Serializable;
import java.util.LinkedHashSet;


public class Artista implements Serializable, Comparable<Artista> {

	static final long serialVersionUID = 4L;
	
    private String nombre;
    private int cache;
    private Manager manager;
    private LinkedHashSet<Musico> listaMusicos; //Uso Linked para poder mostrarlos por orden de inserción
    private Estilo estilo;

    public Artista(String nombre, int cache, Manager manager, Estilo estilo) {
        this.nombre = nombre;
        this.cache = cache;
        this.manager = manager;
        this.estilo = estilo;
        listaMusicos = new LinkedHashSet<Musico>();

    }
    
    public void addMusico(Musico musico) {
    	this.listaMusicos.add(musico);
    }
    
    public void delMusico(Musico musico) {
    	this.listaMusicos.remove(musico);
    }
    
    public void imprimeMusicos() {
    	System.out.println("\nMúsicos de "+nombre+" por orden de inserción:\n"+listaMusicos);
    } 

    public int getCache() {
		return cache;
	}
        

	public Estilo getEstilo() {
		return estilo;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	@Override
    public int compareTo(Artista o) {
        return this.getNombre().compareTo(o.getNombre());
    }
	
	public Manager getManager() {
		return manager;
	}
	
    @Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", cache=" + cache +", estilo=" + estilo + "]";
	}
}
