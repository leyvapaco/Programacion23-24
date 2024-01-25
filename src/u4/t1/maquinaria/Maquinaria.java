package u4.t1.maquinaria;


public  class Maquinaria implements Homologado {
	private boolean certificado=false;
	
	public void getInfoMaquinaria() {};
	
	public void certifica(String identidad) {
		this.certificado=true;
		System.out.println("Certifificando maquinaria con ID: "+identidad);
	}

	public boolean isCertificado() {
		return certificado;
	} ;
		
}