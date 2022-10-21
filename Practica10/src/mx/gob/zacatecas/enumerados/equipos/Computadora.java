package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.Memoria;
import mx.gob.zacatecas.enumerados.utilerias.Tipo;

public class Computadora {
    private String marca;
    private Tipo tipo;
    private Memoria memoria;

    //tipo de tipo tipo
    //memoria de tipo memoria

    public Computadora (String marca, Tipo tipo, Memoria memoria){
        this.marca=marca;
        this.tipo=tipo;
        this.memoria=memoria;
    }

    public String toString(){
        return marca +  tipo.getType() + " " + memoria.getVelocidad() + " " + memoria.getPines()+ tipo;
    }

    
}

