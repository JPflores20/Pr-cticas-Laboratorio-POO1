package edu.escuela.gamepz.personajes; 

public class Personaje {//Definición clase principal
    private String nombre; //Nombre privado porqué es un dato privado no público
    private int edad;//edad privada, porque es un dato personal privado, no publico


//*******************Modificaciónes práctica 04************************* */  
    //constructor con edad por defecto =0  
    public Personaje(String nombre){
        this.nombre= nombre;
        edad=0;//edad por defecto es 0
    }//cierra método
//********************Termina modificación******************************* */


//modificar el método setNombre para qué solo se pueda cambiar el nombre si la longitud de la cadena recibida es mayor a 5 y menor a 25
    public boolean setNombre(String nombre){
        int longitudNombre= nombre.length();
        if((longitudNombre>5) && (longitudNombre<25)){//mayor a 5 y menor a 25
           this.nombre= nombre;
            return true;
        }
        else{
            return false;
        }

    }//cierra método
//********************Termina modificación******************************* */
    //regresa una cadena con el valor del nombre (atributo de clase)
    public String getNombre(){
        return nombre;
    }//cierra método

    public void saludar(){//método saludar
        System.out.println("Hola alumno de POO "+ nombre);
    }//cierra método

//*******************Modificaciónes práctica 04************************* */
    public int getEdad(){
        return edad;
    }//cierra método

    public boolean setEdad(int edad){
        if((edad > 0) && (edad < 120)){
            this.edad= edad;
            return true;
        }
        else{
            return false;
        }
    }//cierra método
//********************Termina modificación******************************* */
    

//Agregar método getDetalle(), el cual regresa una cadena con el nombre y la edad separados por un tabulador (\t)
    public String getDetalle(){
        return nombre+"\t"+edad;
    }
    
//********************Termina modificación******************************* */
}//cierra clase
