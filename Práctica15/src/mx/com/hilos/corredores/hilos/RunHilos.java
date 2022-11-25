package mx.com.hilos.corredores.hilos;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class RunHilos {
    public static void iniciar (JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2 ){

        char ch1 = txt1.getText().charAt(0);
        char ch2 = txt2.getText().charAt(0);

        if(txt1.getText() ==("") ){
            ch1= 'E';
        }
        if(txt2.getText() ==("")){
            ch2= 'M';
        }

        String salida1 = "" + ch1;
        String salida2 = "" + ch2;
        elem1.setText(salida1);

    }
}
