package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
public class Letra implements Runnable {
    char letra;
    JLabel etq;

    public Letra(char Letra, JLabel etq){
        this.letra = Letra;
        this.etq =etq;
    }

    public void run(){

    }
    
}
