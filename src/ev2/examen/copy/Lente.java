package ev2.examen.copy;

public abstract class Lente {

	protected enum POSICION{D, I};
	protected POSICION pos;
	
	Lente(POSICION pos){
		this.pos = pos;
	}
	
	
	public POSICION getPos() {
		return pos;
	}

	public void setPos(POSICION pos) {
		this.pos = pos;
	}
	
	public abstract void dimeTipoLente();
}
