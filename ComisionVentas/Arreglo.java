/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
7.10 (Comisión por ventas)Utilice un arreglo unidimensional para resolver el siguiente problema: 
una compañía paga a sus vendedores por comisión. Los vendedores reciben $200 por semana más el 9% 
de sus ventas totales de esa semana. Por ejemplo, un vendedor que acumule $5,000 en ventas en una semana, 
ibirá $200 más el 9% de $5,000,o un total de $650. Escriba una aplicación (utilizando un arreglo de contadores) 
que determine cuántos vendedores recibieron salarios en cada uno de los siguientes rangos (suponga que el salario 
de cada vendedor se trunca a una cantidad entera):
a) $200-299
b) $300-399
c) $400-499
d) $500-599
e) $600-699
f ) $700-799
g) $800-899
h) $900-999
i) $1,000 en adelante
Sintetice los resultados en formato tabular.
 */
package ec.edu.ister.arreglo;

import java.util.Scanner;
public class Arreglo{
    private int trabajadores = 10; 
    float arregloA[] = new float[trabajadores + 1];
    int arregloB[] = new int[trabajadores + 1];
    int arregloC[] = new int[11];
    public void Obtiene(){
        Scanner entrada = new Scanner(System.in);
        float ventas;
        for ( int j = 0; j < trabajadores; j++ ){
            arregloC[j] = 0;
        }
        for ( int i = 1; i <= trabajadores; i++ ){
            System.out.printf("\n\n\nIngrese las ventas del empleado numero %d  ", i);
            ventas = entrada.nextFloat();
            arregloA[i] = ((float)(9)/100)*ventas + 200;
            System.out.printf("\nEl salario del empleado %d es: %.2f\n ", i, arregloA[i]);
            arregloB[i] = (int)(arregloA[i])/100;
        }
        for (int k = 1; k <= trabajadores; k++ ){
            if (arregloB[k] < 10)
                arregloC[arregloB[k]]++;
            else
                arregloC[trabajadores]++;
        }
        for (int j = 2; j < trabajadores; j++ ){
            System.out.printf("\nHay %d empleados que cobran entre %d", arregloC[j], (j * 100));
            System.out.printf(" y %d pesos.\n", (( j + 1 ) * 100 ) - 1 );
        }
        System.out.printf("Hay %d empleados que cobran 1000 o mas.\n\n", arregloC[trabajadores]);
    }
}
    
