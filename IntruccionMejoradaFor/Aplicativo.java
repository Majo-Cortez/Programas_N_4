/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 7.16 (Uso de la instrucción formejorada) Escriba una aplicación que utilice una 
instrucción for mejorada para sumar los valores double que se pasan mediante los 
argumentos de línea de comandos. [Sugerencia: use el método static parseDouble de 
la clase Double para convertir un String en un valor double].
 */
package ec.edu.ister.aplicativo;

import java.util.Scanner;
import static ec.edu.ister.instruccionfor.Multiplicar.Multiplicar;
public class Aplicativo {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        double Arreglo[];
        System.out.println("\nIngrese el tamanio del arreglo: ");
        numero = entrada.nextInt();
        Arreglo = new double[numero];
        for ( int i = 0; i < Arreglo.length; i++ ){
            System.out.printf("\nIngrese el %d numero flotante: ", i + 1 );
            Arreglo[i] = entrada.nextDouble();
        }
        System.out.printf("\nEl producto de los numeros es: %.2f\n", Multiplicar(Arreglo));
    }
}
