package ev2.examen;


public class LenteGraduada extends Lente{
	private static final long serialVersionUID = 1L;
	public enum PROBLEMA{ASTIGMATISMO,MIOPIA,HIPERMETROPIA};
	private PROBLEMA problema;
	private double gradoCorreccion;
	
	
	LenteGraduada(char pos,PROBLEMA prom, double grado) {
		super(pos);
		this.gradoCorreccion = grado;
		this.problema = prom;
	}
	
	
	public void dimeTipoLente() {
		System.out.println("Graduada"+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "LenteGraduada [problema=" + problema + ", gradoCorreccion=" + gradoCorreccion + ", pos=" + pos + "]";
	}

	
	
}