package u4.t1.interfaces;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Principal {
	static String hashWith256(String textToHash) throws NoSuchAlgorithmException {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    byte[] byteOfTextToHash = textToHash.getBytes(StandardCharsets.UTF_8);
	    byte[] hashedByetArray = digest.digest(byteOfTextToHash);
	    String encoded = Base64.getEncoder().encodeToString(hashedByetArray);
	    return encoded;
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Empleado emp1= new Empleado();
		Empleado emp2= new Empleado();
		EmpleadoSalarioComparator comparador= new EmpleadoSalarioComparator();
		
		emp1.setNombre("Juan");
		emp1.setSalario(1200);
		
		emp2.setNombre("Dani");
		emp2.setSalario(1200);
		
		System.out.println(comparador.compare(emp1, emp2));
		
		System.out.println(hashWith256(emp1.getNombre()));
		System.out.println(hashWith256(emp2.getNombre()));

	}

}
