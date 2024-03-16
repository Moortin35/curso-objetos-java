package com.mycompany.jpatest;
import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.logica.Carrera;
import com.mycompany.jpatest.logica.Controladora;
import java.util.Date;

public class JPATest {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        
        //Creación de Carrera
        Carrera carrera1 = new Carrera(1, "Licenciatura en Cs. de la Computación");
        
        //Guardado de Carrera en DB
        //control.crearCarrera(carrera1);
        
        
        //Creación de Alumno(Ahora con carrera incluída).
        Alumno nuevoalu = new Alumno(16, "Inda", "Lecio", new Date(), carrera1);
        
        //Guardado de Alumno en DB
        
        //Mostrar resultado.
        System.out.println("----------------------------------------");
        System.out.println("------------Datos del Alumno------------");
        Alumno alu = control.traerAlumno(16);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera: " + alu.getCarre().getNombre());
        
    }
}
