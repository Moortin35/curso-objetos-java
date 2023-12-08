package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
    
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

    