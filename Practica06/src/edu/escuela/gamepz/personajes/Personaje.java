package com.patito.poo1pract.personajes;

public class Personaje {//Definición clase principal
    private String nombre; //Nombre privado porqué es un dato privado no público
    private int edad;//edad privada, porque es un dato personal privado, no publico


//*******************Modificaciónes práctica 04************************* */
    //constructor con edad por defecto =0
    public Personaje(String nombre){
        this.nombre = nombre;
        edad=0;//edad por defecto es 0
    }
//********************Termina modificación******************************* */



    public void setNombre(String nombre){//recibe una cadena nombre como argumento y modifica el atributo nombre como dicho argumento
        this.nombre= nombre;
    }//cierra método

    //regresa una cadena con el valor del nombre (atributo de clase)
    public String getNombre(){
        return nombre;
    }//cierra método

    public void saludar(){//método saludar
        System.out.println("Hola Alumno de POO "+ nombre);

    }//cierra método

    
//*******************Modificaciónes práctica 04************************* */
    public int getEdad(){
        return edad;
    }

    public boolean setEdad(int edad){
        if((edad>0) && (edad<120)){
            this.edad=edad;
            return true;
        }
        return false;
    }
//********************Termina modificación******************************* */
}
