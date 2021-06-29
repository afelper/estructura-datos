import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Cantidad de grados centígrados: ");
        var numero = sc.nextInt();

        var fahrenheit = conversionCentigradosFahrenheit(numero);
        System.out.println("Grados Fahrenheit: " + fahrenheit);
    }

    public static float conversionCentigradosFahrenheit(int numero){
        var f=0;

        f = 32 + (9 * numero / 5);

       return f;
    }
    
}

