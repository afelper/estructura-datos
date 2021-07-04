package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que pase una velocidad en Km/h a m/s La velocidad se lee por teclado

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args){
        float velocidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca velocidad en Km/h: ");
        velocidad = sc.nextFloat();
        String salida = KmaM(velocidad);
        System.out.println(salida);
        sc.close();

    }

    public static String KmaM(float velocidad){
        return velocidad + " Km/h -> " + velocidad * 1000/3600 +" m/s";
    }
}
