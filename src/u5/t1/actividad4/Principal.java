package u5.t1.actividad4;



public class Principal {
	public static void main(String[] args) {
		Hora12 hora12 = new Hora12(11, 55, "am");
		
		System.out.println(hora12.toString());
		
		for(int i=0; i<10; i++) hora12.inc();
		
		System.out.println(hora12.toString());
		
		for(int j=0; j<55; j++) hora12.inc();
		
		System.out.println(hora12.toString());
		
		for(int j=0; j<200; j++) hora12.inc();
		
		System.out.println(hora12.toString());
		
		for(int j=0; j<50; j++) hora12.inc();
		
		System.out.println(hora12.toString());
		
		for(int j=0; j<50; j++) hora12.inc();
		
		System.out.println(hora12.toString());
		

	}
}
