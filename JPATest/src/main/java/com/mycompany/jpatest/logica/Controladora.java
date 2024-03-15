package com.mycompany.jpatest.logica;
import com.mycompany.jpatest.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu1){
        
        controlPersis.crearAlumno(alu1);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
}
