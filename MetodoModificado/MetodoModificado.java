/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
 Modifique el m�todo creado en el ejercicio 6.18 para formar el cuadrado de cualquier 
car�cter que est� contenido en el par�metro tipo car�cter  caracter. Por ejemplo, 
si lado es 5 y caracter es #, el m�todo debe imprimir:
# # # # #                                                                                                         
# # # # # 
# # # # # 
# # # # # 
# # # # # 
 */
package ec.edu.ister.metodomodificado;

public class MetodoModificado {
    public void Cuadrado( int n, String c){
        for ( int i = 1; i <= n; i++ ){
            for ( int j = 1; j <= n; j++ )
                System.out.printf("%s ", c);
            System.out.println();
        }
    }
}
 