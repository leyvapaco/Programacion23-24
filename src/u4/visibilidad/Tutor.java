package u4.visibilidad;

import u4.insti.Profesor;
//Si quito public a la clase no puede ser accedida desde otro paquete
public class Tutor extends Profesor{
	
	//Si quito public al constructor no puede ser accedido desde otro paquete
	public Tutor(){
		super();
	}
	
	public void tutoriza() {
		System.out.println("Realizando acción tutorial");
	}
}

