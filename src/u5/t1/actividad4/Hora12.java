package u5.t1.actividad4;

public class Hora12{
	private int hora;
	private int min;
	private String franjaHoraria;
	
	Hora12(int hora, int min, String franjaHoraria) {
		this.hora=hora;
		this.min=min;
		this.franjaHoraria=franjaHoraria;
	}
	
	public void inc() {
		this.min++; // Sumamos un minuto al reloj
		
		if (this.min>=60) {
			this.hora++;
			this.min=0;
		}
		
		if (this.hora>12) {
			this.hora=1;
			if (this.franjaHoraria.equals("am")) this.franjaHoraria="pm";
			else this.franjaHoraria="am";
		}
	}
	
	public void setMinutos(int valor) {
		if (valor>=0 && valor<60) this.min=valor;
	}
	
	public void setHoras(int valor) {
		if (valor>=0 && valor<=12) this.hora=valor;
	}
	
	@Override
	public String toString() {
		return "(CET) "+this.hora+":"+String.format("%02d", this.min)+" ("+this.franjaHoraria+")";
	}
}
