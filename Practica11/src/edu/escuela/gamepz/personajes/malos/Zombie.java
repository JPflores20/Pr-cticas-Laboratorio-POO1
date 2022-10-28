package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;

public class Zombie extends Personaje implements Muerto {
    private boolean ataque;

    //La clase Zombie deberá tener tres constructores

  /***************Zombie(nombre, vida, ataque) ********************************/
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque=ataque;
    }
  /***************Términa contructor ******************************************/


  /***************Zombie(nombre, ataque) La vida por defecto es 3 *************/
    public Zombie(String nombre, boolean ataque){
        this(nombre, 3, ataque);
        
    }
  /***************Términa contructor ******************************************/


  /***************Zombie(nombre) La vida por defecto es 3, ataque por defecto es false*************/
    public Zombie(String nombre){
        this(nombre, 3, false);
    }
  /***************Términa contructor ******************************************/

    
    public boolean getAtaque(){
        return ataque;
    }

    public String toString(){
        return super.toString() + "\t" + ataque;
    }



    public void decVida(){
        if(!ataque){
            decVida(3);
        } else{
            decVida(2);
        }
    }


    public void decVida(int Restar){
        if 
        (ataque==false){
            decVida(Restar*3);
        }else{
            decVida(Restar*2);
        }
    }
/************************************************************ */
    public void addVida(){
    if(ataque){
        addVida(3);
    } 
    }

    public void addVida(int add){    
    if (ataque){
        addVida(add*3);
    }
    }

    public void comer(){
        System.out.println("Comer cerebros");
    }



}
