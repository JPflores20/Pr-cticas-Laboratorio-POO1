package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;

public class Tablero {
    public static final int MAX_SIZE=10;
    private static Personaje[] PERSONAJES=new Personaje [MAX_SIZE];

    //c) Constructor privado
    private Tablero(){}
    //----------------------

    //---------------------------Método mostrar--------------------------------------
    public static void mostrar(){
        System.out.println("\n Inicio *** Contenido del arreglo en Tablero");

        for (int i=0; i<MAX_SIZE;i+=1 ) {
            if ( PERSONAJES[i] == null){
                System.out.println(i + "---");
            } else {
                System.out.println(i + " " + PERSONAJES[i]);
            } 
        }
        System.out.println("FIN *** Contenido del arreglo en Tablero\n");
    }
    //------------------------------------------------------------------------------

    //---------------------------Método insertar------------------------------------
    public  static void insertar(Personaje p,int poss) throws PersException {
        if ((poss < 0) || (poss >= MAX_SIZE)) {
            throw new PersException("Indice fuera de rango ",poss);
        }
       PERSONAJES[poss]=p;

   } 
   //--------------------------------------------------------------------------------

    //---------------------------Método Borrar------------------------------------
   public static void borrar(int poss) throws PersException {
    if ((poss < 0) || (poss >= MAX_SIZE)) {
        throw new PersException("Indice fuera de rango ",poss);
    }
    if (PERSONAJES[poss] == null){
        throw new PersException("Si personaje para borrar ",poss);
    }
    PERSONAJES[poss]=null;
    
    }
   //--------------------------------------------------------------------------------

    public static int genVida(){
        return (int)(Math.random()*10+1);
    }
}
