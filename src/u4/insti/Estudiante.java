package u4.insti;

public class Estudiante {
	static int num_estud = 0;
	String nombre;
	int edad;
	String dni;
	
	Estudiante() {
		num_estud++;
	}
	static int dame_num_estud() {
		return num_estud;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return dni;
	}
	public void setDireccion(String direccion) {
		this.dni = direccion;
	}
	public static void setNum_estud(int num_estud) {
		Estudiante.num_estud = num_estud;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	int dame_edad() {
	return edad; // error
	}
}

