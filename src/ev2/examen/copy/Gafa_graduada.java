package ev2.examen.copy;

import ev2.examen.Lente.POSICION;

public class Gafa_graduada extends Gafa implements Promocion{
	

	Gafa_graduada(Integer id, Montura mont, LenteGraduada lenteD, LenteGraduada lenteI, int coste, int precioVenta) {
		super(id, mont, coste, precioVenta);
		this.tipo = "graduada";
		// TODO Auto-generated constructor stub
	}
	
	public Lente getLenteI() {
		return lenteI;
	}

	public void setLenteI(LenteGraduada lenteI) {
	if(lenteI.getPos() == POSICION.I) {
		this.lenteI = lenteI;
	}
	else {
		System.out.println("no se introduccieron las lentes correctamente (Compruebe posicion)");
		System.out.println("Utiliza los metodos Set y Get para establecerlos bien.");	
	}
		

	}
	public Lente getLenteD() {
		return lenteD;
	}

	public void setLenteD(LenteGraduada lenteD) {
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
		
		if((this.precioVenta -(this.precioVenta * 12 / 100)) < this.coste){
			throw new VentasPerdidasEx();
		}
		else
			this.precioVenta = this.precioVenta -(this.precioVenta * 12 / 100);
			
		
	}

	
}
