package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Programa que pase de pesos a dólares y viceversa.

import java.util.Scanner; 

public class Ejercicio13 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca pesos Colombianos: ");
        float pesosC = sc.nextFloat();
        System.out.println("Introduzca Dólares Estadounidense: ");
        float dolarE = sc.nextFloat();
      
        String salida = pesosDolar(pesosC);
        String salida2 = dolarPesos(dolarE);
        System.out.println(salida);
        System.out.println(salida2);
        sc.close();
    }

    public static String pesosDolar(float p){
        float pD = 0;
        float dolarOne= (float)0.00027;
        
        pD = Math.round(p * dolarOne); 

        return "Dólar estadounidense: " + pD;
    }

    public static String dolarPesos(float p){
        float dP = 0;
        float pesOne= (float)3778;
        
        dP = Math.round(p * pesOne); 

        return "Pesos Colombianos: " + dP;
    }
    
    
}
