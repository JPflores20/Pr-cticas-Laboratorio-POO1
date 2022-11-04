package edu.escuela.gamepz.utils;

public class PersException {
    private int poss;
    private int msg;
    public PersException(String msg, int poss){
        //super(msg);
        this.poss = poss;

    }
    public int getPoss(){
        return poss;
    }
}
