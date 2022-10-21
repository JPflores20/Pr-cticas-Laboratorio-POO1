package mx.gob.zacatecas.pruebas;
import mx.gob.zacatecas.enumerados.equipos.*;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class PruebaComputadora {
    public static void main(String[] args){
        
    Computadora DELL =new Computadora("DELL", Tipo.LAPTOP, Memoria.DDR);
    Computadora HP= new Computadora("HP", Tipo.DESKTOP, Memoria.DDR2);
    Computadora LENOVO= new Computadora("LENOVO", Tipo.WORKSTATION, Memoria.DDR3);
    Smallfactor ASUS = new Smallfactor("ASUS", Tipo.SERVER, Memoria.DDR4,true);

    Computadora [] compus = {DELL, HP, LENOVO, ASUS};

    for(Computadora tmp : compus){
        System.out.println(tmp);
    }

    
    }

    


    
}
