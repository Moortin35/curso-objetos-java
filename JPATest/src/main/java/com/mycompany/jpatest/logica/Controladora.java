package com.mycompany.jpatest.logica;
import com.mycompany.jpatest.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        Alumno alu = controlPersis.traerAlumno(id);
        return alu;
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    // Carrera
    
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id){
        Carrera carre = controlPersis.traerCarrera(id);
        return carre;
    }
    
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    
    // Materia
    
    public void crearMateria(Materia asignatura){
        controlPersis.crearMateria(asignatura);
    }
    
    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia asignatura){
        controlPersis.editarMateria(asignatura);
    }
    
    public Materia traerMateria(int id){
        Materia asignatura = controlPersis.traerMateria(id);
        return asignatura;
    }
    
    public ArrayList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
       
}
