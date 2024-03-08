package ejerciciointegrador1;

import java.util.ArrayList;
import java.util.List;

public class EjercicioIntegrador1 {

    public static void main(String[] args) {
        
        List<Videojuego> listaVideojuegos = new ArrayList<> ();
        
        Videojuego videoJ1 = new Videojuego();
            videoJ1.setCodigo(001);
            videoJ1.setTitulo("Super Mario 64");
            videoJ1.setConsola("Nintendo 64");
            videoJ1.setCantidadJugadores("Un Jugador");
            videoJ1.setCategoría("Plataforma, Puzzle");
            videoJ1.setAnio("1996");
  
        Videojuego videoJ2 = new Videojuego();
            videoJ2.setCodigo(002);
            videoJ2.setConsola("Nintendo 64");
            videoJ2.setCantidadJugadores("Un Jugador");
            videoJ2.setCategoría("Acción");
            videoJ2.setAnio("1997");
            videoJ2.setTitulo("Star Fox 64");
    
            
        Videojuego videoJ3 = new Videojuego();
            videoJ3.setCodigo(003);
            videoJ3.setTitulo("The Legend of Zelda: Ocarina of Time");
            videoJ3.setConsola("Nintendo 64");
            videoJ3.setCantidadJugadores("Un Jugador");
            videoJ3.setCategoría("Aventura");
            videoJ3.setAnio("1998");

          
        Videojuego videoJ4 = new Videojuego();
            videoJ4.setCodigo(004);
            videoJ4.setConsola("Nintendo 64");
            videoJ4.setCantidadJugadores("Multijugador");
            videoJ4.setCategoría("Pelea");
            videoJ4.setAnio("1999");
            videoJ4.setTitulo("Super Smash Bros.");    
            
        Videojuego videoJ5 = new Videojuego();
            videoJ5.setCodigo(005);
            videoJ5.setConsola("PC");
            videoJ5.setCantidadJugadores("Un Jugador/Multijugador");
            videoJ5.setCategoría("Acción");
            videoJ5.setAnio("1998");
            videoJ5.setTitulo("Half-Life");
            
        Videojuego videoJ6 = new Videojuego();
            videoJ6.setCodigo(006);
            videoJ6.setConsola("PC");
            videoJ6.setCantidadJugadores("Un Jugador");
            videoJ6.setCategoría("Acción");
            videoJ6.setAnio("2001");
            videoJ6.setTitulo("Max Payne");
            
        Videojuego VideoJ7 = new Videojuego();
            VideoJ7.setCodigo(007);
            VideoJ7.setConsola("PC");
            VideoJ7.setCantidadJugadores("Un Jugador/Multijugador");
            VideoJ7.setCategoría("Estrategia");
            VideoJ7.setAnio("1999");
            VideoJ7.setTitulo("Age of Empires II: The Age of Kings");
            
        Videojuego videoJ8 = new Videojuego();
            videoJ8.setCodigo(010);
            videoJ8.setTitulo("Diablo II");
            videoJ8.setConsola("PC");
            videoJ8.setCantidadJugadores("Un Jugador/Multijugador");
            videoJ8.setCategoría("RPG");
            videoJ8.setAnio("2000");
            
        Videojuego videoJ9 = new Videojuego();
            videoJ9.setCodigo(011);
            videoJ9.setConsola("PSX");
            videoJ9.setCantidadJugadores("Un Jugador");
            videoJ9.setCategoría("Aventura");
            videoJ9.setAnio("1998");
            videoJ9.setTitulo("MediEvil");    
            

        listaVideojuegos.add(videoJ3);
        listaVideojuegos.add(videoJ1);
        listaVideojuegos.add(videoJ4);
        listaVideojuegos.add(videoJ2);
        listaVideojuegos.add(videoJ5);
        listaVideojuegos.add(VideoJ7);
        listaVideojuegos.add(videoJ8);
        listaVideojuegos.add(videoJ6);
        listaVideojuegos.add(videoJ9);
        
        System.out.println("Lista Original de Videojuegos: ");
    
        for (Videojuego jueguito : listaVideojuegos){
            System.out.println("Titulo: " + jueguito.getTitulo() + " Consola: " + 
                    jueguito.getConsola() + " Cant. Jugadores: " + jueguito.getCantidadJugadores()
            + " Categoría: " + jueguito.getCategoría() + " Año: " + jueguito.getAnio());
        }
        
        System.out.println(" ");
        System.out.println("Hago cambios en la lista y queda así: ");
        
         /*Hago cambios en la lista y reemplazo un par: */
        
        videoJ9.setTitulo("Pepsiman");
        videoJ9.setCategoría("Acción");
        videoJ9.setAnio("1999");
        
        videoJ8.setTitulo("Warcraft III: Reign of Chaos");
        videoJ8.setAnio("2002");
        
        /*Que me muestre la lista nueva: */
   
        for (Videojuego jueguito : listaVideojuegos){
            System.out.println("Titulo: " + jueguito.getTitulo() + " Consola: " + 
                    jueguito.getConsola() + " Cant. Jugadores: " + jueguito.getCantidadJugadores()
            + " Categoría: " + jueguito.getCategoría() + " Año: " + jueguito.getAnio());
        }
        
        System.out.println(" ");
        System.out.println("Ahora que solo me muestre juegos de Nintendo 64: ");
        
        /* Que solo me muestre solo los videojuegos de Nintendo 64 */
        
        for(Videojuego jueguito : listaVideojuegos){
            if(jueguito.getConsola().equals("Nintendo 64")){
                System.out.println(jueguito.toString());
            }
        }
    }
    
}
