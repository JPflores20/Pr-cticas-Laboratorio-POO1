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
        String cadena = etq.getText();
        for(int i = 0; i<50; i++){
            cadena += letra;
            etq.setText(cadena);
            int rand = (int)Math.random()*1000;
            try{
                Thread.sleep(rand);
            }catch (InterruptedException e){

            }
        }
        cadena += "Finalizado";
        etq.setText(cadena);
    }
    
}
