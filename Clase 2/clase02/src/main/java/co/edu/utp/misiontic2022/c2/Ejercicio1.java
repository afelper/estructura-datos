package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

/* Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) y calcule su número de la
El número de la suerte se calcula sumando el día, mes y año de la fechade nacimiento y a continuación sumando las 
cifras obtenidas en la suma.
Por ejemplo: Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =28
Número de la suerte: 28 */

import java.util.*;

public class Ejercicio1 {

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fecha de nacimiento dia/mes/años: ");
        String Fnacimiento = sc.nextLine();

        int digitos = suerte(Fnacimiento);
        System.out.println("Número de la suerte: " + digitos);   
        sc.close(); 
    }

    
    public static int  suerte(String Fnacimiento){

        String[] nSuerte = Fnacimiento.split("/");
        String item1 = nSuerte[0];  //dia
        String item2 = nSuerte[1];  //mes
        String item3 = nSuerte[2];  //año
        int suerte = 0;
        int mill, cen, dec, uni, res, res2;
        int numSuerte = 0;

        int itemUno = Integer.parseInt(item1);  // string a entero
        int itemDos = Integer.parseInt(item2); 
        int itemTres = Integer.parseInt(item3); 

        
        suerte = itemUno + itemDos + itemTres;

        mill = suerte/1000; //millar
        res = suerte -(mill*1000); 
        cen = res/100;  //centena
        res2 = res - (cen*100); 
        dec = res2/10;  //decena
        uni = res2 - (dec*10); // unidad
        numSuerte = mill  + cen + dec + uni; // resultadi
        return numSuerte;

    }
   
}
