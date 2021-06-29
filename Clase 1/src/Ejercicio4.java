import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Cantidad de grados centígrados: ");
        var numero = sc.nextInt(); // Captura la temperatura desde el teclado

        // LLamar el método para convertir celsius a fahrenheit
        var fahrenheit = conversionCentigradosFahrenheit(numero); // almacenar el retorno del método a la var fahrenheit
        System.out.println("La conversión es: " + fahrenheit + " Grados Fahrenheit"); //imprimir en pantalla
    }

    //método público y estático de la conversión de grados C a F.
    public static int conversionCentigradosFahrenheit(int numero){
        var f=0; // inicializar variable

        //Paréntesis -> aislar una porción de la expresión de forma que el cálculo se ejecute de forma independiente
        f = 32 + ((9 * numero) / 5); // formula de conversión + Precedencia

       return f;
    }
    
}

