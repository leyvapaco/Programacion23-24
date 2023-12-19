package u2.t2;


public class excepciones4 {
	
	public static class ExcepcionIntervalo extends Exception {
	    public ExcepcionIntervalo(String msg) {
	        super(msg);
	    }
	}
	
    static void rango(int num, int den)throws ExcepcionIntervalo{
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("Números fuera de rango");
        }
    }
	
	
    public static void main(String[] args) {
        String str1="120";
	String str2="";
        String respuesta;
	int numerador, denominador, cociente;
        try{
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            rango(numerador, denominador);
            cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }
        System.out.println(respuesta);
    }


}