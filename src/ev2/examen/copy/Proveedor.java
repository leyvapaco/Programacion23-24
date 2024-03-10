package ev2.examen.copy;

public class Proveedor {
	
	protected String CIF;
	protected String nombre;
	protected String telef;
	
	public Proveedor(String cif, String nombre, String telef) {
		this.CIF = cif;
		this.nombre = nombre;
		this.telef = telef;
	}
	
	
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelef() {
		return telef;
	}
	public void setTelef(String telef) {
		this.telef = telef;
	}
}
