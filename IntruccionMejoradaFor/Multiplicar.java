/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 7.16 (Uso de la instrucci�n formejorada) Escriba una aplicaci�n que utilice una 
instrucci�n for mejorada para sumar los valores double que se pasan mediante los 
argumentos de l�nea de comandos. [Sugerencia: use el m�todo static parseDouble de 
la clase Double para convertir un String en un valor double].
 */
package ec.edu.ister.instruccionfor;


public class Multiplicar {
    public static double Multiplicar( double A[] ){
        double producto = 1;
        for ( int i = 0; i < A.length; i++ )
            producto *= A[i];
        return producto;
    }
} 
    