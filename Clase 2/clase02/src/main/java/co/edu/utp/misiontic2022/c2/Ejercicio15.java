package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un Número N: ");
        int ene = sc.nextInt();

        int a=0, sum = 0; // ene es la variable que limita n veces las iteraciones del for
        for(int i=0;i<=ene;i++){
            //System.out.println(factorial(i));
            a = factorial(i);
            sum += a ;
        }
        System.out.print("La suma de los factoriales 0 hasta N es: " + sum);
        sc.close();
    }
    //método para encontrar el factorial de un número
    public static int factorial(int num){
        int fact = 1;
        for(int i= 1; i<=num;i++){
            fact = fact*i;
        }

        return fact;
    }
}