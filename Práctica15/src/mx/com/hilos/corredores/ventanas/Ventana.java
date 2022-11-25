import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
public class Ventana extends JFrame {
    JLabel IbITitulo, IbIElem1, IbIElem2, hElem1, hElem2;
    JTextField txtElem1, txtElem2;
    JButton btnStart;

    public Ventana(){
        initComponents();
    }
    public void initComponents(){
        int ancho=550;
        int alto= 250;
        Dimension IbIDim = new Dimension(ancho-15, alto/10);
        Color border = new Color(0, 0, 255);
        IbITitulo = new JLabel("*Practica 16 Manejo de hilos");
        IbITitulo.setPreferredSize(IbIDim);
        IbIElem1 = new JLabel("Hilo 1");
        txtElem1 = new JTextField(3);
        IbIElem2 = new JLabel("Hilo 2");
        btnStart = new JButton("Comenzar");
        hElem1 = new JLabel("Aquí va el hilo 1");
        hElem1.setBorder(BorderFactory.createLineBorder(border));
        hElem1.setPreferredSize(IbIDim);
        hElem2 = new JLabel("Aquí va el hilo 2");
        hElem2.setBorder(BorderFactory.createLineBorder(border));
        hElem2.setPreferredSize(IbIDim);
        btnStart.setPreferredSize(IbIDim);
    }
}
