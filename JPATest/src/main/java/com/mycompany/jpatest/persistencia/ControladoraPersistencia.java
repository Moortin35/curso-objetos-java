package com.mycompany.jpatest.persistencia;

import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.logica.Carrera;
import com.mycompany.jpatest.logica.Materia;
import com.mycompany.jpatest.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();
    
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

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        Alumno alu = aluJpa.findAlumno(id);
        return alu;
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listaAlumno = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaArrayAlumnos = new ArrayList<Alumno>(listaAlumno);
        return listaArrayAlumnos;
    }

    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        Carrera carrer = carreJpa.findCarrera(id);
        return carrer;
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> listaCarreras = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaArrayCarreras = new ArrayList<Carrera>(listaCarreras);
        return listaArrayCarreras;
    }

    public void crearMateria(Materia asignatura) {
        mateJpa.create(asignatura);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia asignatura) {
        try {
            mateJpa.edit(asignatura);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        Materia asignatura;
        asignatura = mateJpa.findMateria(id);
        return asignatura;
    }

    public ArrayList<Materia> traerListaMaterias() {
        List<Materia> listaMaterias = mateJpa.findMateriaEntities();
        ArrayList<Materia> listaArrayMaterias = new ArrayList<Materia>(listaMaterias);
        return listaArrayMaterias;
    }
    
}
