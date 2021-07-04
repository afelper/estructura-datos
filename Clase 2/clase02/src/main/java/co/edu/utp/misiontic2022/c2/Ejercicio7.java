package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que lea un carácter por teclado y compruebe si es una letra mayúscula

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un carácter: ");
        char cA = sc.next().charAt(0); // capturar un carácter

        String salida = caracterMayus(cA);
        System.out.println(salida);
        sc.close();
    }

    public static String caracterMayus(char x){
       
    char  m = Character.toUpperCase(x); // Carácter a mayúscula
      
      return x == m ? "Es una letra mayúscula" : "Es una letra minúscula";
    }
}
