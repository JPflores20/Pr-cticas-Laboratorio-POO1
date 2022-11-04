package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;

public class PruebaTablero {
    public static void main(String[] args) {
        Personaje[] datos={
            new Planta("David", 100),
            new Zombie("Bianca"),
            new Planta("Fabian", 10, Escudo.MEDIO),
            new Planta("Almendra", 50),
            new Planta("Ricardo", Escudo.BAJO),
            new Planta("Silvia"),
            new Zombie("Armando", 80, false),
            new Zombie("Josseline", true),
            new Zombie("Eduardo")
        };

        for (Personaje p: datos){
            int poss=(int)(Math.random()*20-5);
        
                try {

                    Tablero.insertar(p,poss);

                } catch (PersException pe) {
                    System.err.println(pe.getMessage() + " " + poss);
                }
        }

        Tablero.mostrar();
        for (int i = 0; i < Tablero.MAX_SIZE; i++){
            int pos = (int) (Math.random()*20-5);
            try{
                Tablero.borrar(pos);
            } catch (PersException pe){
                System.err.println(pe.getMessage() + " " + pe.getPoss());
            }
        }
        Tablero.mostrar();
    }
    
}

/*
 * package mx.uaz.ingsoft.appsw.pruebas;
import static mx.uaz.ingsoft.appsw.utils.Tablero.*;
import mx.uaz.ingsoft.appsw.universitarios.alumnos.Alumno;
import mx.uaz.ingsoft.appsw.universitarios.maestros.Maestro;
import mx.uaz.ingsoft.appsw.utils.Tablero;
import mx.uaz.ingsoft.appsw.utils.TheExcepcion;
import mx.uaz.ingsoft.appsw.universitarios.Universitario;
public class PruebaTableroE {
    public static void main(String[] args) {
        
        Universitario[] datos = {
                new Universitario("Antonio"),
                new Maestro("Rosario", 10f),
                new Alumno("David"),
                new Universitario("Aide"),
                new Maestro("Cristopher", 5000f),
                new Alumno("Areli"),
                new Maestro("Victor", 10f),
                new Alumno("Emiliano"),
                new Universitario("Sebastian"),
                new Maestro("Marcos", 5000f),
                new Alumno("Maria"),
                new Universitario("Jose")
        };
        mostrar();
        for (int i = 0; i < datos.length; i++) {
            int alt=(int)(Math.random()*10);
          
            
                try {
                    if (i%2==0) {
                    Tablero.insertar(datos[i]);
                    }else{
                        Tablero.insertar(datos[i],alt);
                    }
                } catch (TheExcepcion te) {
                    System.err.println(te.getMessage() + te.getPoss() );
                }
                
            
        }
        Tablero.mostrar();
        
        for (int i = 0; i < datos.length; i++) {
            int alt = (int) (Math.random() * 10);

            try {
                if (i % 2 == 0) {
                    Tablero.borrar();
                } else {
                    Tablero.borrar(alt);
                }
            } catch (TheExcepcion te) {
                System.err.println(te.getMessage() + te.getPoss());
            }

        }
            
           
        Tablero.mostrar();
    }
}
 */
