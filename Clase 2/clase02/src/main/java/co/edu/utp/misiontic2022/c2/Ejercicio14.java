package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Mostrar los N primeros términos de la serie de Fibonacci.

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){

        int suma = 1, num1 = 0, num2 = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca N: ");
        int n = sc.nextInt();

        System.out.println("----------Fibonacci----------");
         // Muestro el valor inicial
         System.out.println(num1);
         
    
        for(int i=1;i<n;i++){
            System.out.println(suma);
            suma = num1 + num2; // sumar los últimas cifras de  la sucesión
            num1= num2; //actualizar valor
            num2 = suma; // actualizar valor

        }
      
        sc.close();
    }

    
    
}
