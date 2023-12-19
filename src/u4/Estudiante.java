package u4;

public class Estudiante {
	static int num_estud = 0;
	String nombre;
	int edad;
	String direccion;
	
	Estudiante() {
		num_estud++;
	}
	static int dame_num_estud() {
		return num_estud;
	}
	/*
	static int dame_nombre() {
	return nombre; // error
	}*/
}

