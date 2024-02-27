package interfacespokemon;

public class Pikachu extends Pokemon implements iElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usó Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu usó Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usó Mordisco!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usó Impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usó Puño Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu usó Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu usó Rayo Carga!");
    }

}
