import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args){
        var sc = new Scanner(System.in); // Crear objeto sc de la clase Scanner

        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt(); // Capturar datos desde el teclado

        var digitos = numeroDigitos(numero); // llamar al método numeroDigitos y lo guarda en la variable digitos 
        System.out.println("------------------------------------------------");
        System.out.println(digitos); // imprimir en pantalla el resultado
        sc.close();
    }

    public static String numeroDigitos(int numero){
        var doble = 0; // inicialización de la variable doble
        var triple = 0;  // inicializacion de la variable triple

        doble = 2 * numero; // Se obtiene el doble de numero
        triple = 3 * numero; // se obtiene el triple de numero
 
        String dos = String.valueOf(doble); // convertir de entero a cadena de carácteres
        String tres = String.valueOf(triple);


        return " El doble es: " + dos + " y" + " El triple es: " + tres;  // retornar una cadena de carácteres
        
    }
    
}