package u3.t3;
import java.util.Scanner;

// solución con string para la palabra secreta (apruebo)
// y char[] para la palabra oculta (ap_u_b_)

public class ahorcado2 {
	
	// Genera la palabra a adivinar de forma aleatoria
	public static String damePalabraSecreta() {
		String[] palabras= {"estudiar","practicar","persistir","aprobar"};
		
		int elegida = (int) (Math.random()*palabras.length);
		
		return palabras[elegida];		
	}

	// Rellena la palabra de guiones
	public static char[] ocultaPalabra(String palabra) {
		
		char[] palabraC = palabra.toCharArray();
		
		for (int i=0;i<palabra.length();i++) {
			palabraC[i]='-';			
		}
		return palabraC;
	}
	
	// Si la letra está en la palabra, la desvela
	public static boolean desvelaLetra(String palabra,char[] palabraOculta, char letra) {
		
		boolean encontrada=false;
		
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)==letra) {
				palabraOculta[i]=letra;
				encontrada=true;
			}	
		}
		return(encontrada);
	}
	
	// Comprueba si he acertado
	public static boolean heAcertado(String palabra,char[] palabraOculta) {
		
		boolean acertado=true;
		
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)!=palabraOculta[i]) 
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
		
		char[] palabraOculta=ocultaPalabra(palabraSecreta);
		
		System.out.println(palabraOculta);
		
		while (intentos>0 && !acertado) {
			
			System.out.println("\nDime letra:");
			letra=sc.nextLine().charAt(0);
					
			if (!desvelaLetra(palabraSecreta,palabraOculta,letra)){
				intentos--;
				System.out.println("fallo...intentos restantes:"+intentos+"\n");
			}
					
			if (heAcertado(palabraSecreta,palabraOculta)){
				System.out.println("Enhorabuena!!");
				acertado=true;
			}				
			
			System.out.println(palabraOculta);				
		}		
	}
}
