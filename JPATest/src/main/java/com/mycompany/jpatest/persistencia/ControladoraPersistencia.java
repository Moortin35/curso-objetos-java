package com.mycompany.jpatest.persistencia;

import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    public void crearAlumno(Alumno alum){
        aluJpa.create(alum); 
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
