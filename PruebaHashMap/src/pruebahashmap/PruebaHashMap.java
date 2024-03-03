package pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {

        Map<Integer, String> mapaObjetos = new HashMap<>();
        mapaObjetos.put(512, "Libro");
        mapaObjetos.put(513, "Computadora");
        mapaObjetos.put(514, "Mate");
        
        boolean existeValor = mapaObjetos.containsValue("Mate");
        if (existeValor) {
            System.out.println("El valor buscado está");
        }
        else{
            System.out.println("El valor buscado no está");
        }
        boolean existeKey = mapaObjetos.containsKey(512);
        if (existeKey) {
            System.out.println("Existe la key referida");
        }
        else{
            System.out.println("No existe la key referida");
        }
        System.out.println("");
        System.out.println("Mapa de keys");
        System.out.println(mapaObjetos.keySet());
        
        String objeto = mapaObjetos.get(514);
        System.out.println("");
        System.out.println("El value del objeto 514 es: " + objeto);
        
        System.out.println("Procedo a eliminar el objeto 514");
        mapaObjetos.remove(514);
        
        System.out.println("");
        System.out.println("Añado otro objeto y verifico los values del HashMap");
        mapaObjetos.put(515, "Mochila");
        
        
        System.out.println(mapaObjetos.values());
        
    }
    
}
