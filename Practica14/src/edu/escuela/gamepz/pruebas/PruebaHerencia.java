package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;

public class PruebaHerencia {

  //Dentro del métoddo principal crear 2 personajes, 4 plantas y 3 zombies
  public static void main(String[] args) {
      Personaje per01 = new Planta("David", 99);
      Personaje per02 = new Zombie("Bianca");
      Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
      Planta plan02 = new Planta("Almendra", 50);
      Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
      Planta plan04 = new Planta("Silvia");
      Zombie zom01 = new Zombie("Armando", 80, false);
      Zombie zom02 = new Zombie("Josseline", true);
      Zombie zom03 = new Zombie("Eduardo");

      //Arreglo llamado persojanes de tipo Personaje en el cual se almacenen las instancias creadas en el paso 8
      Personaje[] personajes = {per01,per02, plan01,plan02,plan03,plan04,zom01,zom02,zom03};
      int N = 0;

      //recorre el arreglo con un foreach
      for (Personaje p : personajes) {
        //imprimir método getDetalle
          System.out.println(p.toString());
          //Generar un número aleatorio entre 1 y 10
          int aleatorio = (int)(Math.random()*10);

          //Si es una planta imprimir "Soy planta y su atributo escudo", incrementar la vida con el número aleatorio
          if (p instanceof Planta){
            Planta tmp = (Planta) p;
            System.out.println("Soy planta "+ tmp.getEscudo());
            tmp.addVida(aleatorio);
          }


          //Si es una Zombie imprimir "Soy zombie y su atributo ataque", decrementar la vida con el valor aleatorio
        if (p instanceof Zombie){
            Zombie tmp = (Zombie) p;
            System.out.println("Soy zombie "+ tmp.getAtaque());
            tmp.comer();
            tmp.decVida(aleatorio);
        }

        //imprimir el número aleatorio generado anteriormente
        System.out.println(aleatorio + "\n" + p.toString() + "\n");
        //imprimir *****Objeto N*****; donde N es un contador de 1 a 9
        System.out.println("*****Objeto " + ++N + "*****");
      }
  }
}
