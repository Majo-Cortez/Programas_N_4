/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
 * 7.12 (Eliminación de duplicados) Use un arreglo unidimensional para resolver el siguiente problema: 
escriba una aplicación que reciba como entrada cinco números, cada uno de los cuales debe estar 
entre 10 y 100, inclusive. A medida que se lea cada número, muéstrelo solamente si no es un duplicado 
de un número que ya se haya leído.Prepárese para el “peor caso”, en el que los cinco números son diferentes. 
Use el arreglo más pequeño que sea posible para resolver este problema. Muestre el conjunto completo de valores 
únicos introducidos, después de que el usuario introduzca cada nuevo valor.
 */
package ec.edu.ister.imprimir;
import ec.edu.ister.ingresar.Ingresar;
public class Imprimir {
    enum Estado {SI, NO};
    public void Imprime(){
       //Scanner entrada = new Scanner(System.in);
 Ingresar ing = new Ingresar();
 ing.Ingresa();
 int Tamano = 5;
  int numero;
  int numeros_recibidos = 0;
  Estado almacenar;
     Estado imprimir;
      int Arreglo[] = new int[Tamano];
     System.out.printf("\nLos numeros recibidos: %d", numeros_recibidos);
     imprimir = Estado.SI;
     System.out.printf("\n%d", Arreglo[0]);
     for ( int j = 1; j < numeros_recibidos; j++ ){
         imprimir = Estado.SI;
         for ( int k = 0; k < j; k++){
             if ( Arreglo[j] == Arreglo[k] )
                 imprimir = Estado.NO;
         }
         if ( Estado.SI == imprimir ){
             System.out.printf("\n%d", Arreglo[j]);
         }
     }

 }
}
    