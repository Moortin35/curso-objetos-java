package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.67;
        
        //Realizo casteo a entero
        int numInt = (int)num;
        
        //casteo a long:
        long numLong = (long) num;
        
        System.out.println("El numero de tipo double antes de la conversion: " + num);
        System.out.println("El numero después de la conversion a int: " + numInt);
        System.out.println("El numero después de la conversion a long: " + numLong);
        
        //Coversión de String a Int o Double
        
        String cantidad = "15";
        String precio = "132.25";
        
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El precio total de la compra es: "+ (cantEntero * precioDouble));
        
        //Conversión de Numeros a String
        
        int edad = 25;
        double estatura = 1.65;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
    }
}
