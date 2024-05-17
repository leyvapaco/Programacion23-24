package quienesquienv3;

public class Pistas {
	private String[] listaPistas;
	private int cuantasPistasHay=0;

	public Pistas(int tam){
		listaPistas=new String[tam];
	}

	public void addPista(String pista) {

		if ((cuantasPistasHay)<listaPistas.length) {
			listaPistas[cuantasPistasHay]=pista;
			cuantasPistasHay++;
		}
	}
	
	public int dameUnaPista() {
		 int posicion= (int) (Math.random() * listaPistas.length);
		 System.out.println("PISTA: "+listaPistas[posicion]);
		 return(posicion);
	}
	
	public void delPista(int posicionPista) {
		try {
			for (int i=posicionPista;i<cuantasPistasHay-1;i++) {
					listaPistas[i]=listaPistas[i+1];
					}
					cuantasPistasHay--;
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error "+(e.getMessage()));
		}
		
	}

	void muestraPistas() {
		for (int i=0; i<cuantasPistasHay;i++) {
			System.out.println(listaPistas[i]);
		}
	}
}
