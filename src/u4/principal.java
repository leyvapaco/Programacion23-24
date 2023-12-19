package u4;
import java.io.Serializable;

public class principal {
public static void main(String[] args) {
	Estudiante e1 = new Estudiante();
	Estudiante e2 = new Estudiante();
	Estudiante e3 = new Estudiante();

	System.out.println("# de estud.: " + e1.dame_num_estud());
	System.out.println("# de estud.: " + Estudiante.dame_num_estud());
	}
}
