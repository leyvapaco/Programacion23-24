package u4.t1.maquinaria;

import u4.t1.ferroviaria.Mecanico;

public class Locomotora extends Maquinaria implements Vehiculo {
	private String matricula;
	private int potencia;
	private String anoFabricacion;
	private Mecanico mecanico;

	
	public Locomotora(String matricula, int potencia, String anoFabricacion,Mecanico mecanico){
		this.matricula = matricula;
		this.potencia = potencia;
		this.anoFabricacion = anoFabricacion;
		this.mecanico=mecanico;
		this.certifica(matricula);
	
		
	}
	
	public void acelera() {
		System.out.println("Acelerando...");
	};
	
	public void frena() {
		System.out.println("Frenando...");
	};
	
	
	
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}



	@Override
	public void getInfoMaquinaria() {
		System.out.println("Matrícula: "+this.matricula);
		System.out.println("Potencia: "+this.potencia);
		System.out.println("Año de fabricación: "+this.anoFabricacion);
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
}