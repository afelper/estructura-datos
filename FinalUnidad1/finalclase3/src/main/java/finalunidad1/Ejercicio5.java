package finalunidad1;

/*
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int a = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
        int b; // Número introducido por el usuario.
        boolean c = true;
        
        
       
        System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");
       
        
        do{
            System.out.print("Escribe un número entre 1 y 100: ");
            b = sc.nextInt();
            if(a==b){
                System.out.println("*-----Excelente!!! has Ganado XD!!-----*");
                c = false;
            }
            else if(a<b){
                System.out.println("El número que busca es menor!");
            }
            else if(a>b){
                System.out.println("El número que busca es mayor!");
            }
        }while(c);

        sc.close();
    
    }
    
}
