package u4.actividad5;

public class Texto {
	private int longMax=0;
	private StringBuffer sB;
	
	Texto(String texto,int longMax){
		sB=new StringBuffer(longMax);
		sB.append(texto,0,texto.length()); //char[],offset,len
		this.longMax=longMax;
	}
	
	public void addCaracterDetras(char caracter) {
		if (this.sB.length()<this.longMax) 
			this.sB.append(caracter);

	}
	
	public void addCaracterDelante(char caracter) {
		if (this.sB.length()<this.longMax) {
			StringBuffer sbTmp= new StringBuffer();
			sbTmp.append(caracter);
			sbTmp.append(this.sB);
			this.sB=sbTmp;		
		}
	}
	
	public void addCadenaDetras(String cadena) {
		if ((this.sB.length()+cadena.length())<=this.longMax) 
			this.sB.append(cadena);

	}
	
	public void addCadenaDelante(String cadena) {
		if (((this.sB.length()+cadena.length())<=this.longMax)) {
			StringBuffer sbTmp= new StringBuffer(cadena);
			sbTmp.append(this.sB);
			this.sB=sbTmp;		
		}
	}
	
	public void cuentaVocales() {
		
		int numVocales=0;

		for (int i=0; i<this.sB.length(); i++) {
		    char actual = this.sB.toString().toLowerCase().charAt(i);

		    switch (actual) {
		        case 'a','e','i','o','u':
		            numVocales++;
		            break;
		        default:
		            break;
		    }
		}
		System.out.println("Vocales:"+numVocales);
	}
	
	public void muestraCadena() {
		System.out.println(this.sB);
	}
	
}
