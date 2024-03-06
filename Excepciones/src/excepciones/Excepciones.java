package excepciones;

public class Excepciones {


    public static void main(String[] args) {
        
        try{
            int resultado = 3/0;
        }
        catch (Exception e){
            System.out.println("No se puede dividir por 0");
        }
        
        int edades[] = {15, 23, 46, 52};
        try{
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        }
        catch(Exception f){
            System.out.println("Intentaste acceder a un índice que no existe");               
        }
        
    }
    
}
