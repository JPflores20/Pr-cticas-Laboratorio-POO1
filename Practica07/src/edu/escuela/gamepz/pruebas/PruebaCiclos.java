package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;


public class PruebaCiclos {
        public static void main(String[] args){
            
            Personaje per01 = new Personaje("Diego");
            Personaje per02 = new Personaje("Almendra");
            Personaje per03 = new Personaje("Bianca");
            Personaje per04 = new Personaje("Jordan"); 
    
           
            /*****************************************************************/
            
            int n;
            int m;
            n=0;
            m=0;


          int ed=((int)(Math.random()*100));

            while (n>=m) {
              ed=((int)(Math.random()*100));
              m=ed;
              ed=((int)(Math.random()*100));
              n=ed;
               System.out.println(n);
               System.out.println(m);
            }

        }
    }
