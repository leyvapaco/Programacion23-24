package u4.animales;

public abstract class Animal {
	private String nombre;
	private int edad;
	static int vidas=0;
	
	//Omitimos el constructor aunque es factible crearlo
	
	public abstract void comunicarse();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static void getVidas() {
		System.out.println("Vidas creadas: "+vidas);
	}


}
