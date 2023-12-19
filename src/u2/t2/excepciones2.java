package u2.t2;

public class excepciones2 {
public static void main(String[] args) {
	int c;
	int a = 1;
	int b = 1;
	String s;
	char c1='p';
	char c2='a';
	int i1;
	
	try {
	c = a / b;
	i1=(int)c1;
	
	s=c1+c2+"";  // suma los valores enteros del código ascii: 209
	System.out.println(s.getClass());
	
	//s=Character.toString(c1)+Character.toString(c2); 
	s=String.valueOf(c1)+String.valueOf(c2); 
	
	System.out.println(s);
	
		
	} catch (Exception e) {
	System.out.println("Estoy en el primer catch");
	System.out.println(e.getMessage());
	} finally {
		System.out.println("fin");
	}

}
}
