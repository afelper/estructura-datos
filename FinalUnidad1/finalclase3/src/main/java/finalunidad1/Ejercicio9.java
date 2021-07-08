package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más */

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza nombre: ");
        String n = sc.nextLine();
        System.out.print("Introduza edad: ");
        int e = sc.nextInt();
        System.out.print("Introduza salario: ");
        int s = sc.nextInt();
        
        Salario(n, e, s);
        

        sc.close();

    }

    public static void Salario(String nom, int ed, int sala){

        double salary=0;
        //Math.round(salary*100.0)/100.0 -> redondear decimales
        if(ed >= 19 & ed <= 50)
        {
            salary = sala * 1.05; 
            System.out.println("Nombre: " + nom + "Salario(5%):  " + Math.round(salary*100.0)/100.0);
        }
        else if(ed >= 51 & ed <= 60){
            salary = sala * 1.1; 
            System.out.println("Nombre: " + nom + "Salario(10%):  " + Math.round(salary*100.0)/100.0);
        }
        else if(ed > 60){
            salary = sala * 1.15; 
            System.out.println("Nombre: " + nom + "Salario(15%):  " + Math.round(salary*100.0)/100.0);
        }
        else if(ed <= 16){
            System.out.println("Nombre: " + nom + "No tiene edad para trabajar ");
        }
        else 
            System.out.println("No hay datos");
    }
    
}
