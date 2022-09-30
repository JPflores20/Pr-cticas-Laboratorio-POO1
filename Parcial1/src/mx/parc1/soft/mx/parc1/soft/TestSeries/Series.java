package mx.parc1.soft.TestSeries;
import mx.parc1.soft.TestSeries.*;
public class Series {

//***************************************************************** */
    public static void main(String[] args){

        int i, numero = 1, contador;
        while(numero <= 100){
            contador = 0;
            i = 2;
            while(i <= numero/2 ){
                if(numero % i == 0){
                contador++;
                break;
                }
             i++;
            }
            if(contador == 0 && numero != 1 ){
                System.out.print(numero + " ");
            }
         numero++;
        }
    }
//********************************************************************* */     



}
