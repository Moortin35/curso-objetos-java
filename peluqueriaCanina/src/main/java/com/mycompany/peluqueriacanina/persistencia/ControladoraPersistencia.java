package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.
        NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        //Crea en la BD el dueño
        duenioJpa.create(duenio);
        //Crea en la BD la mascota
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int numCliente) {
        try {
            mascotaJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
    }

    public Mascota traerMascota(int numCliente) {
        return mascotaJpa.findMascota(numCliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public Duenio buscarDuenio(int id) {
        return duenioJpa.findDueño(id);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    public void borrarDuenio(Duenio duenio) {
        try {
            duenioJpa.destroy(duenio.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
