package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;


public class Tablero {
    static final int MAX_SIZE=5;
    private static Personaje[] PERSONAJES=new Personaje [MAX_SIZE];

    //c) Constructor privado
    private Tablero(){}
    //----------------------

    public static void mostrar(){
        System.out.println("\n Inicio *** Contenido del arreglo en Tablero");

        for (int i=0; i<MAX_SIZE;i+=1 ) {
            if (PERSONAJES[i]==null) {
                System.out.println("---");//imprimir la posicion
                
            }else{
                System.out.println(PERSONAJES[i]);
            }
        }
        System.out.println("FIN *** Contenido del arreglo en Tablero\n");
    }
}
