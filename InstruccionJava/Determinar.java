/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
 e) Determinar e imprimir los valores menor y mayor contenidos 
en el arreglo w con 99 elementos de punto flotante.
 */
package ec.edu.ister.aplicativo;


public class Determinar {
     public static void main(String[] args){
     int w[]=new int[99];
     int mayor=0,menor=0;
    for ( int j = 0; j < 99; ++j ) 
        if ( w[ j ] <menor ) 
            menor = w[ j ]; 
        else if ( w[ j ] >mayor ) 
            mayor = w[ j ];
}
    
}
