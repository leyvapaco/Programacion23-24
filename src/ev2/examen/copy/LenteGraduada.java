package ev2.examen.copy;

import ev2.examen.Lente.POSICION;

public class LenteGraduada extends Lente{
	protected enum PROBLEMA{ASTIGMATISMO,MIOPIA,HIPERMETROPIA};
	protected PROBLEMA problema;
	protected double gradoCorreccion;
	
	
	LenteGraduada(POSICION pos,PROBLEMA prom, double grado) {
		super(pos);
		this.gradoCorreccion = grado;
		this.problema = prom;
	}
	
	public POSICION getPos() {
		return pos;
	}

	public void setPos(POSICION pos) {
		this.pos = pos;
	}

	@Override
	public void dimeTipoLente() {
		System.out.println("Es de tipo Graduada");
		
	}
	
	
}