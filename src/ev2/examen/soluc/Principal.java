package ev2.examen.soluc;

import ev2.examen.soluc.LenteGraduada.PROBLEMA;
import ev2.examen.soluc.LenteSol.COLOR;
import ev2.examen.soluc.Montura.MATERIAL;
import ev2.examen.soluc.Optica.Tipo;


public class Principal {
	
	public static void main(String[] args) {
			 
	Optica opt1= new Optica("Veo veo");
	System.out.println("OPTICA: "+opt1.getNombre());
	
	Proveedor prov1=new Proveedor("22.222.222B","BernadoSunglasses","+34311234");	
	Proveedor prov2=new Proveedor("11.111.111B","AlfonsoVision","+34211233");
				
	Montura mon1= new Montura("Rayban","Rojo",MATERIAL.PASTA);
	Montura mon2= new Montura("Guess","Marrón",MATERIAL.METAL);
	
	LenteGraduada lenGIzd= new LenteGraduada('I',PROBLEMA.MIOPIA,1.2);
	LenteGraduada lenGder= new LenteGraduada('D',PROBLEMA.MIOPIA,0.8);
	LenteSol lenSolIzd= new LenteSol('I',COLOR.VERDE);
	LenteSol lenSolDer= new LenteSol('D',COLOR.VERDE);

		
	Gafa gafaG1= new GafaGraduada(mon1,lenGIzd,lenGder,100.0,200.0);
	Gafa gafaG2= new GafaGraduada(mon2,lenGIzd,lenGder,80.0,150.0);
	Gafa gafaG3= new GafaGraduada(mon2,lenGIzd,lenGder,80.0,150.0);
	
	System.out.println("Observa: ¿Son las gafas gafaG2 y gafaG3 iguales?:"+gafaG2.equals(gafaG3));
	
	Gafa gafaSol1= new GafaSol(mon1,lenSolIzd,lenSolDer,50.0,100.0,prov1);
	Gafa gafaSol2= new GafaSol(mon2,lenSolIzd,lenSolDer,30.0,60.0,prov2);

	opt1.addGafa(Tipo.GRADUADA,gafaG1);
	opt1.addGafa(Tipo.GRADUADA,gafaG2);
	opt1.addGafa(Tipo.SOL,gafaSol1);
	opt1.addGafa(Tipo.SOL,gafaSol2);
			
	Optica.cuantasGafas();//Método estático de la clase Optica

	opt1.gafasByProvedor(); //Requiere que se implemente Comparable en GafaSol o un Comparator basado en el nombre del proveedor 
	opt1.costeGafasByTipo(Tipo.GRADUADA);
	opt1.costeGafasByTipo(Tipo.SOL);
	
	try {
		opt1.damePrecioGafa(gafaG1);
		opt1.damePrecioGafa(gafaG2);
		opt1.damePrecioGafa(gafaSol1);
		opt1.damePrecioGafa(gafaSol2);
		System.out.println("\nDescuento de 25% a la primera gafa (coste 100, pvp 200)");
		gafaG1.aplicarDescuento(25);
		opt1.damePrecioGafa(gafaG1);
		//Restablezco PVP original a gafaG1
		gafaG1.setPrecioVenta(200);
		System.out.println("\nDescuento 70% a la primera gafa (coste 100, pvp 200)");
		gafaG1.aplicarDescuento(70); //Debe lanzar excepción propia
		opt1.damePrecioGafa(gafaG1);
	}catch (VentasPerdidasException e) {
        System.out.println("Error: " + e.getMessage());
    } 
		
	//pruebo ficheros
	opt1.pruebaFicheros();
	
	System.out.println("\nBorrado:");
	opt1.delGafas(gafaSol2);//Borro una gafa del proveedor AlfonsoVision
	Optica.cuantasGafas();
	opt1.gafasByProvedor();
	
	}
}
