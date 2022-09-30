package mx.parc1.soft.TestSeries;
import  mx.parc1.soft.Series.*;
public class TestSeries {
        //primos(int)
    public static void main(String[] args) {
        Serie s = new Serie();



        int m = s.genNumero(100);
        System.out.println(m);

        String primo= s.primos(m);
        System.out.println(primo);

        System.out.println(" Los números primos son:  ");

 

        

        //s.fibo(n);

        //int p = s.fiboN(3, 11);

        //System.out.println(p);

        //int o = s.primoN(m/10);

       // System.out.println(o);

    }


}
    

