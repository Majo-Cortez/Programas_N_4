/*******************************************
  * Nombre: Angulo Cortez Maria Jose        *
  * carrera: Analisis de Sistemas Nocturno  *
  * Asignatura: Visual II                   *
  * Nom.Profesor: Fernando Solis            *
  *                                         *
  *                                         *
  * Fecha:30/07/2019                        *
  *******************************************/ 
/*
 7.29 (Serie de Fibonacci) La serie de Fibonacci
0,1,1,2,3,5,8,13,21,...
empieza con los términos 0 y 1, y tiene la propiedad de que cada término sucesivo
es la suma de los dos términos anteriores. 
a) Escriba un método llamado fibonacci(n) que calcule el enésimo número de Fibonacci.
Incorpore este método en una aplicación que permita al usuario introducir el valor de n.
b) Determine el número de Fibonacci más grande que puede imprimirse en su sistema.
c) Modifique la aplicación que escribió en la parte (a), de manera que utilice double en vez de int para
calcular y devolver números de Fibonacci, y utilice esta aplicación modificada para repetir el inciso (b).
 */
package ec.edu.ister.aplicativo;

import java.util.Scanner;
import ec.edu.ister.fibonacci.Fibonacci;
public class Aplicativo {
    public static void main(String args[]){
        int numero;
        Scanner lee = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        do
        {
            System.out.println("Ingrese el numero de Fibonacci?");
           
            numero = lee.nextInt();
        } while ( 0 > numero );
        if ( 1 == numero )
            System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 0);
        else{
            if ( 2 == numero )
                System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 1);
            if ( 2 != numero)
                System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, obj.Calcular(numero));
        }
    }
}
