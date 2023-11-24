package u3.t3;
import java.util.Scanner;

//Solución con String y Stringbuilder

public class ahorcado {
	
	// Genera la palabra a adivinar de forma aleatoria
	public static String damePalabraSecreta() {
		String[] palabras= {"estudiar","practicar","persistir","aprobar"};
		
		int elegida = (int) (Math.random()*palabras.length);
		
		return palabras[elegida];		
	}

	// Rellena la palabra de guiones
	public static void ocultaPalabra(StringBuilder palabra) {
		for (int i=0;i<palabra.length();i++) {
			palabra.setCharAt(i,'-');			
		}
	}
	
	// Si la letra está en la palabra, la desvela
	public static boolean desvelaLetra(String palabra,StringBuilder palabraOculta, char letra) {
		
		boolean encontrada=false;
		
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)==letra) {
				palabraOculta.setCharAt(i,letra);
				encontrada=true;
			}	
		}
		return(encontrada);
	}
	
	// Comprueba si he acertado
	public static boolean heAcertado(String palabra,StringBuilder palabraOculta) {
		
		boolean acertado=true;
		
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)!=palabraOculta.charAt(i)) 
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
				
		palabraSecreta=damePalabraSecreta(); 
		
		System.out.println(palabraSecreta); // Escribo la palabra secreta para poder comprobar que funciona
		
		StringBuilder palabraOculta=new StringBuilder(palabraSecreta);
		
		ocultaPalabra(palabraOculta); // Relleno con guiones la palabra secreta
		
		System.out.println(palabraOculta);
		
		while (intentos>0 && !acertado) {
			
			System.out.println("\nDime letra:");
			letra=sc.nextLine().charAt(0);
			
			// Si la letra está en la palabra, la muestra
			if (!desvelaLetra(palabraSecreta,palabraOculta,letra)){
				intentos--;
				System.out.println("fallo...intentos restantes:"+intentos+"\n");
			}
					
			// Comprueba si he acertado la palabra completa
			if (heAcertado(palabraSecreta,palabraOculta)){
				System.out.println("Enhorabuena!!");
				acertado=true;
			}				
			
			System.out.println(palabraOculta);				
		}			
	}
}
