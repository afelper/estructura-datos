package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP
//El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un entero[1]:  ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca un entero[2]:  ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca un entero[3]:  ");
        int num3 = sc.nextInt();

        String salida = elMayor(num1, num2, num3);
        System.out.println(salida);
        sc.close();

    }

    public static String elMayor(int a, int b, int c){

      if(a>b){
          if(a>c){
            return  "El mayor es: " + a;
          }else{
            return "El mayor es: " + c;
          }
      }else if(b>c){
        return "El mayor es: " + b;
      }else{
        return "El mayor es: " + c;
      }
        
    }
}
