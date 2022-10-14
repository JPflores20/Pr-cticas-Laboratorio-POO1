package mx.desasof.Pruebas;

import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;

public class Prueba {
    public static void main(String[] args){
        Casa[] casas= { new Casa("Estandar", 3, 3000000),
                        new Campo("Cazador", 3.5f, 10f),
                        new Urbana("Residencia", 3, 2500000, 2),
                        new Casa("Estandar", 3, 3000000),
                        new Campo("Cazador", 3.5f, 10),
                        new Urbana("Residencia", 3, 2500000, 2),
                        new Casa("Estandar"),
                        new Campo("Cazador", 4, 15000, 3f, 5f),
                        new Urbana("Residencia", 5)};

       int i=0;
       while(i<casas.length){
           for(Casa c: casas){
              if(c==casas[i]){

                  
                  System.out.println(c.toString()+ " Es el mismo objeto que " + casas[i].toString());
                  System.out.println("= = = = =");

                }else if(c.equals(casas[i])== false){
                  System.out.println(c.toString()+ " No son es iguales a " + casas[i].toString());
                  System.out.println("! ! ! ! !");
                  break;

                }else{
                  System.out.println(c.toString()+ " es igual que " + casas[i].toString());
                  System.out.println("e e e e e");


                }

            } i++;  

            

        }//while
    }
    
}
