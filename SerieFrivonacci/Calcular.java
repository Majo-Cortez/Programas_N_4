/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
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
 package ec.edu.ister.fibonacci;

 import java.util.Scanner;
 public class Fibonacci {
 private int fibonacci1;
 private int fibonacci2;
 
   
    public int Calcular(int n){
        int fibonacci1 = 1;
        int fibonacci2 = 0;
        int fibonacci3 = 0;
        Scanner entrada = new Scanner(System.in);
        for ( int i = 3; i <= n; i++){
            fibonacci3 = fibonacci2 + fibonacci1;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;
        }
        return fibonacci3;
    }        
 } 
   