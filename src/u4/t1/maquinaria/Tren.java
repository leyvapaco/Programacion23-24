package u4.t1.maquinaria;

import u4.t1.ferroviaria.Maquinista;

public class Tren extends Maquinaria{
	private Locomotora locomotora;
	private Maquinista maquinista;
	private Vagon[] vagones;
	private int numVagones=0;
	private final int MAX_VAGONES=5;;
	

	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.setLocomotora(locomotora);
	    this.maquinista=maquinista;
	    this.vagones=new Vagon[MAX_VAGONES];
	}
		
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	public void addVagon(Vagon vagon) {
		int i=0;
		while ((this.vagones[i]!=null)&&(i<this.vagones.length)) {
			i++;
		}//Busco la posición del array en la que añadir al estudiante
		
		this.vagones[i]=vagon;
		this.numVagones=i+1;

	}
	
	public void acelera() {
		this.locomotora.acelera();
	};
	
	public void frena() {
		this.locomotora.frena();
	};
	
	
	public Vagon[] getVagones() {
		return vagones;
	}
	

	public Locomotora getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}

	@Override
	public void getInfoMaquinaria() {
		System.out.println("Locomotora: "+getLocomotora().getMatricula());
		System.out.println("Certificada: "+getLocomotora().isCertificado());
		
		//System.out.println("Vagones: "+getVagones());
		for (int i=0;i<this.numVagones;i++) {
			System.out.println(this.vagones[i].getMercancia());
		} //Muestra el contenido de los vagones
		
	}
		
}