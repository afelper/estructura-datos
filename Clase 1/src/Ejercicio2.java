import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);  //Se crea un objeto sc de la clase Scanner

        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt(); // Se captura el numero desde el teclado

        var digitos = numeroDigitos(numero); // llamado del método static con un parámetro
        System.out.println("El número tiene " + digitos + " cifras"); //imprimir en pantalla
    }

    public static int numeroDigitos(int numero){
        var cifras = 0;  // inicialización de la variable

        while(numero != 0) {
            numero /= 10; // numero = numero / 10 
            cifras++; // acumulador de las cifras
        }
        return cifras;  // retornar el valor final de los digitos
    }
    
}
