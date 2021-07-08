package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print( "Ingrese nombre del estudiante: " );
        String s1 = sc.nextLine();
        System.out.print( "Ingrese la primera nota: " );
        float n1 = sc.nextFloat();
        System.out.print( "Ingrese la segunda nota: " );
        float n2 = sc.nextFloat();
        System.out.print( "Ingrese la tercera nota: " );
        float n3 = sc.nextFloat();

        float result = Promedio(n1, n2, n3);
        String es = Nota(result);

        System.out.println("Alumno(a): "+ s1 +" promedio: "+ result + " estado: " + es);
        sc.close();


    }

    public static float Promedio(float a, float b, float c){
        float prom = 0;

        prom = (a+b+c)/3;

        return prom;
    }

    public static String Nota(float p){
        
        if(p >= 3 & p <= 5){
            return "Aprobado";
        }
        else if (p < 3 & p >= 0){
            return "Reprobado";
        }
        else {
            return "No válido";
        }
    }
        
    
}
