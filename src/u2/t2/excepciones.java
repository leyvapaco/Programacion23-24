package u2.t2;

public class excepciones {
public static void main(String[] args) {
	int c;
	int a = 1;
	int b = 0;
	try {
	c = a / b;
	} catch (ArithmeticException e) {
	System.out.println("Estoy en el primer catch");
	} catch (Exception e) {
	System.out.println("Estoy en el segundo catch");
	}

}
}
