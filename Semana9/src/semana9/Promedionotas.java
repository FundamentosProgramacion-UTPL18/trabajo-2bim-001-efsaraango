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
public class Promedionotas {
    public static void main(String[] args) {
        // Declaramos los arreglos a usar.
        double[]calificaciones_progr= {8, 19, 15, 16 ,17 ,10};
        double[]calificaciones_bd= {10, 12, 13, 20 ,17 ,20};
        double[] promedios= new double [6];
        //Recorremos arreglos para la suma .
        for (int contador= 0; contador< calificaciones_bd.length ; contador ++ ){
          double suma = calificaciones_progr[contador] + calificaciones_bd[contador];  
          double promedio = suma/2;
         //guardamos resultados en la  lista promedios
          promedios[contador] = promedio;
        }
        //imprimimos valores.
        for (int contador1= 0 ; contador1 < calificaciones_bd.length ; contador1 ++ ){
            System.out.printf("Estudiante %d %-15f%-15f%-15f\n",contador1+1, calificaciones_progr[contador1] , calificaciones_bd[contador1], promedios[contador1]);
        }
        
    }
}
