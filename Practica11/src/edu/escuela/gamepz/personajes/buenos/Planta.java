package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje {//clase Planta que hereda de personaje
 private Escudo escudo;


  /***************Constructor Planta(nombre, vida, escudo) *********************/
    public Planta(String nombre, int vida, Escudo escudo){
    super(nombre, vida);//mandar llamar del padre con super
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
        this(nombre, 3, 'A');
    }
  /***************Términa contructor ******************************************/

  
  /**************Método tipo caracter qué regresa escudo********************** */
   public char getEscudo(){
    return escudo;
    }
  /***************Términa método ******************************************/



  /****************Método decVida() ***********************************************/
    public void decVida(){
        if(escudo=='A'){
            super.decVida(2);
        } else{
            super.decVida();
        }
    }
  /***************Términa método ******************************************/


  /****************Método decVida(int) ***********************************************/
    public void decVida(int Restar){
        if (escudo=='A'){
            super.decVida(Restar*2);
        }else{
            super.decVida(Restar);
        }
    }
  /***************Términa método ******************************************/


  /****************Método addVida() ***********************************************/

    public void addVida(){
    if(escudo=='A'){
        super.addVida(2);
    } else{
        super.addVida();
    }
    }
  /***************Términa método ******************************************/


  /****************Método addVida(int) ***********************************************/
    public void addVida(int add){    
    if 
    (escudo=='A'){
        super.addVida(add*2);
    }else{
        super.addVida(add);
    }
    }
  /***************Términa método ******************************************/

}
