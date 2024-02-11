package u4.u5.carnaval;

public class Integrante {
	 @Override
	public String toString() {
		return "Integrante [num_participante=" + num_participante + ", integrante=" + nombre + ", edad=" + edad
				+ ", localidad=" + localidad + "]";
	}



	protected int num_participante;
	 protected String nombre;
	 protected int edad;  
	 protected String localidad; 
	 
	 
	 
	 public Integrante(int id, String nombre,int edad,String localidad){
		 this.edad = edad;
		 this.nombre = nombre;
		 this.localidad = localidad;
		 this.num_participante = id;
	 }


	 
	
}


