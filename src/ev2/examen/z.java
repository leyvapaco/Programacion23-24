package ev2.examen;

public class Proveedor {
	
	private String CIF;
	private String nombre;
	private String telef;
	
	public Proveedor(String cif, String nombre, String telef) {
		this.CIF = cif;
		this.nombre = nombre;
		this.telef = telef;
	}
		
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Proveedor [CIF=" + CIF + ", nombre=" + nombre + ", telef=" + telef + "]";
	}
	
	
}
