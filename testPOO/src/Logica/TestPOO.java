package Logica;

public class TestPOO {

    public static void main(String[] args) {
        //Instancia de clase alumno
        Alumno alumno1 = new Alumno(01, "John", "Smith");
        //getters de alumno
        System.out.println("la id del alumno es: " + alumno1.getId());
        System.out.println("el nombre del alumno es: " + alumno1.getNombre());
        System.out.println("el apellido del alumno es: " + alumno1.getApellido());
        //setters de alumno, en este caso lo use para modificar el valor de su id.
        alumno1.setId(4);
        System.out.println("la id del alumno es: " + alumno1.getId());
    }
}
