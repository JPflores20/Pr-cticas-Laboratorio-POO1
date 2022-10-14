package mx.desasof.inmobiliaria.casas;

public class Campo extends Casa{

    private float piscina[];

    public Campo (String tipo, int hab, float costo, float ancho, float largo){
        super(tipo,hab,costo);
        piscina[0]=ancho;
        piscina[1]=largo;

    }
    public int hashcode(){
        return ((super.hashCode() * (int)piscina[0] * (int)piscina[1]))/5;
    }
    public boolean equals(Campo ObjetoCampo){
        if((super.equals(ObjetoCampo))&& ObjetoCampo instanceof Campo){
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString() + " " + piscina[0] + " " + piscina[1];
    }


}
