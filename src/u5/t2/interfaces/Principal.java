package u5.t2.interfaces;

import java.util.Arrays;

import u4.t1.interfaces.EmpleadoSalarioComparator;

public class Principal {
public static void main(String[] args) {
	
	final int MAX_CLI=5;
	Cliente[] cliente= new Cliente[MAX_CLI];
	
	Cliente c1=new Cliente("23.346.431B","Berta",21,100.0);	
	Cliente c2=new Cliente("23.346.431A","Carlos",19,200.0);
	Cliente c3=new Cliente("23.346.431C","Ana",23,300.0);
	Cliente c4=new Cliente("23.346.431D","David",24,400.0);
	Cliente c5=new Cliente("23.346.431E","Eva",25,500.0);

	cliente[0]=c1;
	cliente[1]=c2;
	cliente[2]=c3;
	cliente[3]=c4;
	cliente[4]=c5;
	
	// Probamos el equals
	boolean b;	
	b=c1.equals(c2);	
	System.out.println(b);
		
	// Probamos el compareTo que implementa Comparable directamente sobre 2 objetos
	System.out.println(c4.compareTo(c5));
	
	// Mostramos array en el orden natural (el introducido)
	System.out.println(Arrays.toString(cliente));
		
		
	// Usando COMPARABLE: Mostramos array en el orden del compareTo de la clase Cliente (por DNI)
	Arrays.sort(cliente);
	System.out.println(Arrays.toString(cliente));

	// Usando COMPARATOR:Comparamos por DNI y mostramos array
	
	ClienteDNIComparator comparadorDNI= new ClienteDNIComparator();

	Arrays.sort(cliente,comparadorDNI);
	
	System.out.println(Arrays.toString(cliente));
	
		
	//Usando COMPARATOR: Comparamos por edad y mostramos array
	
	ClienteEdadComparator comparadorEdad= new ClienteEdadComparator();

	Arrays.sort(cliente,comparadorEdad);
	
	System.out.println(Arrays.toString(cliente));

	// Usando COMPARATOR:Comparamos por nombre y mostramos array
	
	ClienteNombreComparator comparadorNombre= new ClienteNombreComparator();

	Arrays.sort(cliente,comparadorNombre);
	
	System.out.println(Arrays.toString(cliente));
	
	System.out.println(Arrays.toString(cliente));

}
}
