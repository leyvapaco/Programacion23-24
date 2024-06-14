package ev2.veterinaria2024;

import ev2.veterinaria2024.Animal.Sexo;

//OJO import java.util.Date;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		Clinica clinica1=new Clinica();
		Propietario propietario1=new Propietario("612233445","Juan Martínez");
		
		Animal perro1= new Perro( Sexo.MASCULINO, propietario1, "Coke", "Schnauzer", 8, 9.2, "P1");
		Animal perro2= new Perro( Sexo.MASCULINO, propietario1, "Chico", "Chucho", 12, 11.1, "P2");
	
		Animal gato1= new Gato( Sexo.MASCULINO, propietario1, "Pussy", "Angora", 3, 3.2, "G1");
		Animal bicha1= new Serpiente( Sexo.FEMENINO, propietario1, "Cobra", true);
		
		Medicamento med1=new Medicamento("Apokel", 30, 20.30);
		Medicamento med2=new Medicamento("Fluor", 20, 16.30);
		Medicamento med3=new Medicamento("Pienso gástrico", 150, 12.30);
		
		Consulta consulta1= new Consulta(perro1, "Picores y caries");

		consulta1.addMedicamento(med1); //Apokel
		consulta1.addMedicamento(med2); //Fluor
		clinica1.addConsulta(consulta1);
		Thread.sleep(1000);
		
		Consulta consulta2= new Consulta(perro1, "Gastroenteritis");
		consulta2.addMedicamento(med3);	//Pienso	
		clinica1.addConsulta(consulta2);
		Thread.sleep(1000);

		Consulta consulta3= new Consulta(bicha1, "Caries");
		consulta3.addMedicamento(med2);	//Fluor	
		clinica1.addConsulta(consulta3);
		Thread.sleep(1000);
		
		Consulta consulta4= new Consulta(perro2, "Caries");
		consulta4.addMedicamento(med2);	//Fluor	
		clinica1.addConsulta(consulta4);
		Thread.sleep(1000);
		
		
		Consulta consulta5= new Consulta(gato1, "Caries");
		consulta5.addMedicamento(med2);	//Fluor	
		clinica1.addConsulta(consulta5);
		Thread.sleep(1000);
		
		Animal.cuantosAnimales(); //Muestra el valor del atributo estático numAnimales
		
		clinica1.perrosByRaza(); //Usa el compareTo definido en Perro, por raza
		
		clinica1.getConsultas(perro1); //Por orden de inserción - LinkedHashMap en Consultas.java
		clinica1.getConsultas(bicha1);
		clinica1.getConsultas(perro2);
		clinica1.getConsultas(gato1);
		
		consulta1.getMedicamentosByPeso(); //Orden descendente usando el compareTo de Medicamento, por peso
		
		clinica1.aFichero();//Guarda los Animales que han pasado por consulta en un fichero binario
		
	}

}
