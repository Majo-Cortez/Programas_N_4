/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
7.17 (Tiro de dados) Escriba una aplicaci�n para simular el tiro de dos dados. La aplicaci�n debe utilizar un objeto
de la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. Despu�s debe calcularse la
suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo que la suma de los valores variar�
del 2 al 12, siendo 7 la suma m�s frecuente, mientras que 2 y 12 ser�n las sumas menos frecuentes. En la figura 7.28
se muestran las 36 posibles combinaciones de los dos dados. Su aplicaci�n debe tirar los dados 36,000,000 de veces.
Utilice un arreglo unidimensional para registrar el n�mero de veces que aparezca cada una de las posibles sumas.
Muestre los resultados en formato tabular.
 */
package ec.edu.ister.aplicativo;

import ec.edu.ister.ingresar.Ingresar;


public class Aplicativo {

     public static void main(String []args ){
         int Contador[] = new int[13];
       
       Ingresar ob = new Ingresar();
       ob.Ingreso();
     }
}
