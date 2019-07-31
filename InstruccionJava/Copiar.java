/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
d) Copiar el arreglo a de 11 elementos en la primera porción del arreglo b, el 
cual contiene 34 elementos.
 */
package ec.edu.ister.aplicativo;

/**
 *
 * @author User
 */
public class Copiar {
    public static void main(String[] args){
        int a[]=new int[34];
        int b[]=new int [34];
    for ( int i = 0; i < 11; ++i ) 
    b[ i ] = a[ i ];
    
}
}