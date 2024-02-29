package u7.ejemplos;


//Clase Cliente
public class Cliente implements Comparable<Cliente> {
 private String nombre;
 private int edad;

 public Cliente(String nombre, int edad)  {
    this.nombre = nombre;
     this.edad = edad;
 }

 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }

@Override
public String toString() {
	return "Cliente " + nombre;
}
 
@Override
public int compareTo(Cliente cli) {
		return this.nombre.compareTo(cli.nombre);
}
 
}

