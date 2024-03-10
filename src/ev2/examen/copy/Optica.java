package ev2.examen.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Optica {
	protected Map<Integer,Gafa> stock;
	protected List<Gafa_sol> stock_gafaSol;
	protected List<Gafa_graduada> stock_gafaGrad;
	protected int contadorStock; 
	protected int costeTotalTipo;
	
	Optica(){
		this.stock= new HashMap<Integer,Gafa>();
		this.stock_gafaGrad = new ArrayList<Gafa_graduada>();
		this.stock_gafaSol = new ArrayList<Gafa_sol>();
	}
	
	public void addGafas(String tipo, Gafa gafa) {
		
		this.stock.put(gafa.id, gafa);
		
		
		if(tipo.equals("sol"))
			this.stock_gafaSol.add((Gafa_sol) gafa);
		else
			this.stock_gafaGrad.add((Gafa_graduada) gafa);
	
		contadorStock ++;
	}
	
	public void cuantasGafas() {
		System.out.println("El numero de gafas en Stock es: "+contadorStock);
	}
	
	public void delGafas(Gafa gafas) {
		
		this.stock.remove(gafas.id, gafas);
		
		if(gafas.tipo.equals("sol")) 
			this.stock_gafaSol.remove(gafas);
		else
			this.stock_gafaGrad.remove(gafas);
		contadorStock --;
	}
	
	public void damePrecioGafa(Gafa gafas) throws VentasPerdidasEx {
		if(gafas.tipo.equals("sol")) {
			((Gafa_sol) gafas).aplicarDescuento();
			System.out.println("El precio de venta es: "+gafas.precioVenta);
		}
		else {
			((Gafa_graduada) gafas).aplicarDescuento();
			System.out.println("El precio de venta es: "+gafas.precioVenta);
		}
	}
	
	
	public void gafasByProvedor() {
		Collections.sort(this.stock_gafaSol,new ComparadorNombre());
		System.out.println(this.stock_gafaSol);
	}
	
	public void costeGafasTipo(String tipo) {
		int costeTotal = 0;
		
		if(tipo.equals("sol")) {
			Iterator<Gafa_sol> it = this.stock_gafaSol.iterator();
			while(it.hasNext()) {
			costeTotal+= it.next().coste;
			}
		
		System.out.println("el coste total es: "+ costeTotal);
		}
	}	
		
	public void generarFichero() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("gafas.dat"));
			oos.writeObject(stock_gafaSol);
			oos.flush();
			oos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void cargarFichero() {
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("gafas.dat"));
			try {
				this.stock_gafaSol = (List<Gafa_sol>) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
		
}
	
	
	
	
	

