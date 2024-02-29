package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        
        List<Persona> listaDePersonas = new LinkedList<Persona> ();
        
        //Agrego personas
        listaDePersonas.add(new Persona(1,"Martin", 27));
        Persona Miguel = new Persona(2, "Miguel", 28);
        listaDePersonas.add(Miguel);
        listaDePersonas.add(new Persona(3,"Gaston", 34));
        
        
        //pruebo agregar al principio de la lista
        listaDePersonas.add(0, new Persona(4,"Robert", 36));
        
        //FOR
        for (int i = 0; i < listaDePersonas.size(); i++) {
            System.out.println("Hola soy "+ listaDePersonas.get(i).getNombre());
        }
        //FOR EACH
        for (Persona personas:listaDePersonas){
            System.out.println("Hola soy "+ personas.getNombre() + " y mi edad es"
                    + " "+ personas.getEdad());
            
        }
        
    }
    
}
