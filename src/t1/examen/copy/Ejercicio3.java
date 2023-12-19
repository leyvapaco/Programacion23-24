package t1.examen.copy;  //Daniel con algunos cambios. OJO media es un número decimal

public class Ejercicio3 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int[] diagonal = new int[5];
		int ultimaLinea=(array.length)-1;
		int maximo = 0;
		int suma = 0;
		double media = 0.0d;
		
		// Creamos el array y lo imprimimos
		for (int i=0; i<array.length; i++) { 
			for (int j=0; j<array.length; j++) {
				array[i][j]= (int) Math.round(Math.random()*10);
				System.out.print(String.format("%02d",array[i][j]));
				System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.print("\nNúmeros de la esquina inferior izquierda a la esquina superior derecha: ");
		// Aquí utilizamos el array diagonal[i] para almacenar los valores de la diagonal de la matriz
		for (int i=0; i<array.length; i++) {
			diagonal[i]=array[ultimaLinea][i];
			ultimaLinea--;
			suma+=diagonal[i]; // Mientras rellenamos el array vamos sumando los valores totales de la diagonal
			
			if (i==0) maximo=diagonal[i]; // Mediante este if else if declaramos el primer valor como nuestro máximo y vamos comparandolo con el resto de valores
			else if (diagonal[i]>maximo) maximo=diagonal[i];
			
			System.out.print(diagonal[i]+" ");
		}
		
		media = ((double)suma/diagonal.length); // Hacemos la media de la suma de los valores de la diagonal
		System.out.println();
		
		System.out.println("El número máximo de la diagonal es: "+maximo);
		System.out.println("La media de todos los números de la diagonal es: "+media);
	}
}
