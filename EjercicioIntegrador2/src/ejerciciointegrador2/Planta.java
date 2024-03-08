package ejerciciointegrador2;

public abstract class Planta {
    
    private String nombre;
    private String AltoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, String tallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.AltoTallo = tallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTallo(String tallo) {
        this.AltoTallo = tallo;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTallo() {
        return AltoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }
    
    public abstract void saludar();
    
    
    
}
