package genericos;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
	 
public class BoteBolas<T>  {

		 Stack<T> bote = new Stack<>();
		 
		 public void mete(T cosa) {
			 this.bote.push(cosa);
		 }

		 public T saca() {
				 return bote.pop();
		 }	
		 
		 public boolean estaVacio() {
			 return bote.empty();
		 }


	 public static void main(String[] args) {

		 BoteBolas<Bola> bote = new BoteBolas<>();
		 
		 Bola bolaVerde=new Bola("Padel","Verde");
		 Bola bolaAmarilla=new Bola("Padel","Amarilla");
	
		 bote.mete(bolaVerde); 
		 bote.mete(bolaVerde); 
		 bote.mete(bolaAmarilla); 
		 bote.mete(bolaAmarilla);
		 bote.mete(bolaAmarilla);
		 bote.mete(bolaVerde); 
	
		 //Ahora las saco y las meto en una lista ordenada
		 List <Bola> bolasSacadas= new LinkedList<>();
		 
		 while (!bote.estaVacio()) {		 
			 bolasSacadas.add(bote.saca());
		 }
		 
		 bolasSacadas.forEach(
				 (pelota)->System.out.println(pelota.getColor())
				 ); 
		 
		 // Mostramos sólo las amarillas haciendo un filtrado lambda
		 System.out.println("Sólo las amarillas:\n");
		 
		 List<Bola> bolasAmarillas = bolasSacadas
				  .stream()
				  .filter(b -> b.getColor().equals("Amarilla"))
				  .collect(Collectors.toList());
		 
		 bolasAmarillas.forEach(
				 (pelota)->System.out.println(pelota.getColor())
				 ); 


	}
}

