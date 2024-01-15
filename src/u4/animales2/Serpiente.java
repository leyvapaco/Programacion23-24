package u4.animales2;


public class Serpiente extends Reptil {
	
	public enum Especies{COBRA,PITON,VIBORA;}
	
	Serpiente(){
		   super(); //Usamos constructor del padre
	   }
	
    @Override
	public void comunicate() {
	   System.out.println("sss sss!");
	}
	   
	public void morder(Especies especie) {
		   System.out.println("me ha mordido una serpiente!");
		   if (especie==Especies.COBRA){
			   this.muere();
		   }
		}   
	   	   
   public static void muestraEspecies() {
	   for(Especies esp: Especies.values()){
			System.out.print(esp.name()+" - ");
		}
	   System.out.println();
   }
}
