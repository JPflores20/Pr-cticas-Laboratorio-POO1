package Casas;

public class Campo extends Casa{

    float[] piscina;

    public Campo (String tipo, int hab, float costo, float ancho, float largo){
        super(tipo,hab,costo);
        piscina[0]=ancho;
        piscina[1]=largo;

    }
    
}
