package teststack;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Stack vacío: " + pila);
        System.out.println("Esta el stack vacío? " + pila.isEmpty());
        
        //Agrego elementos:
        
        pila.push(1);
        pila.push(3);
        pila.push(5);
        pila.push(7);
        pila.push(9);
        
        //Recorrido del stack:
        
        for (Integer elemento : pila){
            System.out.println(elemento);
        }
        
        //Mostrar
        System.out.println("Stack: " + pila);
        System.out.println("Esta el Stack vacio? "+ pila.isEmpty());
        
        //Quito un elemento:
        pila.pop();
        System.out.println("Está el 3? " + pila.search(3));
        System.out.println("El ultimo elemento agregado, sin contar el eliminado fue: " + pila.peek());
       
        
    }
    
}
