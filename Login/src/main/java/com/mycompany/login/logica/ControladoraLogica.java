package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
        Usuario usr = null;
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getNombreUsuario().equals(usuario)){
                if(user.getContrasenia().equals(contrasenia)){
                    usr = user;
                }
            }
        }
        return usr;
    }

    public void registrar(String usuario, String contrasenia) {
        Usuario user = new Usuario();
        user.setNombreUsuario(usuario);
        user.setContrasenia(contrasenia);
        controladoraPers.registrar(user);
    }

    public boolean corroborarExistenciaUsuario(String usuario) {
        boolean existeUsuario = false;
        List<Usuario> listaUsuarios = controladoraPers.traerUsuarios();
        for(Usuario user : listaUsuarios){
            if(user.getNombreUsuario().equals(usuario)){
                existeUsuario = true;
            }  
        }
        return existeUsuario;
    }

    public String validarRol(String usuario, String contrasenia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
