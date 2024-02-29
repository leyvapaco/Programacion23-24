package u7.ejemplos2;


//Clase Cliente
public class Articulo implements Comparable<Articulo> {
 private String codigo;
 private String descripcion;
 private double precio;
 
 
 
public Articulo(String codigo, String descripcion, double precio) {
	super();
	this.codigo = codigo;
	this.descripcion = descripcion;
	this.precio = precio;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
@Override
public int compareTo(Articulo o) {
	return this.codigo.compareTo(o.codigo);

}
@Override
public String toString() {
	return "Articulo " + descripcion ;
}


 
}

