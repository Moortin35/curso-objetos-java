package testherencia.testherencia;

public class Jefe extends Persona {
    int idJefe;
    String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int idJefe, String departamentoJefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
    
}
