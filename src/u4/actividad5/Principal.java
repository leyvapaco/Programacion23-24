package u4.actividad5;

public class Principal {
	public static void main(String[] args) {
		Texto t1=new Texto("OLA",14);
		Texto t2=new Texto("ELLO",5);

		t1.muestraCadena();		
		t1.addCaracterDelante('M');
		t1.muestraCadena();
		t1.addCaracterDetras('S');
		t1.muestraCadena();
		t1.addCadenaDetras("mucho");
		t1.muestraCadena();
		t1.addCadenaDelante("pues");
		t1.muestraCadena();
		System.out.println();
		t1.cuentaVocales();
		
		System.out.println();
		t2.muestraCadena();		
		t2.addCaracterDelante('H');
		t2.muestraCadena();			
		
	}
}
