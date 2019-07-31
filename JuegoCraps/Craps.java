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

package ec.edu.ister.craps;

import java.util.Random;
public class Craps {
    private Random numerosAleatorios = new Random();
    public void ImprimeDerrota(){
    }
    public void ImprimeVictoria(){
    }
    private enum Estado {CONTINUA, GANO, PERDIO};
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    public int jugar()
    {
        int Punto = 0;
        Estado estadoJuego;
        int sumaDeDados = tirarDados();
        switch( sumaDeDados ){
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANO;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PERDIO;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                Punto = sumaDeDados;
                System.out.printf("El punto es %d\n", Punto);
                break;
        }
        while( estadoJuego == Estado.CONTINUA ){
            sumaDeDados = tirarDados();
            if (sumaDeDados == Punto)
                estadoJuego = Estado.GANO;
            else
                if (sumaDeDados == SIETE )
                    estadoJuego = Estado.PERDIO;
        }
        if ( estadoJuego == Estado.GANO ){
            System.out.println("El jugador gana");
            return 1;
        }
        else{
            System.out.println("El jugador pierde");
            return -1;
        }
    }
    public int tirarDados(){
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        int suma = dado1 + dado2;
        System.out.printf("El jugador tiro %d + %d = %d\n",dado1, dado2, suma);
        return suma;
    }
}
