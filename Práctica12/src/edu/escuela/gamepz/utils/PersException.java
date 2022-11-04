package edu.escuela.gamepz.utils;

public class PersException extends Exception {
    private int poss;
    private String msg;
    public PersException(String msg, int poss){
        //super(msg);
        this.msg = msg;
        this.poss = poss;

    }
    public int getPoss(){
        return poss;
    }
}
