package u4.insti;

public class Curso {
	String nombreCurso;
    private String profesor;
    Estudiante[] alumnos= new Estudiante[5];
    static int matriculados=0;
	
	Curso() {

	}
	
	public void addProfesor(Profesor p){
		this.profesor=p.getNombre();
	}
	
	public String getProfesor(){
		return this.profesor;
	}
	
	public void matricula(Estudiante est) {

		int i=0;
		while ((alumnos[i]!=null)&&(i<alumnos.length)) {
			i++;
		}//Busco la posición del array en la que añadir al estudiante
		
		alumnos[i]=est;
		matriculados++;
	}
	

	public static int getMatriculados() {
		return matriculados;
	}

	public String getNombre() {
		return nombreCurso;
	}
	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}
	
}

