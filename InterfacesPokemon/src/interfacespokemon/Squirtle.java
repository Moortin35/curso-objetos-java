package interfacespokemon;

public class Squirtle extends Pokemon implements iAgua{

    public Squirtle() {
    }
   
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usó Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle usó Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usó Mordisco!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usó Burbuja!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usó Pistola Agua!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usó Hidrobomba!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle usó Hidropulso!");
    }
    
}
