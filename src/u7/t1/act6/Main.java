package u7.t1.act6;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nombresLinked = new LinkedHashSet<String>();
        Set<String> nombresTree = new TreeSet<String>();
        
        //Adicionalmente a lo que pide el ejercicio, los mostraremos por 
        //orden alfabetico, para ello usaremos un TreeSet

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        String nombre;
        while (!(nombre = scanner.nextLine()).equals("fin")) {
            nombresLinked.add(nombre);
            nombresTree.add(nombre);
        }

        System.out.println("Lista de nombres introducidos (LinkedHashSet orden de inserción):");
        System.out.println(nombresLinked);
        
        System.out.println("Lista de nombres introducidos (TreeSet orden natural):");
        System.out.println(nombresTree);
    }
}

