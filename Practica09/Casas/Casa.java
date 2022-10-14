package Casas;

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
    
    
}
