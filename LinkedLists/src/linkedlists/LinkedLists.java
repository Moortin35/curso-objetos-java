package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        
        List<Persona> listaEnlazadaDePersonas = new LinkedList<Persona> ();
        
        //Agrego personas
        listaEnlazadaDePersonas.add(new Persona(1,"Martin", 27));
        listaEnlazadaDePersonas.add(new Persona(2, "Miguel", 28));
        listaEnlazadaDePersonas.add(new Persona(3,"Gaston", 34));
        //pruebo agregar al principio de la lista
        listaEnlazadaDePersonas.add(0, new Persona(4,"Robert", 36));
        
        List<Persona> listaArregloDePersonas = new ArrayList<Persona> ();
        listaArregloDePersonas.add(new Persona(1,"Martin", 27));
        listaArregloDePersonas.add(new Persona(2, "Miguel", 28));
        listaArregloDePersonas.add(new Persona(3,"Gaston", 34));
        listaArregloDePersonas.add(new Persona(4,"Robert", 36));
        
        //Ejemplo de Remove en ArrayList:
        listaArregloDePersonas.remove(2);
        /*Simplemente se le asigno un índice del arreglo a eliminar
            y el algoritmo se encarga de reorganizar los items y los indices.*/
        
        //Ejemplo de Remove en LinkedList:
        
        String nombreABorrar = "Gaston";
        for (Persona personaDeLista : listaEnlazadaDePersonas) {
            if (personaDeLista.getNombre().equals(nombreABorrar)) {
                listaEnlazadaDePersonas.remove(personaDeLista);
                break;
            }
        }
        /* Tras encontrar el nodo que contenga el nombre, el algoritmo
        de remove de linkedlists va a eliminar y reasignar los punteros
        para que la lista siga enlazada.*/
        
        System.out.println("Como quedan ambas listas después de eliminar?");
        System.out.println("-----ARRAY LIST-----");
        for (Persona personaDeLista2 : listaArregloDePersonas) {
            System.out.println("Hola soy " + personaDeLista2.getNombre());
        }
        System.out.println("-----LINKED LIST-----");    
        for (Persona personaDeLista3 : listaEnlazadaDePersonas) {
            System.out.println("Hola soy " + personaDeLista3.getNombre());
        }
        
        //Tamaño en listas:
        System.out.println("");
        System.out.println("Que tamaño tienen las listas?");
        System.out.println("ArrayList: " + listaArregloDePersonas.size());
        System.out.println("LinkedList: " + listaEnlazadaDePersonas.size());
        
        System.out.println("");
        //Obtengo el primer y ultimo elemento de la lista.
        System.out.println("Primer y Ultimo elemento de Linked List");
        System.out.println("El primer elemento de la lista enlazada es: "
                + listaEnlazadaDePersonas.getFirst().toString());
        System.out.println("El ultimo elemento de la lista enlazada es: "
                + listaEnlazadaDePersonas.getLast().toString());
        
        System.out.println("");
        //Borrando las listas:
        System.out.println("-----Borrando Listas...-----");
        System.out.println("");
        listaArregloDePersonas.clear();
        listaEnlazadaDePersonas.clear();
        
        //Compruebo que estén vacías.
        System.out.println("Estan vacías las listas?");
        System.out.println("ArrayList: " + listaArregloDePersonas.isEmpty());
        System.out.println("ArrayList: " + listaEnlazadaDePersonas.isEmpty());
    }
    
}
