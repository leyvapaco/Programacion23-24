package genericos;

import java.util.ArrayList;


import java.util.List;

public class Genericos3 {
	
	public static <V> ArrayList<V> convertToArrayList(V [] array){
	    ArrayList<V> miLista = new ArrayList<>();
	         
	    for (V numero: array){
	        miLista.add(numero);
	    }
	         
	    return miLista;
	}

	
	public static void main(String[] args) {

		Integer [] numerosEnteros = new Integer [] {1,2,3,4,5};
		Float [] numerosFlotantesSimples = new Float[] {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
		Double [] numerosFlotantes = new Double[] {6.0, 7.0, 8.0, 9.0, 10.0};

		
		System.out.println(convertToArrayList(numerosEnteros));
		System.out.println(convertToArrayList(numerosFlotantesSimples));
		System.out.println(convertToArrayList(numerosFlotantes));
	}
		
}
