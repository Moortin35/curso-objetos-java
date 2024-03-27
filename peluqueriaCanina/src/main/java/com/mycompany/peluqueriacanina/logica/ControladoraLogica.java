package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String razaMascota, 
            String colorMascota, String observaciones, String nombreDueño, 
            String celDueño, String esAlergico, String atencionEspecial) {
    
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDueño);
        duenio.setCelular(celDueño);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(esAlergico);
        mascota.setAtencionEsp(atencionEspecial);
        mascota.setPersona(duenio);
        
        controladoraPersis.guardar(duenio, mascota);
    }
    
}
