package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Realizar programa que muestre los números del 1 al 100 que no sean múltiplos de 3 utilizando cada una las instrucciones
//repetitivas (while do while for)


public class Ejercicio12 {

    public static void main(String[] args){
        int n;

        //Solución Uno;
        //Aquí comienza el ciclo while
        System.out.println("-----Ciclo While-----");
        n=1;
        while(n<=100){
            if(n%3!=0){
                System.out.println("Números 1 a 100: " + n);
            }
        n++; 
       }

       //Solución Dos;
       //Aquí comienza el ciclo do while
       System.out.println("-----Ciclo do while-----");
       n = 1;
       do{
        if(n%3!=0){
           System.out.println("Números 1 a 100: " + n);
        }
         n++; 
        }
       while(n<=100);

       //Solución Tres;
       //Aquí comienza el ciclo for
       System.out.println("-----Ciclo for-----");
       for(n=1; n<=100;n++){
            if(n%3!=0){
            System.out.println("Números 1 a 100: " + n);
         }
       }


    }
}
