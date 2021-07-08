package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
       
        System.out.print("Sexo del usuario (H/M): ");
        char b = sc.next().charAt(0);
        
        System.out.print("Altura del usuario (cm): ");
        int a = sc.nextInt();
        
        String resul= pesoIdeal(b, a); //llamando al método public static
        System.out.println(resul); // imprimir retorno del método



        sc.close();
    }

    public static String pesoIdeal(char a, int b){
        int ph=0;
        if(a=='H' | a=='h'){
            ph = b - 110;
            return "Peso ideal hombres: " + String.valueOf(ph) ;
        }
        else if(a=='M' | a=='m'){
            ph = b - 120;
            return "Peso ideal mujeres: " + String.valueOf(ph) ;
        }
        else 
            return "Inválido";
    }
    
}
