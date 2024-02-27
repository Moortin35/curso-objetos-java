package interfacespokemon;

public abstract class Pokemon {
    
    private int numPokedex;
    private String nombrePokemon;
    private double peso;
    private String genero;
    private String Generacion;
    private String Tipo;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}
