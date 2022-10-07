package edu.escuela.gamepz.personajes;

public class Personaje {  
    //Los atributos nombre y vida deben ser privados
    private String nombre;
    private int vida;//modificar el atributo edad de la clase Personaje para que ahora se llame vida

    /************Constructor que recibe nombre y vida******************************** */
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    /*************Fin del constructor************************************************ */

    /************Constructor sólo recibe nombre y vida por defecto es 3************** */
    public Personaje(String nombre){
        this(nombre, 3);
    }
    /*************Fin del constructor************************************************ */
  
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }

 //Agregar método getDetalle(), el cual regresa una cadena con el nombre y la edad separados por un tabulador (\t)
    public String getDetalle() {
        return (nombre + "\t" + vida);
    }
//********************Termina modificación******************************* */
    public boolean setVida(int vida) {
        if ((vida > 0) && (vida <=99)){
            this.vida = vida;
            return true;
        }
        else{
            return false;
        }
    }
/************Agregar método decVida()************************** */
    public void decVida(){//resta el atributo vida en 1
        if(vida-1>0 && vida-1<=99){
            vida--;
        }
    }
/************Fin método decVida() ******************************/

/************Agregar método decVida(int)*********************** */
    public void decVida(int Restar){//decrementa la vida el valor del argumento
        if(vida-Restar>0 && vida-Restar<=99){
            vida-=Restar;
        }
    }
/************Fin método decVida(int) ******************************/

/************Agregar método addVida()*********************** */
public void addVida(){
    if(vida+2>0 && vida+2<=99){//añadir uno a vida 
        vida++;
    }
}
/************Fin método addVida() ******************************/

/************Agregar método addVida()********************* */
public void addVida(int add){
    if(vida+add>0 && vida+add<=99){
        vida+=add;
    }
}
/************Fin método addVida(int) ******************************/

    
} 
