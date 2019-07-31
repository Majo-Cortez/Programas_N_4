/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*Escriba instrucciones en Java que realicen cada una de las siguientes tareas:
 c) Sumar el total de los 100 elementos del arreglo c de punto flotante.
 */
package ec.edu.ister.aplicativo;


public class Sumar {
    public static void main(String[] args){
   float c[]=new float[100]; 
   int total=0;
   System.out.println("Elmento"+":"+"Valor");
   for(int i=0;i<100;i++)
       c[i]=8;
   for(int i=0;i<100;i++){
       total+=c[i];
       System.out.println((1)+i+"    :   "+c[i]);
   }
   System.out.println("\nSuma total de elementos del arreglo: "+total);
     }
}
    
