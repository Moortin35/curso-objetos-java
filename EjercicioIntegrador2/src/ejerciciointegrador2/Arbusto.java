package ejerciciointegrador2;

public class Arbusto extends Planta{
    
    private String AnchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String AnchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo) {
        this.AnchoArbusto = AnchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Arbusto(String AnchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo, String nombre, String tallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, tallo, tieneHojas, climaIdeal);
        this.AnchoArbusto = AnchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public void setAnchoArbusto(String AnchoArbusto) {
        this.AnchoArbusto = AnchoArbusto;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getAnchoArbusto() {
        return AnchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola, soy un arbusto.");
    }
}
