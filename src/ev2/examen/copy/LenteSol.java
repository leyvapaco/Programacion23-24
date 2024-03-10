package ev2.examen.copy;

import ev2.examen.Lente.POSICION;

public class LenteSol extends Lente{
	protected enum COLOR{VERDE, MARRON, GRIS};
	protected COLOR color;

	LenteSol(POSICION pos, COLOR color) {
		super(pos);
		this.color = color;
	}

	public POSICION getPos() {
		return pos;
	}

	public void setPos(POSICION pos) {
		this.pos = pos;
	}
	@Override
	public void dimeTipoLente() {
		System.out.println("Es de tipo Sol");
	}
	
	

}
