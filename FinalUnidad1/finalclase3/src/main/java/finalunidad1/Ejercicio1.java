package finalunidad1;
/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.
 */

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main( String[] args )
    {   
        String s = "Suma";
        String r = "Resta";
        String d = "División";
        String m = "Multiplicación";

        Scanner sc = new Scanner(System.in);

        System.out.print( "Ingrese primer número: " );
        float n1 = sc.nextFloat();
        System.out.print( "Ingrese segundo número: " );
        float n2 = sc.nextFloat();

        System.out.println("La "+s+" de "+ n1 +" y "+ n2 +" es igual a "+ Suma(n1,n2));
        System.out.println("La "+r+" de "+ n1 +" y "+ n2 +" es igual a "+ Resta(n1,n2));
        System.out.println("La "+d+" de "+ n1 +" y "+ n2 +" es igual a "+ Division(n1,n2));
        System.out.println("La "+m+" de "+ n1 +" y "+ n2 +" es igual a "+ Multiplicacion(n1,n2));
        sc.close();
    }
    public static float Suma(float n1, float n2){
        float sum=0;
        sum = n1 + n2;
        return sum;
    }
    
    public static float Resta(float n1, float n2){
        float res=0;
        res = n1 - n2;
        return res;
    }
    
    public static float Division(float n1, float n2){
        float div;

        div = n1 / n2;
       
        return div;
    }
      
    public static float Multiplicacion(float n1, float n2){
        float mul;
    
        mul = n1 * n2;
        return mul;
    
    }
}
