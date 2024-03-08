package ejerciciointegrador2;

public class Arbol extends Planta{
    
    private String variedad;
    private String tipoDeTronco;
    private String color;
    private String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoDeTronco, String color, String tipoDeHojas) {
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public Arbol(String variedad, String tipoDeTronco, String color, String tipoDeHojas, String nombre, String tallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, tallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy un árbol.");
    }
    
}
