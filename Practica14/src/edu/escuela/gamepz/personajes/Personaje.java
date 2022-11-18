package edu.escuela.gamepz.personajes;

import java.text.DecimalFormat;


public abstract class Personaje {  
    //Los atributos nombre y vida deben ser privados
    private String nombre;
    protected int vida;//modificar el atributo edad de la clase Personaje para que ahora se llame vida
    protected float size;

    /************Constructor que recibe nombre y vida******************************** */
    public Personaje(String nombre, int vida, float size) {
        this.nombre = nombre;
        this.vida = vida;
        if(this.size==0.0f){
            this.size = genSize();
        } else { this.size = Math.round(size)/100;
        }
    }
    /*************Fin del constructor************************************************ */

    /************Constructor sólo recibe nombre y vida por defecto es 3************** */
    public Personaje(String nombre){
        this(nombre, 3, 0.0f);
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
    public float getSize() {
        return size;
    }
    public int getVida() {
        return vida;
    }

 //Agregar método getDetalle(), el cual regresa una cadena con el nombre y la edad separados por un tabulador (\t)
   
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
    public float genSize(){
        float size = (float)(Math.random()*10);
        DecimalFormat df = new DecimalFormat("#.00");
        size = Float.valueOf(df.format(size));
        return size;
    }

    public int compareTo(Personaje p){
        if (this.nombre.compareTo(p.nombre) != 0){
            return (this.nombre.compareTo(p.nombre));
        } if (this.vida != p.vida){
            return (p.vida - this.vida);
        } if (this.size == p.size){
            return 0;
        } return (p.size > this.size) ? -1 : 1;
    }
    public String toString(){
        return nombre + "\t" + vida + "\t" + size;
    }


    
    public abstract void decVida();
    public abstract void decVida(int dec);
    public abstract void addVida();
    public abstract void addVida(int add);


} 
