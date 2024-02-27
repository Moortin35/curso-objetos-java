package interfacespokemon;

public class Bulbasaur extends Pokemon implements iPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur usó Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur usó Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur usó Mordisco!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur usó Látigo Cepa!");
    }

    @Override
    public void atacarDrenar() {
        System.out.println("Bulbasaur usó Drenar!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usó Paralizar!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur usó Hoja Afilada!");
    }
    
}
