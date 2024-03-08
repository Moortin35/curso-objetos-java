package ejerciciointegrador2;

public class Flor extends Planta{
    
    private String colorPetalos;
    private String promedioPetalos;
    private String variedadDeFlor;
    private String Estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, String promedioPetalos, String variedadDeFlor, String Estacion) {
        this.colorPetalos = colorPetalos;
        this.promedioPetalos = promedioPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.Estacion = Estacion;
    }

    public Flor(String colorPetalos, String promedioPetalos, String variedadDeFlor, String Estacion, String nombre, String tallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, tallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.promedioPetalos = promedioPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.Estacion = Estacion;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public void setPromedioPetalos(String promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public void setEstacion(String Estacion) {
        this.Estacion = Estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public String getPromedioPetalos() {
        return promedioPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public String getEstacion() {
        return Estacion;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola, soy una flor.");
    }
    
}
