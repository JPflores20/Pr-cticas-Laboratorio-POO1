package mx.desasof.inmobiliaria.casas;

public class Casa {
    private int hab;
    private String tipo;
    private float costo;

    public Casa (String tipo, int hab, float costo){
        this.tipo=tipo;
        this.hab=hab;
        this.costo=costo;
    }

    public Casa(String tipo){
        this(tipo, 2, 2000000);
    }

    public int hashCode(){
        return tipo.hashCode() * hab * (int)costo;


    }

    public boolean equals (Casa ObjetoCasa){
        if(ObjetoCasa!=null && ObjetoCasa instanceof Casa){
            Casa tmp= (Casa) ObjetoCasa;
            if(tipo.equals(tmp.tipo) && (costo==tmp.costo)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return tipo + "\t" + costo + "\t" + hab;

    }


}
