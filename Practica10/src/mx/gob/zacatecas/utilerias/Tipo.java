package mx.gob.zacatecas.utilerias;

public enum Tipo {
    SERVER("Servidor"),
    WORKSTATION("Estacion de trabajo"),
    DESKTOP("Escritorio"),
    LAPTOP("Portatil");


    private String type;
    private Tipo (String type){
    }
}
