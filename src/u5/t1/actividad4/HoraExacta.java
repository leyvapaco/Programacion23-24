package u5.t1.actividad4;

import java.util.Comparator;

public class HoraExacta extends Hora implements Comparator<HoraExacta> {
	private int hora;
	private int min;
	private int seg;
	
	HoraExacta(int hora, int min, int seg) {
		super(hora, min);
		this.seg=seg;
	}
	
	public void setSegundos(int valor) {
		if (valor>=0 && valor<60) this.seg=valor;
	}
	
	@Override
	public void inc() {
		this.seg++; // Sumamos un segundo al reloj
		
		if (this.seg>=60) {
			this.min++;
			this.seg=0;
		}
		
		if (this.min>=minMax) {
			this.hora++;
			this.min=0;
		}
		
		if (this.hora>=horaMax) {
			this.hora=0;
		}
	}
	
	// Compara con una hora que ingresemos vía parámetros
	public boolean horaEsIgual(int hora, int min, int seg) {
		if (this.hora==hora && this.min==min && this.seg==seg) {
			System.out.println("Las horas son iguales.");
			return true;
		}
		else {
			System.out.println("Las horas son distintas.");
			return false;
		}
	}
	
	// Compara con otro objeto hora
	// 1 : hora1>hora2 ; -1 : hora1<hora2 ; 0 : hora1==hora2
	public int compare(HoraExacta hora1, HoraExacta hora2) {
		if (hora1.hora>hora2.hora) return 1;
		else if (hora1.hora<hora2.hora) return -1;
		else  {
			if (hora1.min>hora2.min) return 1;
			else if (hora1.min<hora2.min) return -1;
			else {
				if (hora1.seg>hora2.seg) return 1;
				else if (hora1.seg<hora2.seg) return -1;
				else return 0;
			}
		}
	}
	
	@Override
	public String toString() {
		return "(CET) "+this.hora+":"+String.format("%02d", this.min)+":"+String.format("%02d", this.seg);
	}
}