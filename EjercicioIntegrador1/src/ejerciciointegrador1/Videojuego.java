package ejerciciointegrador1;

public class Videojuego {
         
        private int codigo;
        private String titulo;
        private String consola;
        private String cantidadJugadores;
        private String categoría;
        private String anio;

    public Videojuego() {
    }

    public Videojuego(int codigo, String titulo, String consola, String cantidadJugadores, String categoría, String anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoría = categoría;
        this.anio = anio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setCantidadJugadores(String cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public String getCantidadJugadores() {
        return cantidadJugadores;
    }

    public String getCategoría() {
        return categoría;
    }

    public String getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "codigo=" + codigo + ", titulo=" + titulo + ", consola=" + consola + ", cantidadJugadores=" + cantidadJugadores + ", categor\u00eda=" + categoría + ", anio=" + anio + '}';
    }
        
    
        
     
}
