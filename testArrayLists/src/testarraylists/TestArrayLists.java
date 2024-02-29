package testarraylists;

import java.util.ArrayList;
import java.util.List;

public class TestArrayLists {

    public static void main(String[] args) {
        
        List<Persona> listaDePersonas = new ArrayList<Persona> ();
        listaDePersonas.add(new Persona(1,"Martin", 27));
        Persona Miguel = new Persona(2, "Miguel", 28);
        listaDePersonas.add(Miguel);
        listaDePersonas.add(new Persona(3,"Gaston", 34));
        listaDePersonas.add(new Persona(4,"Robert", 36));
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
