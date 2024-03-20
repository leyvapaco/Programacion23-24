package genericos;


public abstract class MaterialOficina {
	protected  String marca; 
	protected  double pvp;
	
	public MaterialOficina(String marca, double pvp) {
		this.marca = marca;
		this.pvp = pvp;
	}

	public String getMarca() {
		return marca;
	}

	public double getPvp() {
		return pvp;
	}


}
