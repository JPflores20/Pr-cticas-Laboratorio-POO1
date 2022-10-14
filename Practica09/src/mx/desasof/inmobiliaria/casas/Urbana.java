package mx.desasof.inmobiliaria.casas;

public class Urbana extends Casa {
    private int banios;

    public Urbana(String tipo, int hab, float costo){
        super(tipo,hab,costo);
    }

    public Urbana (String tipo, int banios){
        super(tipo);
        this.banios=banios;
    }
    
    public int hashCode(){
        return(super.hashCode() * banios * 23);
    }

    public boolean equals(Casa ObjetoUrbana){
        return super.equals(ObjetoUrbana) && ObjetoUrbana instanceof Urbana;
    }
}



