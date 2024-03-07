package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto autito = new Auto();
        autito.setId(1L);
        autito.setMarca("Alfa Romeo");
        autito.setModelo("Giulia");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        Propietario persona1 = new Propietario();
        Propietario persona2 = new Propietario();
        
        persona1.setId(10L);
        persona1.setNombre("Mortin");
        persona1.setApellido("Delgado");
        
        persona2.setId(13L);
        persona2.setNombre("Valen");
        persona2.setApellido("Na");
        
        listaPropietarios.add(persona1);
        listaPropietarios.add(persona2);
        
        autito.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto " + autito.getMarca() + " " + autito.getModelo() +
                 " tiene como propietarios a: " + autito.getListaPropietarios().toString());
        
    }

    public Relaciones() {
    }
    
}
