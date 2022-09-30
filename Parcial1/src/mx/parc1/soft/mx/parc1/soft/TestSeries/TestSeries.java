package mx.parc1.soft.TestSeries;
import mx.parc1.soft.Series.Serie;
public class TestSeries {
        //primos(int)
    public static void main(String[] args) {
        Serie s = new Serie();



        int m = s.genNumero(100);
        System.out.println(m);

        String primo= s.primos(m);
        System.out.println(primo);



  /* PRUEBA IMPRIMIR PRIMOS DEL 1 AL 100
        int i, numero = 1, contador;
      
        
         while(numero <= m){
             contador = 0;
              i = 2;
               while(i <= numero/2 ) {
              if(numero % i == 0){
                 contador++;
                 break; //SI SE CUMPLE ROMPO EL CICLO
                 }
                i++;
             }
             if(contador == 0 && numero != 1 ){
                  System.out.print(numero + " ");
             }
              numero++;
         }
         System.out.println(" Los numeros primos del 1 al 100 son: ", s.primos(m));

         */

        

        //s.fibo(n);

        //int p = s.fiboN(3, 11);

        //System.out.println(p);

        //int o = s.primoN(m/10);

       // System.out.println(o);

    }


}
    

