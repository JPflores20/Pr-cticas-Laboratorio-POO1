package edu.escuela.gamepz.personajes;

public abstract class Personaje {  
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
    
    public void setNombre(String nombre){
        if ((nombre.length() > 5) && (nombre.length() < 25)){
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }

 //Agregar método getDetalle(), el cual regresa una cadena con el nombre y la edad separados por un tabulador (\t)
    public String toString() {
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


    
    public abstract void decVida();
    public abstract void decVida(int dec);
    public abstract void addVida();
    public abstract void addVida(int add);


} 
