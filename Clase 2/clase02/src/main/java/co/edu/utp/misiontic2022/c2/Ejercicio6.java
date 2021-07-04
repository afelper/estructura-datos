package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que lea un número entero y muestre si el número es múltiplo de 10
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número entero: ");
        N = sc.nextInt();
        String salida = Entero(N);
        System.out.println(salida);
        sc.close();

    }

    public static String Entero(int n){
        return n%10==0 ? "Es múltiplo de 10" : "No es múltiplo de 10";
    }
}

