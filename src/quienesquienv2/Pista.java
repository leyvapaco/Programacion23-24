package quienesquienv2;

public class Pista {
	private String atributo;
	private String valor;
		
	public Pista() {}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pista [atributo=" + atributo + ", valor=" + valor + "]";
	}

	
	
	
}

