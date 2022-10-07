package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;

public class PruebaHerencia {

  //Dentro del métoddo principal crear 2 personajes, 4 plantas y 3 zombies
  public static void main(String[] args) {
      Personaje per01 = new Personaje("David", 100);
      Personaje per02 = new Personaje("Bianca");
      Planta plan01 = new Planta("Fabian", 10, 'B');
      Planta plan02 = new Planta("Almendra", 50);
      Planta plan03 = new Planta("Ricardo", 'C');
      Planta plan04 = new Planta("Silvia");
      Zombie zom01 = new Zombie("Armando", 80, false);
      Zombie zom02 = new Zombie("Josseline", true);
      Zombie zom03 = new Zombie("Eduardo");

      //Arreglo llamado persojanes de tipo Personaje en el cual se almacenen las instancias creadas en el paso 8
      Personaje[] personajes = {per01,per02, plan01,plan02,plan03,plan04,zom01,zom02,zom03};
      int index = 0;

      //recorre el arreglo con un foreach
      for (Personaje p : personajes) {
        //imprimir método getDetalle
          System.out.println(p.getDetalle());
          //Generar un número aleatorio entre 1 y 100
          int aleatorio = (int)(Math.random()*100);

          
      }
  }
}
