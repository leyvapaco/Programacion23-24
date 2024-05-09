package u8.examen;


import java.util.ArrayList;

public class Plantilla {
    public ArrayList<Jugador> listaJugadores=new ArrayList<>();
    public ArrayList<Tecnico> listaTecnicos=new ArrayList<>();

    public Plantilla(){};
    
    public void addJugador(Jugador jugador) {
    	listaJugadores.add(jugador);
    };
    
    public void addTecnico(Tecnico tecnico) {
    	listaTecnicos.add(tecnico);
    }

	@Override
	public String toString() {
		return "Plantilla [listaJugadores=" + listaJugadores + ", listaTecnicos=" + listaTecnicos + "]";
	};
    
    
}
