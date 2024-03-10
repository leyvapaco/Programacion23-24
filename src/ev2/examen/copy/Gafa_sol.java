package ev2.examen.copy;

import ev2.examen.Lente.POSICION;

public class Gafa_sol extends Gafa implements Promocion{
	protected String nombreProveedor;
	

	Gafa_sol(Integer id, Montura mont, LenteSol lenteD, LenteSol lenteI, int coste, int precioVenta,Proveedor proveedor) {
		super(id, mont, coste, precioVenta);
		this.nombreProveedor = proveedor.getNombre();
		this.setLenteD(lenteD);
		this.setLenteI(lenteI);
		this.tipo = "sol";
		// TODO Auto-generated constructor stub
	}
	public Lente getLenteI() {
		return lenteI;
	}

	public void setLenteI(LenteSol lenteI) {
	if(lenteI.getPos() == POSICION.I) {
		this.lenteI = (Lente) lenteI;
	}
	else {
		System.out.println("no se introduccieron las lentes correctamente (Compruebe posicion)");
		System.out.println("Utiliza los metodos Set y Get para establecerlos bien.");	
	}
		

	}
	public Lente getLenteD() {
		return lenteD;
	}

	public void setLenteD(LenteSol lenteD) {
		if(lenteI.getPos() == POSICION.D) {
			this.lenteD = lenteD;
		}
		else {
			System.out.println("no se introduccieron las lentes correctamente (Compruebe posicion)");
			System.out.println("Utiliza los metodos Set y Get para establecerlos bien.");	
		}
	}
	@Override
	public void aplicarDescuento() throws VentasPerdidasEx {
		
		if((this.precioVenta -(this.precioVenta * 20 / 100)) < this.coste){
			throw new VentasPerdidasEx();
		}
		else
			this.precioVenta = this.precioVenta -(this.precioVenta * 12 / 100);
	}
	
	
}
