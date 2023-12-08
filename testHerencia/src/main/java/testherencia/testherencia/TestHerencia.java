package testherencia.testherencia;


public class TestHerencia {

    public static void main(String[] args) {
        
        Empleado nuevo1 = new Empleado();
        
        nuevo1.setNombre("Enzo");
        nuevo1.setApellido("Fernandez");
        nuevo1.setNumLegajo(23743473);
        
        System.out.println("El numero de legajo del pibe es: "+ nuevo1.getNumLegajo());
        
        Consultor nuevo2 = new Consultor();
        nuevo2.setNumConsultor(02);
        nuevo2.setNombreConsultor("La araña que pica");
        nuevo2.setNombre("Julián");
        System.out.println("El nombre del consultor es: "+ nuevo2.getNombreConsultor());
    }
}
