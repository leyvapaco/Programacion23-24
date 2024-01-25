package u4.t1.maquinaria;


public abstract class Maquinaria implements Homologado {
	private boolean certificado=false;
	
	public abstract void getInfoMaquinaria();
	
	public void certifica(String identidad) {
		this.certificado=true;
		System.out.println("Certifificando maquinaria con ID: "+identidad);
	}

	public boolean isCertificado() {
		return certificado;
	} ;
		
}