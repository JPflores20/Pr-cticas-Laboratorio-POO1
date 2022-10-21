package mx.gob.zacatecas.utilerias;

public enum Memoria {
    DDR("MemoriaRam",160f,30),
    DDR2("Laptop",240f,35),
    DDR3("Laptop nueva",553f,40),
    DDR4("Gamer", 1600f, 4);

    private String tipo;
    private float velocidad;
    private int pines;
    
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

    
    
    //
    
}
