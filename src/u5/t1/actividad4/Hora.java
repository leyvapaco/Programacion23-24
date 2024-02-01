package u5.t1.actividad4;

public class Hora {
	protected int hora;
	protected int min;
	protected int minMax=60;
	protected int horaMax=24;
	protected int globalMin=0;
	
	Hora(int hora, int min) {
		this.hora=hora;
		this.min=min;
	}
	
	public void inc() {
		this.min++; // Sumamos un minuto al reloj
		
		if (this.min>=60) {
			this.hora++;
			this.min=0;
		}
		
		if (this.hora>=24) {
			this.hora=0;
			System.out.println("Se pasaría al siguiente día");
		}
	}
	
	public void setMinutos(int valor) {
		if (valor>=0 && valor<60 ) this.min=valor;
	}
	
	public void setHoras(int valor) {
		if (valor>=0 && valor<24) this.hora=valor;
	}
	
	@Override
	public String toString() {
		return "(CET) "+String.format("%02d", this.hora)+":"+String.format("%02d", this.min);
	}
}

