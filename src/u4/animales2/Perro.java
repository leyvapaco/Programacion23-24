package u4.animales2;

public class Perro extends Mamifero {
   private int patas;
   private boolean cola;
   private int numeroChip;
   
   Perro(){
	   super();
   }
   
   @Override
   public void comunicate() {
	   System.out.println("Guau, guau!");
   }
   
  
   public void olfatear() {
	   System.out.println("sniff sniff");
   }

   

   public int getPatas() {
	   return patas;
   }


   public void setPatas(int patas) {
	   this.patas = patas;
   }


   public Boolean getCola() {
	   return cola;
   }


   public void setCola(Boolean tieneCola) {
	   this.cola = true;
   }


   public int getNumeroChip() {
	   return numeroChip;
   }


   public void setNumeroChip(int numeroChip) {
	   this.numeroChip = numeroChip;
   }
   
   

}
