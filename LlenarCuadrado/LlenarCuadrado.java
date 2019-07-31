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
