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
empieza con los t�rminos 0 y 1, y tiene la propiedad de que cada t�rmino sucesivo
es la suma de los dos t�rminos anteriores. 
a) Escriba un m�todo llamado fibonacci(n) que calcule el en�simo n�mero de Fibonacci.
Incorpore este m�todo en una aplicaci�n que permita al usuario introducir el valor de n.
b) Determine el n�mero de Fibonacci m�s grande que puede imprimirse en su sistema.
c) Modifique la aplicaci�n que escribi� en la parte (a), de manera que utilice double en vez de int para
calcular y devolver n�meros de Fibonacci, y utilice esta aplicaci�n modificada para repetir el inciso (b).
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
   