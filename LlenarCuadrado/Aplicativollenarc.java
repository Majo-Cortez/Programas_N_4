/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 Escriba un m�todo llamado Cuadrado que muestre un cuadrado relleno 
(el mismo n�mero de filas y columnas) de aster�scos cuyo lado se especif�que
en el par�metro entero lado.Por ejemplo, si el lado es 4, el m�todo debe mostrar:
 */
package ec.edu.ister.aplicativo;

import java.util.Scanner;
import ec.edu.ister.llenarcuadrado.LlenarCuadrado;
public class Aplicativollenarc {
    public static void main(String[] args){
       
        int lado;
        Scanner entrada = new Scanner(System.in);
        LlenarCuadrado obj = new LlenarCuadrado();
        System.out.println("\nIngrese  un numero entero: ");
        lado = entrada.nextInt();
        obj.Cuadrado(lado);
    }
}
