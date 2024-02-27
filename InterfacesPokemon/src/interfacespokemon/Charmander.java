package interfacespokemon;
    
public class Charmander extends Pokemon implements iFuego {

    public Charmander() {
    }

     @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usó Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander usó Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usó Mordisco!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó Ascuas!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usó Puño Fuego!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander usó Lanzallamas!");
    }
    
}
