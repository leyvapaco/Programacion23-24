package u4.t1.ferroviaria;


public class Mecanico extends Personal {
	String tlfno;
	String especialidad;
	
	public Mecanico(String nombre, String tlfno, String especialidad) {
		super(nombre);
		this.tlfno = tlfno;
		this.especialidad = especialidad;
	}

	@Override
	public void getInfoPersonal() {
		System.out.println("Nombre Completo: "+this.nombre);
		System.out.println("Télefono: "+this.tlfno);
		System.out.println("Especialidad: "+this.especialidad);
	}
}