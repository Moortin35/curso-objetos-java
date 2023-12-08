package testherencia.testherencia;

public class Empleado extends Persona{
    
    int numLegajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int numLegajo, String cargo, Double sueldo, int id,
            String dni, String nombre, String apellido, String domicilio, String telefono) {
     
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
