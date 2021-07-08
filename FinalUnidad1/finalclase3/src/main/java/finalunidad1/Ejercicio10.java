package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89. */

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca número entero: ");
        int nume = sc.nextInt();
        
        Fibon(nume); //llamar el método desde main()

        sc.close();


    }

    public static void Fibon(int num){
        int serie=num, num1=0, num2=1, suma=1;

        //// Muestro el valor inicial
        System.out.print(num1 + " "); //imprimir sin saltos

        for(int i=1;i<serie;i++){
            if(suma>serie)  //evaluamos al inicio la suma en cada ciclo
                break; // interrumpir ciclo for
            System.out.print(suma + " "); //imprimir en la misma línea
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1=num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2=suma;
        }
        
    } 
}
