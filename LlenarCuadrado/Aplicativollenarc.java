/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 Escriba un método llamado Cuadrado que muestre un cuadrado relleno 
(el mismo número de filas y columnas) de asteríscos cuyo lado se especifíque
en el parámetro entero lado.Por ejemplo, si el lado es 4, el método debe mostrar:
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
