package u7.t3b.act4;

public class Principal_Traductor {
	
	public static void main (String[] arg) {
		/*Prueba para traductor
		 * */
		Traductor d1 = new Traductor("diccionario");
		
	 System.out.println("hola:"+d1.traduce("hola"));
	 System.out.println("perro:"+d1.traduce("perro"));
	 System.out.println("flaco:"+d1.traduce("flaco"));
	}

}
