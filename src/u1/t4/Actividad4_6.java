package u1.t4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad4_6 {
	public static void main(String[] args) {
		LocalDateTime ahora= LocalDateTime.now();
	    int anio = ahora.getYear();
	    int mes = ahora.getMonthValue();
	    int dia = ahora.getDayOfMonth();
	    int hora = ahora.getHour();
	    int minutos = ahora.getMinute();
	    int segundos = ahora.getSecond();
	    
	    System.out.println(hora+":"+minutos);
	    
	}
}
