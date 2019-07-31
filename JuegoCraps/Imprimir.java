/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
 7.18 (Juego de Craps) Escriba una aplicaci�n que ejecute 1,000,000 de juegos de Craps (figura 6.8) y responda a
las siguientes preguntas:
a) �Cu�ntos juegos se ganan en el primer tiro, en el segundo, �, en el vig�simo y despu�s de �ste?
b) �Cu�ntos juegos se pierden en el primer tiro, en el segundo, �, en el vig�simo y despu�s de �ste?
c) �Cu�les son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos
de casino m�s justos. �Qu� cree usted que significa esto?].
d) �Cu�l es la duraci�n promedio de un juego de Craps?
e) �Las probabilidades de ganar mejoran con la duraci�n del juego?
 */ 

package ec.edu.ister.imprimir;

import java.util.Random;
import ec.edu.ister.craps.Craps;
public class Imprimir {
    private enum Estado {CONTINUA, GANO, PERDIO};
    private Random numerosAleatorios = new Random();
    public void ImprimeDerrota(){
        int  auxiliar = 1 + numerosAleatorios.nextInt( 5 );
        switch (auxiliar){
            case 1:
                System.out.println("\nLo siento. Siga intentando!");
                break;
            case 2:
                System.out.println("\nSi no vuelve a jugar, no se recuperara");
                break;
            case 3:
                System.out.println("\nPronto cambiara su suerte!");
                break;
            case 4:
                System.out.println("\nOh, se esta yendo a la quiebra, verdad?");
                break;
            case 5:
                System.out.println("\nMejor retirese y conserve algo de su dinero!");
                break;
            default:
                System.out.println("\nRevise este metodo!");
                break;
        }
    }
    public void ImprimeVictoria(){
        int  auxiliar = 1 + numerosAleatorios.nextInt( 5 );
        switch (auxiliar){
            case 1:
                System.out.println("\nFelicidades!");
                break;
            case 2:
                System.out.println("\nEsta acabando con la banca!");
                break;
            case 3:
                System.out.println("\nEsto es una buena racha!");
                break;
            case 4:
                System.out.println("\nHoy es su dia de suerte, verdad?");
                break;
            case 5:
                System.out.println("\nYa puede cambiar sus fichas por mucho dinero!");
                break;
            default:
                System.out.println("\nRevise este metodo!");
                break;
        }
    }
}
        