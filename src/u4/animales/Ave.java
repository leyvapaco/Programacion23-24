package u4.animales;

public class Ave extends Animal {
	private int patas;
	private boolean alas;
	
	   Ave(){
		   vidas++;
	   }
	
	   @Override
	   public void comunicarse() {
		   System.out.println("Pio pio!");
	   }
	   
	 
	   public void hacerNido() {
		   System.out.println("Haciendo nido");
	   }

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	   
	   
}
