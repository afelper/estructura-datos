package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

//Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E.

public class Ejercicio17 {
    public static void main(String[] args){

        for(int c=0;c<=9;c++){
            for(int c1=0;c1<=9;c1++){
                for(int c2=0;c2<=9;c2++){
                    for(int c3=0;c3<=9;c3++){
                        for(int c4=0;c4<=9;c4++){
                           System.out.print(c!=3?c:"E");   //primer dígito
                           System.out.print(c1!=3?c1:"E"); //Segundo dígito
                           System.out.print(c2!=3?c2:"E"); //Tercero dígito
                           System.out.print(c3!=3?c3:"E"); //Cuarto dígito
                           System.out.println(c4!=3?c4:"E"); //Cinco dígito
                        }
                    }
                }
            }
        }
    }
}
