/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*7.13 Etiquete los elementos del arreglo bidimensional ventas de tres por cinco,
para indicar el orden en el que se establecen en cero, mediante el siguiente fragmento de programa:
for (int fila = 0; fila < ventas.length; fila++)
{
for (int col = 0; col < ventas[fila].length; col++)
{
ventas[fila][col] = 0;
}
}
*/
package ec.edu.ister.elementos;

import java.util.Scanner;
public class AplicativoElementos {
    public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
  
 int [][]ventas=new int [3][5];
 for(int fila=0;fila<3;fila++){
     for(int columna=0;columna<5;columna++){
         ventas[fila][columna]=0;
         System.out.println("ventas["+fila+"]["+columna+"]="+ventas[fila][columna]+" ");
     }
     System.out.println("\n  ");
 }
    }
}