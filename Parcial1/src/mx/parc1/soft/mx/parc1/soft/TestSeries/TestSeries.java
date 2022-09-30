package mx.parc1.soft.TestSeries;

public class TestSeries {
        //primos(int)
    public static void main(String[] args) {
        int Serie;

        Serie s = new Serie();


        int m = s.genNumero(100);


        s.primos(m);




  /* PRUEBA IMPRIMIR PRIMOS DEL 1 AL 100
        int i, numero = 1, contador;
      
        System.out.println(" Los numeros primos del 1 al 100 son: ");
         while(numero <= 100){
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

         */

        

        //s.fibo(n);

        //int p = s.fiboN(3, 11);

        //System.out.println(p);

        //int o = s.primoN(m/10);

       // System.out.println(o);

    }


}
    

