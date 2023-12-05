package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;
    
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno, y tengo nombre");
    }
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobé la materia");
        }
        else{
            System.out.println("uhh, no aprobé");
        }
    }
}

    