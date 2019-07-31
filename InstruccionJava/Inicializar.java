/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
 Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
b) Inicializar con 8 cada uno de los cinco elementos del arreglo entero unidimensional g.
 */

import java.util.Scanner;
public class Inicializar {
     public static void main(String[] args) {
        int g[]=new int[5];
        for(int i=0;i<5;i++)
            g[i]=8;
        System.out.println("Elmento"+" : "+"Valor");
        for(int i=0;i<5;i++)
            System.out.println((1)+i+"       :   "+g[i]);
        
        }
}
    