package u4.insti;

//Si quitamos el modificador public
//a la clase da error porque trata de acceder desde otro paquete
public class Profesor {
	static int num_profes = 0;
	protected String nombre;
	protected int edad; 
	String dni;
	
	//Protected: Puede ser accedido en el mismo paquete y subclases
	//En este caso es accedido desde una subclase de otro paquete (Tutor)
	protected Profesor() {
		num_profes++;
	}
	public static int dame_num_profes() {
		return num_profes;
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
	public static void setNum_profes(int num_profes) {
		Profesor.num_profes = num_profes;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	int dame_edad() {
	return edad; // error
	}
}

