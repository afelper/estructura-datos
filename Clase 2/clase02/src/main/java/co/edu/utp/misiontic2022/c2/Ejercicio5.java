package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa 
//según el teorema de Pitágoras
import java.util.Scanner; 

public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cateto a: ");
        float catetoA = sc.nextFloat();
        System.out.println("Introduzca cateto b: ");
        float catetoB = sc.nextFloat();
        
        String salida = hipoTenusa(catetoA, catetoB);
        System.out.println(salida);
        sc.close();
    }

    public static String hipoTenusa(double cA, double cB){
        double h;
        //fórmula de la hipotenusa
        h = Math.sqrt(Math.pow(cA,2) +  Math.pow(cB,2));
        String ha = Double.toString(h);
        return ha;
    }
}
