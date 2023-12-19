package loteria;
import java.util.Scanner;
public class loteriaExamen {
	

	
		
		//devuelve un array de tamaño numBolas con todos los números del sorteo
		public static int[] creaBomboNumeros(int numBolas) {
			int[] bomboNumeros = new int[numBolas];
			
			for (int i=0;i<numBolas;i++)
				bomboNumeros[i]=i;
			
			return bomboNumeros;
		}
		
		//devuelve un array de tamaño numPremios con todos los premios del sorteo
		public static String[] creaBomboPremios(int numPremios) {
			String[] bomboPremios = new String[numPremios];
			
			bomboPremios[0]="primero";  // gordo de navidad
			bomboPremios[1]="segundo";	// un segundo premio
			bomboPremios[2]="tercero";	// un tercer premio
			bomboPremios[3]="cuarto"; 	// dos cuartos premios
			bomboPremios[4]="cuarto";
			
			// 8 quintos premios
			for (int i=5;i<=12;i++)
				bomboPremios[i]="quinto";
			
			// el resto hasta completar 1.807 premios son "pedrea"
			for (int i=13;i<numPremios;i++)
				bomboPremios[i]="pedrea";
			
			return bomboPremios;
		}
		
		//devuelve un numero al azar del bombo de números, que será objeto de un premio.
		public static int dameNumero(int[] bombo) {
			
			int numAgraciado = (int) (Math.random()*bombo.length);

			// si el número ya había salido, generamos otro al azar
			while (bombo[numAgraciado]==-1)
				numAgraciado = (int) (Math.random()*bombo.length);
			
			// marcamos el número que ha salido con -1 para que no vuelva a salir
			bombo[numAgraciado]=-1;
			
			return numAgraciado;
		}
		
		//devuelve un premio al azar del bombo de premios
		public static String damePremio(String[] bombo) {
			
			String premio;
			
			int indicePremiado = (int) (Math.random()*bombo.length);

			// si el premio ya había salido, generamos otro al azar
			while (bombo[indicePremiado]=="")
				indicePremiado = (int) (Math.random()*bombo.length);
			
			premio=bombo[indicePremiado];
			 
			// marcamos el premio que ha salido con una cadena vacía
			bombo[indicePremiado]="";
	 				
			return premio;
		}
		
		//Comprueba si he sido agraciado
		public static String heSidoAgraciado(String[][] listaSorteo, String miDecimo){
			String premio="Número no premiado"; //valor por defecto
				
			for (int i=0;i<listaSorteo.length;i++) {
				if (listaSorteo[i][0].equals(miDecimo)) //he pillado algo
						premio=("Agraciado con: "+listaSorteo[i][1]);
				}
				
			return (premio);
		}
		
		public static String premioCercania(String[][]listaSorteo, String miDecimo) {
			String cercania="";
			String numTerminacion="";
			int terminacion=0;
				
				for(int i=miDecimo.length()-1;i<=0;i++) {
					if(miDecimo.charAt(i)==listaSorteo[i][0].charAt(i))
						terminacion++;
				}
				numTerminacion= terminacion + "terminaciones";
				return numTerminacion;
			
			
		}
		public static void main(String[] args) {
			
			final int MAX_NUMEROS=100000; // números del sorteo
			final int MAX_PREMIOS=1807;   // premios del sorteo
			
			int numeroAgraciado; //número que sale del bombo
			String premio=""; //premio que sale del bombo
			
					
			int[] bomboBolas = new int[MAX_NUMEROS];
			String[] bomboPremios = new String[MAX_PREMIOS];
			String[][] listaOficialSorteo = new String[MAX_PREMIOS][2]; // [i][0]: número agraciado  [i][1]: premio
			
			try {
			
				//Introducimos las bolas en los bombos
				bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
				bomboPremios=creaBomboPremios(MAX_PREMIOS);
				
				System.out.println("Listado oficial de premios:\n");
			
				int j=0;
				for (int i=0;i<MAX_PREMIOS;i++) {
					//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
					numeroAgraciado=dameNumero(bomboBolas);
					String numeroFormateado=String.format("%05d",numeroAgraciado);
				
					//Sacamos un premio del bombo
					premio=damePremio(bomboPremios);
					
					//Añado el número y su premio a la lista oficial del sorteo
					listaOficialSorteo[j][0]=numeroFormateado;
					listaOficialSorteo[j][1]=premio;
					j++;
					
					System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
				}
				
				Scanner sc=new Scanner(System.in);	
				String miDecimo;
				
				//Compruebo si me ha tocado la lotería
				do {
					System.out.println("\nIntroduzca su décimo con todas las cifras:"); 
					miDecimo=sc.next();
				} while ((miDecimo.length()!=5) || (!miDecimo.matches("[0-9]+")));
				
				System.out.println(premioCercania(listaOficialSorteo, miDecimo));
				
				System.out.println(heSidoAgraciado(listaOficialSorteo, miDecimo));
				
			}catch (Exception e) {
					System.out.println("Error:"+e.getMessage());
					} finally {
						System.out.println("\nSorteo finalizado");			
					}		
		}
	}

