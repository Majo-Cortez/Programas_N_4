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

package ec.edu.ister.llenarcuadrado;

public class LlenarCuadrado {
    public void Cuadrado( int n){
        for ( int i = 1; i <= n; i++ ){
            for ( int j = 1; j <= n; j++ )
                System.out.print("*");
            System.out.println();
        }
    }
    
}
