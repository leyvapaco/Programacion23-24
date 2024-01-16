package u4.insti;

import u4.visibilidad.Tutor;

public class Principal {
public static void main(String[] args) {
	Estudiante e1 = new Estudiante();
	Estudiante e2 = new Estudiante();
	Estudiante e3 = new Estudiante();
	Tutor t1 = new Tutor();
	Curso c1 = new Curso();

	System.out.println("# profes: " + Profesor.dame_num_profes());
	// Al estar Profesor en otro paquete, el método dame_num_profes() debe ser público 
	System.out.println("# estud: " + Estudiante.dame_num_estud());
	
	t1.setNombre("Paco");
	t1.edad=28;
	//Más quisiera...
	//Al ser edad protected, el hijo "tutor" puede acceder al atributo;


	c1.addProfesor(t1);
	
	e1.setNombre("Dominic");
	e2.setNombre("Jesús");
	c1.matricula(e1);
	c1.matricula(e2);

	System.out.println("\nProfesor: "+c1.getProfesor());
	//System.out.println("Profesor: "+c1.profesor); 
	// Error porque profesor tiene un atributo protected y está en otro paquete
	
	
	System.out.println("\n# matriculados: "+Curso.getMatriculados());

}
}
