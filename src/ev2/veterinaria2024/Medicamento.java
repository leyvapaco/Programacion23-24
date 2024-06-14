package ev2.veterinaria2024;


public class Medicamento implements Comparable<Medicamento> {
	public String nombre;
	public int gramos;
	public double precio;
	
	public Medicamento(String nombre, int gramos, double precio) {
		this.nombre = nombre;
		this.gramos = gramos;
		this.precio = precio;
	}
	
	public int compareTo(Medicamento o) {
		
		if(this.gramos>o.gramos)
	          return -1;
	    else if(o.gramos>this.gramos)
	          return 1;
	    return 0;
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", gramos=" + gramos + ", precio=" + precio + "]";
	}
	
	
	
}
