package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y
//comprueba si la hora que indican es una hora válida

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la Hora:  ");
        int hUno = sc.nextInt();
        System.out.println("Introduzca los Minutos:  ");
        int mDos = sc.nextInt();
        System.out.println("Introduzca los Segundos:  ");
        int stres = sc.nextInt();

        String salida = laHora(hUno, mDos, stres );
        System.out.println(salida);
        sc.close();
    }

    public static String laHora(int h, int m, int s){

        return h>=0 & h<24 & m>=0 & m<60 & s>=0 & s<60 ? "Hora correcta" : "Hora Incorrecta";
    }
}
