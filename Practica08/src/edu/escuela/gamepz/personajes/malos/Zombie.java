package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje {
    boolean ataque;

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

    public String getDetalle(){
        return super.getDetalle() + "\t" + ataque;
    }
    public void decVida(){
        if(ataque==false){
            super.decVida(3);
        } else{
            super.decVida(2);
        }
    }


    public void decVida(int Restar){
        if 
        (ataque==false){
            super.decVida(Restar*3);
        }else{
            super.decVida(Restar*2);
        }
    }
/************************************************************ */
    public void addVida(){
    if(ataque){
        super.addVida(3);
    } 
    }

    public void addVida(int add){    
    if (ataque){
        super.addVida(add*3);
    }
    }

}
