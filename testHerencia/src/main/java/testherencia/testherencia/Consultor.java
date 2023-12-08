package testherencia.testherencia;

public class Consultor extends Persona{
    String nombreConsultor;
    int numConsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultor, int numConsultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreConsultor = nombreConsultor;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
    
    
    
}
