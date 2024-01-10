package u4.animales;

public class Perro extends Animal {
   private int patas;
   private boolean cola;
   private int numeroChip;
   
   Perro(){
	   vidas++;
   }
   
   @Override
   public void comunicarse() {
	   System.out.println("Guau, guau!!");
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
	   this.cola = tieneCola;
   }


   public int getNumeroChip() {
	   return numeroChip;
   }


   public void setNumeroChip(int numeroChip) {
	   this.numeroChip = numeroChip;
   }
   

}
