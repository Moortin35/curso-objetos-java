package interfacespokemon;

public class InterfacesPokemon {

    public static void main(String[] args) {
        
        Squirtle blastoise = new Squirtle();
        Charmander charizard = new Charmander();
        Bulbasaur venusaur = new Bulbasaur();
        Pikachu raichu = new Pikachu();
        
        blastoise.atacarAraniazo();
        charizard.atacarAscuas();
        blastoise.atacarHidrobomba();
        venusaur.atacarHojaAfilada();
        raichu.atacarRayoCarga();
        
    }
    
}