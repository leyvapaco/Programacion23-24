package ev2.veterinaria2024.v2;

public class Serpiente extends Animal implements Contacta{
	private String especie;
	private boolean esVenenosa;
	
	public Serpiente( Sexo sex, Propietario propietario, String especie, boolean esVenenosa) {
		super(sex, propietario);
		this.especie = especie;
		this.esVenenosa = esVenenosa;
	}	
	
	public void contactaPropietario() {
		//Obtenemos con getClass() la clase a la que pertenece el objeto
		System.out.println("Contactando al propietario del "+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "Serpiente [especie=" + especie + ", id=" + id + "]";
	}
	
	
}
