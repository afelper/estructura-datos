package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean s = true;
        
        do{
        System.out.print("Introduza número entero: ");
        int n = sc.nextInt();

        boolean p = Primo(n);

        if(p==false)
            System.out.println("No es primo");
        else 
            System.out.println("Es primo");

        System.out.print("Introducir otro número (S/N): ");
        char cons = sc.next().charAt(0); 
        if(cons=='S' | cons=='s')
            s=true;
        else
            s=false;
        }while(s);

        sc.close();
    }

    public static boolean Primo(int num){
        boolean prim = true;
        int i=2;

        if(num<2){
            prim=false;
        }

        while(i<num & prim==true){
            if(num%i==0){
                prim=false;
            }
            i++;
        }

        return (prim);
    }
}
