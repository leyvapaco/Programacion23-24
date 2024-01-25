package u4.t1.maquinaria;

 class Vagon extends Maquinaria {
	private int cargaMax;
	private int capacidadActual;
	private String mercancia;
	

	Vagon(int cargaMax, int capacidadActual, String mercancia){
		this.cargaMax = cargaMax;
		this.capacidadActual = capacidadActual;
		this.mercancia = mercancia;
	}
	
	@Override
	public void getInfoMaquinaria() {
		System.out.println("Carga Maxima de la máquina: "+this.cargaMax+" kilos.");
		System.out.println("Capacidad actual de la máquina: "+this.capacidadActual);
		System.out.println("Tipo de mercancia: "+this.mercancia);
		
	}
	
	public String getMercancia() {
		return mercancia;
	}
	
}