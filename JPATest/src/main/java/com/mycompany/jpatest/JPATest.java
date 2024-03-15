package com.mycompany.jpatest;
import com.mycompany.jpatest.logica.Alumno;
import com.mycompany.jpatest.logica.Controladora;
import java.util.Date;

public class JPATest {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        //Alumno alu = new Alumno(15, "Nicolo", "Dapdullom", new Date());
        //control.crearAlumno(alu);
        control.eliminarAlumno(15);
        
    
    }
}
