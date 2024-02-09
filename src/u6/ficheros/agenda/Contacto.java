package u6.ficheros.agenda;

import java.io.Serializable;

public class Contacto implements Serializable{
	 static final long serialVersionUID = 0;
	 private String nombre;
	  private String pApellido;
	  private transient String sApellido;

	public Contacto(String nombre, String p_Apellido, String s_Apellido){
	    this.nombre = nombre;
	    this.pApellido = p_Apellido;
	    this.sApellido = s_Apellido;
	  }

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", p_Apellido=" + pApellido +"]";
	}
	  
}
