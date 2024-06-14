package ev2.veterinaria2024.v2;

public abstract class Domestico extends Animal{
	private String nombre;
	protected String raza;
	private int edad;
	protected double peso;
	private String chip;
	

	public Domestico( Sexo sex, Propietario propietario, String nombre, String raza, int edad, double peso,
			String chip) {
		super( sex, propietario);
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.chip = chip;
	}




	public abstract void cortaUnas();

}
