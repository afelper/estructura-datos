package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

/* Programa que muestre en líneas separadas lo siguiente:
ZYWXVUTSRQPONMLKJIHGFEDCBA
YWXVUTSRQPONMLKJIHGFEDCBA
WXVUTSRQPONMLKJIHGFEDCBA
DCBA
CBA
BA
A */

public class Ejercicio16 {

    public static void main(String[] args){

        for(char x='Z'; x>='A';x--){ //imprime todas las letras del abecedario
           for(char y=x;y>='A';y--){ // eliminar última letra
               System.out.print(y);
           }
            System.out.print("\n"); //salto de línea
        }
    }
    
}
