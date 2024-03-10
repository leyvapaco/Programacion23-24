package u6u7.entregable;


public class Principale {
    public static void main(String[] args) {

        Festival festival2024 = new Festival("Interestelar",41940);

        Manager manager1= new Manager("Indiana","661037169");
        Manager manager2= new Manager("Popin", "661037170");
        
        //INDIE
        Artista artista1 = new Artista("Artic Monkeys",10000,manager1,Estilo.INDIE);
        Musico musico1=new Musico("Jamie Cook",21);   
        Musico musico2=new Musico("Alex Turner",23); 
        artista1.addMusico(musico1);
        artista1.addMusico(musico2);
        
        Artista artista2 = new Artista("Steve Lacey",20000,manager1,Estilo.INDIE);
         
        //POP
        Artista artista3 = new Artista("Adela",20000,manager2,Estilo.POP);
        Musico musico3=new Musico("Adelaida",23);
        Musico musico4=new Musico("Adelita",21);      
        artista3.addMusico(musico3);
        artista3.addMusico(musico4);
        
        Artista artista4 = new Artista("Lady Gaga",10000,manager1,Estilo.POP);
  
        Artista artista5 = new Artista("Ariel Rot",10000,manager1,Estilo.ROCK);


        try {
        festival2024.inscribeArtista(Estilo.INDIE,artista1);
        festival2024.inscribeArtista(Estilo.INDIE,artista2);
        festival2024.inscribeArtista(Estilo.POP,artista3);
        festival2024.inscribeArtista(Estilo.POP,artista4);
        festival2024.inscribeArtista(Estilo.INDIE,artista5); //Excepcion propia


        } catch (EstiloErroneoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nNº de artistas inscritos:"+Festival.cuantosInscritos());
 
        System.out.println("\nArtistas inscritos por orden alfabético (nombre):");
        festival2024.artistasInscritos();
        
        artista1.imprimeMusicos(); //Musicos del artista1
        
     
        System.out.println("\n---artistasByCache(INDIE)---");
        festival2024.artistasByCache(Estilo.INDIE);
        
        System.out.println("\n---artistasByCache(POP)---");
        festival2024.artistasByCache(Estilo.POP);


        festival2024.guardarArtistas();

        festival2024.cargarArtistas();

    }
}
