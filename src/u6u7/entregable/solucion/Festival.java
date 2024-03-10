package u6u7.entregable;

import java.io.*;
import java.util.*;

//Excepción para estilo incorrecto
class EstiloErroneoException extends Exception {
	private static final long serialVersionUID = 1L;
	public EstiloErroneoException(String mensaje) {
		super(mensaje);
	}
}


public class Festival {
    private Map<Estilo, Set<Artista>> mapaArtistas;
    private String nombreEvento;
    private int cp;
    private static int numInscritos=0;

    public Festival( String nombre_evento, int cp) {
        
        this.nombreEvento = nombre_evento;
        this.cp = cp;
        mapaArtistas= new HashMap<Estilo, Set<Artista>>();
       
    }

    public static int cuantosInscritos() {
		return numInscritos;
	}


    //METODOS

    public void inscribeArtista(Estilo estilo, Artista artista) throws EstiloErroneoException {
        if (artista.getEstilo().equals(estilo)) {

            if (!mapaArtistas.containsKey(estilo)) {
                mapaArtistas.put(estilo, new TreeSet<Artista>());
            }

            mapaArtistas.get(estilo).add(artista);
            numInscritos++;
        } else {
        	throw new EstiloErroneoException("No insertado. El artista "+artista.getNombre()+" no pertenece al estilo "+estilo);
        }
       }

	@Override
    public String toString() {
        return "Concierto{" +
                "mapa_artista=" + mapaArtistas +
                ", nombre_evento='" + nombreEvento + '\'' +
                ", recinto='" + cp + '\'' +
                '}';
    }


	public void artistasInscritos() {
        //Convierto los valores del mapa en un ArrayList al que poder
		//hacer después un Collections.sort(List<T) que use el comparador por defecto
		//de la clase Articulo. O bien defino lista_artistas como un TreeSet y no hago el Collections.sort
		
		List<Artista> lista_artistas = new ArrayList<Artista>();
        
        Collection<Set<Artista>> coleccion_artistas= mapaArtistas.values();
        
        Iterator <Set<Artista>> iterator = coleccion_artistas.iterator();

        while (iterator.hasNext()) {
        	Set<Artista> a = iterator.next();
        	lista_artistas.addAll(a);
        }
        
        /* Alternativa
        for (Set<Artista> a : coleccion_artistas) {
        	lista_artistas.addAll(a);
        }*/
        
        
        Collections.sort(lista_artistas); //Sobra si lista_artistas se define como TreeSet
        
        System.out.println(lista_artistas);
    }

    public void artistasByCache(Estilo estilo) {
       		//Obtengo los valores para la clave estilo, pasada por parámetro
            List<Artista> lista_artistas = new ArrayList<>(mapaArtistas.get(estilo));
            Collections.sort(lista_artistas, new Comparator<Artista>() {
                @Override
                public int compare(Artista art1, Artista art2) {
                    return art2.getCache()-art1.getCache();
                }});
            System.out.println(lista_artistas);
        }


    public void cargarArtistas() {
        try (ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("C:\\pruebaficheros\\artistas.dat"))) {
            mapaArtistas = (Map<Estilo, Set<Artista>>) archivo.readObject();        
            System.out.println("\nArtistas cargados de fichero:");
            System.out.println(mapaArtistas);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void guardarArtistas() {
        try (ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("C:\\pruebaficheros\\artistas.dat"))) {
            archivo.writeObject(mapaArtistas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nFichero creado!!");
    }
}



