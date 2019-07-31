/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
Modifique el método creado en el ejercicio 6.18 para formar el cuadrado de cualquier 
carácter que esté contenido en el parámetro tipo carácter  caracter. Por ejemplo, 
si lado es 5 y caracter es #, el método debe imprimir:
# # # # #                                                                                                         
# # # # # 
# # # # # 
# # # # # 
# # # # # 
 */
 
package ec.edu.ister.aplicativo;
import java.util.Scanner;
import ec.edu.ister.metodomodificado.MetodoModificado;
public class Aplicativo {
    public static void main( String args[]){
        int lado;
        String caracter;
        Scanner entrada = new Scanner(System.in);
        MetodoModificado obj = new MetodoModificado();
        System.out.println("\nPor favor introduzca un caracter: ");
        caracter = entrada.nextLine();
        System.out.println("\nPor favor introduzca un entero: ");
        lado = entrada.nextInt();
        obj.Cuadrado(lado, caracter);
    }
}