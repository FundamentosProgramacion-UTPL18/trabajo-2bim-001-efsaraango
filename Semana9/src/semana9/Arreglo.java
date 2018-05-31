/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author SARANGO
 */
public class Arreglo {
     public static void main(String[] args) {
         int[] arreglo = {1 ,2 ,3 ,4 ,5 ,6 ,7 };
         int multiplica =1;
         
         for(int contador=0 ; contador < arreglo.length  ; contador ++){
             if (arreglo[contador] % 2 == 0){
                 for (int contador1=1 ; contador1 <=12  ; contador1 ++){
                  
                     multiplica = arreglo[contador] * contador1;
                    System.out.printf("%d * %d = %d\n",arreglo[contador] ,contador1 , multiplica );
                 }
                 System.out.println("------------");
             } 
         
        
         
         
         
         }

     }
}
