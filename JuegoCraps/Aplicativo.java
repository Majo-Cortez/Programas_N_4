/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/ 
/*
 7.18 (Juego de Craps) Escriba una aplicación que ejecute 1,000,000 de juegos de Craps (figura 6.8) y responda a
las siguientes preguntas:
a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
c) ¿Cuáles son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos
de casino más justos. ¿Qué cree usted que significa esto?].
d) ¿Cuál es la duración promedio de un juego de Craps?
e) ¿Las probabilidades de ganar mejoran con la duración del juego?
 */
package ec.edu.ister.aplicativo;

import java.util.Scanner;
import ec.edu.ister.craps.Craps;
import ec.edu.ister.imprimir.Imprimir;
public class Aplicativo {
    private enum Estado {SI, NO};
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Craps juego = new Craps();
        int saldoBanco = 1000;
        Estado  continuar;
        continuar = Estado.SI;
        int apuesta = 2*saldoBanco;
        int x;
        int y;
        while (apuesta > saldoBanco){
            System.out.printf("\nEl banco cuenta con un saldo de  %d, por", saldoBanco);
            System.out.println("favor haga su apuesta: ");
            apuesta =  entrada.nextInt();
        }
        while (Estado.SI == continuar && 0 < saldoBanco){
            x = juego.jugar();
            if (1 == x){
                saldoBanco -= apuesta;
                System.out.printf("Usted gano %d!\n", apuesta);
                juego.ImprimeVictoria();
            }
            else{
                saldoBanco += apuesta;
                System.out.printf("Usted perdio %d ", apuesta);
                juego.ImprimeDerrota();
            }
            if ( 0 < saldoBanco ){
                System.out.printf("\nEl banco cuenta con un saldo de  %d, por", saldoBanco);
                System.out.println(" favor haga su apuesta o -1 para terminar.");
                y =  entrada.nextInt();
                while ( -1 != y &&  y > saldoBanco ){
                    System.out.printf("\nEl banco cuenta con un saldo de  %d, por", saldoBanco);
                    System.out.println(" favor haga su apuesta o -1 para terminar.");
                    y =  entrada.nextInt();
                }
                if ( -1 == y )
                    continuar = Estado.NO;
                else
                    apuesta = y;
            }
        }
    }
}
    