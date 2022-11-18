package edu.escuela.gamepz.utils;

public enum Escudo {
    //valores SUPER, MEDIO, BAJO, NULO con los valores enteros 0, 1, 2, 3 respectivamente
    SUPER (0), MEDIO (1), BAJO (2), NULO (3);

    //el valor númerico se llamara nivel
    private final int nivel;
    private Escudo(int nivel) {
        this.nivel = nivel;
    }
    public int getNivel(){
        return nivel;
    }
}
