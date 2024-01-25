package u4.t1.ferroviaria;


public class Personal  {
	protected String nombre;
	protected String dni;
	
	
	 public Personal(String nombre) {
	        this.nombre = nombre;
	    }
	 public Personal(String nombre, String dni) {
	        this.nombre = nombre;
	        this.dni = dni;
	    }
	
	public void getInfoPersonal() {
	} 
	
	
	@Override
	public String toString() {
		return("El personal "+nombre+" no tiene cargo asignado");
	}
}