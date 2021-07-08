package finalunidad1;

/*  
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
 */

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       
        System.out.print( "Ingrese las horas trabajadas en un mes: " );
        float n1 = sc.nextFloat();
        

        float result = HorasSueldo(n1);
       
        System.out.println("Sueldo trabajador: " + result );
        sc.close();


    }

    public static float HorasSueldo(float h){
        
        final int HORAS_PRECIO = 30000; //constante
        
        float sueldo = h * HORAS_PRECIO;

        return sueldo;
    }
}
