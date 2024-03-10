package ev2.examen.soluc;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ev2.examen.soluc.Optica.Tipo;


public class Ficheros {
	public static void escribeFicheroSol(Map<Tipo,Set<Gafa>> stock ) {

        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("C:\\pruebaficheros\\gafas.dat"));
            Iterator<Gafa> itr = stock.get(Tipo.SOL).iterator();
       
            while (itr.hasNext()) {
                Gafa  e = (GafaSol) itr.next();
                s.writeObject(e);
            }  	            
            s.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
	
	 public static void cargaFicheroSol() {
		 	double costeTotal=0.0;
		 	int numGafas=0;
		 
	        try {
	            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\pruebaficheros\\gafas.dat"));
	            Object aux = ois.readObject();

	            // Mientras haya objetos
	            while (aux!=null)
	            {
	                if (aux instanceof GafaSol) {               
	                    costeTotal+=((GafaSol) aux).getCoste();
	                    numGafas++;
	                }
	                aux = ois.readObject();
	            }
	            ois.close();

	        }catch (EOFException e) {
	            System.out.println("\nFichero cargado con "+numGafas+" gafas de sol");
	        } catch (Exception ex) {
	            System.out.println("Mensaje: " + ex.getMessage());
	        }
	        System.out.println("Coste total de las gafas cargadas:"+costeTotal);;
	    }
	
}
