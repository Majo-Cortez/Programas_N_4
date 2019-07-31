/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 7.12 (Eliminaci�n de duplicados) Use un arreglo unidimensional para resolver el siguiente problema: 
escriba una aplicaci�n que reciba como entrada cinco n�meros, cada uno de los cuales debe estar 
entre 10 y 100, inclusive. A medida que se lea cada n�mero, mu�strelo solamente si no es un duplicado 
de un n�mero que ya se haya le�do.Prep�rese para el �peor caso�, en el que los cinco n�meros son diferentes. 
Use el arreglo m�s peque�o que sea posible para resolver este problema. Muestre el conjunto completo de valores 
�nicos introducidos, despu�s de que el usuario introduzca cada nuevo valor.
 */
package ec.edu.ister.ingresar;

import java.util.Scanner;
import ec.edu.ister.imprimir.Imprimir;
public class Ingresar {
    Imprimir obj=new Imprimir();
    Scanner entrada = new Scanner(System.in);
    enum Estado {SI, NO};
    private int Tamano = 5;
    private int numero;
    private int numeros_recibidos = 0;
    Estado almacenar;
    Estado imprimir;
    int Arreglo[] = new int[Tamano];
    public void Ingresa(){
        for ( int n = 0; n <  Tamano; n++ ){
            numero = 0;
            while ( (10 > numero) || ( 100 < numero) ){
                System.out.println("\nIngrese un numero entre 10 y 100 \n");
                numero = entrada.nextInt();
            }
            Arreglo[n] = numero;
            numeros_recibidos++;
        }
      obj.Imprime();
    }
}