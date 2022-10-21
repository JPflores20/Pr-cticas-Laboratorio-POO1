package mx.gob.zacatecas.enumerados.utilerias;

public enum Memoria {
    DDR("MemoriaRam",160f,30),
    DDR2("Laptop",240f,35),
    DDR3("Laptop nueva",553f,40),
    DDR4("Gamer", 1600f, 4);

    private final String tipo;
    private final float velocidad;
    private final int pines;

    private Memoria(String tipo,float velocidad, int pines){
        this.tipo = tipo;
        this.velocidad=velocidad;
        this.pines=pines;
    

    }

    public String getTipo(){
        return tipo;
    }
    public float getVelocidad(){
        return velocidad;
    }
    public int getPines(){
        return pines;
    }

    
}
