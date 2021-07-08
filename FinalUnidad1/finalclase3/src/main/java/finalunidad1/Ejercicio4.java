package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        System.out.print( "Ingrese el número de la tabla de multiplicar: " );
        int n1 = sc.nextInt();
        
        tablaMult(n1);

        sc.close();

    }

    public static void tablaMult(int n){

        System.out.println("La tabla de multiplicar de " + n + " : ");
        for(int i=0;i<=10;i++){
            System.out.println(i + " x " + n + " = " + i*n);
        }
    }
}
