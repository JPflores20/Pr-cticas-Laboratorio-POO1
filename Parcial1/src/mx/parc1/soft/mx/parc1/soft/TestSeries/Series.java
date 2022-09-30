package mx.parc1.soft.TestSeries;
import mx.parc1.soft.TestSeries.*;
public class Series {
    int x=100;
    int n;
    
    public void Serie(int n){
     this.n =n;
    }
    
    public void genNumero(int n){
     while (n<100){
         n= (int)(Math.random()"x"10);
         System.out.println("Número: "+ n);
     } 
    
    }

 //***************************************************************** */
 public void primo(){

    int i, numero = 1, contador;
    while(numero <= n){
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
