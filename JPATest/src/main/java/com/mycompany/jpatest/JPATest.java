package com.mycompany.jpatest;
import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.logica.Carrera;
import com.mycompany.jpatest.logica.Controladora;
import com.mycompany.jpatest.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class JPATest {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        
        //Crear Lista de Materias
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creacion carrera con lista de materias.
        
        Carrera carrera1 = new Carrera(1, "Lic. en Cs. de la Computación", listaMaterias);
        
        //Guardar carrera en DB
        
        control.crearCarrera(carrera1);
        
        //Creación de Materias en DB
        Materia asignatura1 = new Materia(1, "Intro a los algoritmos", "Semestral", carrera1);
        Materia asignatura2 = new Materia(2, "Analisis I", "Semestral", carrera1);
        Materia asignatura3 = new Materia(3, "Matemática Discreta", "Semestral", carrera1);
        
        //Guardar Materias en DB
        control.crearMateria(asignatura1);
        control.crearMateria(asignatura2);
        control.crearMateria(asignatura3);
        
        //Agrego las materias a la lista de materias
        
        listaMaterias.add(asignatura1);
        listaMaterias.add(asignatura2);
        listaMaterias.add(asignatura3);
        
        carrera1.setListaMaterias(listaMaterias);
        control.editarCarrera(carrera1);
        
        //Crear alumno con Carrera
        
        Alumno alumno1 = new Alumno(1, "Morton", "The Dev", new Date(), carrera1);
        
        //Guardar alumno en DB
        
        control.crearAlumno(alumno1);

        //Vemos el resultado:
        
        System.out.println("------------------------");
        System.out.println("------Datos Alumno------");
        Alumno alu1 = control.traerAlumno(1);
        System.out.println("Alumno: " + alu1.getNombre() + " " + alu1.getApellido());
        System.out.println("Cursa la carrera de: " + alu1.getCarre().getNombre());
        
    }
}
