package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;


public class PruebaPersonaje {

    public static void main(String[] args) {

// modificar clase PruebaPersonaje para cear 5 instancias de la Personaje en el método principal 

        //Personaje per01
        Personaje per01= new Personaje("Almendra");
        per01.setEdad(200);
        per01.getDetalle();
        //imprimir instancia con el método getDetalle
        System.out.println(per01.getDetalle());

        //Personaje per02
        Personaje per02= new Personaje("Ricardo");
        per02.setEdad(10);
        per02.getDetalle();
        //imprimir instancia con el método getDetalle
        System.out.println(per02.getDetalle());

        //Personaje per03
        Personaje per03= new Personaje("Bianca");
        per03.setEdad(1);
        per03.getDetalle();
        //imprimir instancia con el método getDetalle
        System.out.println(per03.getDetalle());

        //Personaje per04
        Personaje per04= new Personaje("Leonel");
        per04.setEdad(-10);
        per04.getDetalle();
        //imprimir instancia con el método getDetalle
        System.out.println(per04.getDetalle());

        //Personaje per05
        Personaje per05= new Personaje("Hector");
        per05.setEdad(500);
        per05.getDetalle();
        //imprimir instancia con el método getDetalle
        System.out.println(per05.getDetalle());

        
        //agregar 5 instanciaas de la clase personaje 
        Personaje per06= per05;
        Personaje per07= per04;
        Personaje per08= per03;
        Personaje per09= per02;
        Personaje per10= per01;

//cambio de nombres
        per06.setNombre("Francisco Xavier Zepeda Flores");// cambiar el nombre de la instancia per06 por "Francisco Xavier Zepeda Flores"
        per08.setNombre("Dayan");// cambiar el nombre de la instancia per08 por "Dayan"
        per10.setNombre("Axel Fabian Eduardo David");// cambiar el nombre de la instancia per10 por "Axel Fabian Eduardo David"

        // cambiar el valor de las edades usando setEdan(n) (n= NumeroAleatorio) con un numero n aleatorio etre 0 y 1000 de las instancias  per07 y per09
        int NumeroAleatorio= (int)(Math.random()*1000);//random crea numero aleatorio
        per07.setEdad(NumeroAleatorio);

        int NumeroAleatorio2= (int)(Math.random()*1000);
        per09.setEdad(NumeroAleatorio2);

        //imprimir tres guiones(---)
        System.out.println("---");

        //imprimir los datos de las primeras 5 instancias utilizando el método getDetalle
        System.out.println(per01.getDetalle());
        System.out.println(per02.getDetalle());
        System.out.println(per03.getDetalle());
        System.out.println(per04.getDetalle());
        System.out.println(per05.getDetalle());
        
        
        
        
    }  
}

