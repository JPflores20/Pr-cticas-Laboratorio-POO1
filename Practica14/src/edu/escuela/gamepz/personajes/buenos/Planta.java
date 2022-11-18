package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje {//clase Planta que hereda de personaje
 private Escudo escudo;


  /***************Constructor Planta(nombre, vida, escudo) *********************/
    public Planta(String nombre, int vida, Escudo escudo){
    super(nombre, vida, 0.0f);//mandar llamar del padre con super
    this.escudo=escudo;
    }
  /***************Términa contructor ******************************************/


  /***************Planta(nombre, escudo) La vida por defecto es 3 *************/
    public Planta(String nombre, Escudo escudo) {
        this(nombre,3,escudo);
        
    }
  /***************Términa contructor ******************************************/
  
  
  /***************Planta(nombre, vida) es escudo es por defecto A**************/
    public Planta(String nombre, int vida) {
        this(nombre, vida, Escudo.NULO);
    }
  /***************Términa contructor ******************************************/





   
  /**************Planta(nombre) La vida es por defecto 3 y escudo es por defecto A******************/
    public Planta(String nombre) {
        this(nombre, 3, Escudo.NULO);
    }
  /***************Términa contructor ******************************************/

  
  /**************Método tipo caracter qué regresa escudo********************** */
   public Escudo getEscudo(){
    return escudo;
    }
  /***************Términa método ******************************************/

  public String toString(){
    return super.toString() + "\t" + escudo.getNivel();
  }



  public void decVida(){
    setVida(getVida() - escudo.getNivel());
  }
  public void decVida(int dec){
    setVida(getVida() - escudo.getNivel()*dec);
  }
  public void addVida(){
    setVida(getVida() + escudo.getNivel());
  }
  public void addVida(int add){
    setVida(getVida() + escudo.getNivel()*add);
  }

}
