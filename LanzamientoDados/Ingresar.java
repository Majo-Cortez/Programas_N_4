/*******************************************
* Nombre: Angulo Cortez Maria Jose         *
* carrera: Analisis de Sistemas Nocturno   *
* Asignatura: Visual II                    *
* Nom.Profesor: Fernando Solis             *
* Fecha:30/07/2019                         *
* ******************************************/
/*
7.17 (Tiro de dados) Escriba una aplicación para simular el tiro de dos dados. La aplicación debe utilizar un objeto
de la clase Random una vez para tirar el primer dado, y de nuevo para tirar el segundo. Después debe calcularse la
suma de los dos valores. Cada dado puede mostrar un valor entero del 1 al 6, por lo que la suma de los valores variará
del 2 al 12, siendo 7 la suma más frecuente, mientras que 2 y 12 serán las sumas menos frecuentes. En la figura 7.28
se muestran las 36 posibles combinaciones de los dos dados. Su aplicación debe tirar los dados 36,000,000 de veces.
Utilice un arreglo unidimensional para registrar el número de veces que aparezca cada una de las posibles sumas.
Muestre los resultados en formato tabular.
 */ 

 package ec.edu.ister.ingresar;

 import java.util.Scanner;
 import java.util.Random;
 import ec.edu.ister.lanzar.Lanzar;
 public class Ingresar {
    Scanner entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    private int numero;
    int Arreglo[];
    int Contador[] = new int[13];
    public void Ingreso(){
        int Arreglo[];
        Lanzar obj1 = new Lanzar();
        System.out.print("\nIngrese el numero de veces que se lanzaran ");
        System.out.print(" los dados\n");
        numero = entrada.nextInt();
        obj1.Lanzar();
    }
}