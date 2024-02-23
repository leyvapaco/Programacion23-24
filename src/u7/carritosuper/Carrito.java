package u7.carritosuper;

import java.util.List;
import java.util.Stack;

//Clase Cliente
public class Carrito{
 private Cliente cliente;
 private List<Articulo> articulos;
 private String cp;
 private String direccion="";

 public Carrito(Cliente cliente, String cp, Stack<String> domicilio )  {
    this.cliente = cliente;
    this.cp = cp;
    while (!domicilio.isEmpty())
    	this.direccion=this.direccion+"\\"+domicilio.pop();
 }

 public void add_articulos(List<Articulo> articulos) {
 	this.articulos=articulos;
 }
 
@Override
public String toString() {
	return "Carrito [cliente=" + cliente + ", articulos=" + articulos + ", cp=" + cp + ", direccion=" + direccion + "]";
} 
 
}

