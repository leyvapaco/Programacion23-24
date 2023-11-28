package u2.t2;

public class excepciones2 {
public static void main(String[] args) {
	int c;
	int a = 1;
	int b = 0;
	try {
	c = a / b;
	} catch (Exception e) {
	System.out.println("Estoy en el primer catch");
	System.out.println(e.getMessage());
	} finally {
		System.out.println("adios");
	}

}
}
