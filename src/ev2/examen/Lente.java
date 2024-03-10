package ev2.examen;

import java.io.Serializable;

public abstract class Lente implements Serializable{

	private static final long serialVersionUID = 1L;
	protected char pos; // Izquierda('I') o Derecha ('D')
	
	Lente(char pos){
		this.pos = pos;
	}
	
	public abstract void dimeTipoLente();
		
}
