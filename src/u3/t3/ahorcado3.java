package u3.t3;
import java.util.Scanner;

//Solución con char[7][2] 
// {{'a','-'},{'p','-'},{'r','-'},{'u','-'},{'e','-'},{'b','-'},{'o','-'}}

public class ahorcado3 {
	
	// Genera la palabra a adivinar de forma aleatoria
	public static String damePalabraSecreta() {
		String[] palabras= {"estudiar","practicar","persistir","aprobar"};
		
		int elegida = (int) (Math.random()*palabras.length);
		
		return palabras[elegida];		
	}

	// Rellena la palabra de guiones
	public static char[][] ocultaPalabra(String palabra) {
		
		
		char[][] palabraO= new char[palabra.length()][2];
		
		for (int i=0;i<palabra.length();i++) {
			palabraO[i][0]=palabra.charAt(i);
			palabraO[i][1]='-';			
		}
		return palabraO;
	}
	
	public static void escribePalabra(char[][] palabra) {
		
		for (int i=0;i<palabra.length;i++) {
			System.out.print(palabra[i][1]);
		}

	}
	
	// Si la letra está en la palabra, la desvela
	public static boolean desvelaLetra(char[][] palabraOculta, char letra) {
		
		boolean encontrada=false;
		
		for (int i=0;i<palabraOculta.length;i++) {
			if (palabraOculta[i][0]==letra) {
				palabraOculta[i][1]=letra;
				encontrada=true;
			}	
		}
		return(encontrada);
	}
	
	// Comprueba si he acertado
	public static boolean heAcertado(String palabra,char[][] palabraOculta) {
		
		boolean acertado=true;
		
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)!=palabraOculta[i][1]) 
				acertado=false;	
		}
		return(acertado);
	}
	
		
	public static void main(String[] args) {
		
		String palabraSecreta="";				
		int intentos=5;		
		char letra;
		boolean acertado=false;
		Scanner sc = new Scanner(System.in);
				
		palabraSecreta=damePalabraSecreta(); //
		
		System.out.println(palabraSecreta); //esc
		
		//StringBuilder palabraOculta=new StringBuilder(palabraSecreta.substring(0, palabraSecreta.length()));
		
		char[][] palabraOculta=ocultaPalabra(palabraSecreta);
		

		escribePalabra(palabraOculta);
		//System.out.println(palabraOculta); //ojo, esto escribe la dirección de memoria
		
		while (intentos>0 && !acertado) {
			
			System.out.println("\nDime letra:");
			letra=sc.nextLine().charAt(0);
					
			if (!desvelaLetra(palabraOculta,letra)){
				intentos--;
				System.out.println("fallo...intentos restantes:"+intentos+"\n");
			}
					
			if (heAcertado(palabraSecreta,palabraOculta)){
				System.out.println("Enhorabuena!!");
				acertado=true;
			}				
			
			escribePalabra(palabraOculta);				
		}		
	}
}
