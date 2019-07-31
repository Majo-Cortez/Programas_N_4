/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/

/*
 7.15 (Argumentos de línea de comandos) Modifique la figura 7.2, de manera que el tamaño 
del arreglo se especifique mediante el primer argumento de línea de comandos. Si no se 
suministra un argumento de línea de comandos,use 10 como el valor predeterminado del arreglo.
 */
package ec.edu.ister.argumentoarreglo;

import java.util.Scanner;
public class ArgumentoArreglo {
     public static void main(String args[]){
         Scanner entrada = new Scanner(System.in);
         int arreglo[];
         int numero = 10;
         System.out.println("\nIngrese el tamanio del arreglo.");
         numero = entrada.nextInt();
         arreglo = new int[numero];
         System.out.printf("%s%8s\n", "Indice", "Valor");
         for ( int contador = 0; contador < arreglo.length; contador++ )
             System.out.printf("%5d%8d\n", contador, arreglo[contador]);
     }
}   