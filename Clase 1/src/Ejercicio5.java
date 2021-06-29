import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Introduzca un núemro entero: ");
        var numero = sc.nextInt(); //Capturar el numero entero para conocer si es par o impar

        var resultado = parImpar(numero); // llamar al método parImpar con el parámetro numero
        System.out.println(resultado); // imprimir en pantalla el valor retornado del método parImpar
    }

    public static String parImpar(int numero){
        
        // Operador ternario ?:
        //resultado = (condicion)?valor1:valor2;
        return  numero%2==0 ? numero + " Es Par": numero + " Es impar"; 

    }
    
}
