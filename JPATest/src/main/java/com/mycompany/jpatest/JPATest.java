package com.mycompany.jpatest;
import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class JPATest {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        /*Alumno alu = new Alumno(15, "Nicolo", "Dapdullom", new Date());
        control.crearAlumno(alu);
        //control.eliminarAlumno(15);
        
        alu.setApellido("Godofredo San");
        control.editarAlumno(alu);
        */
        Alumno alu = control.traerAlumno(15);
        System.out.println("--------------Búsqueda individual--------------");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println(""); 
        System.out.println("--------------Búsqueda completa--------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for(Alumno aluAux : listaAlumnos){
            System.out.println("El alumno es: " + aluAux.toString());
        }
        
    
    }
}
