import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();

        var digitos = numeroDigitos(numero);
        System.out.println(digitos);
    }

    public static String numeroDigitos(int numero){
        var doble = 0;
        var triple = 0;

        doble = 2 * numero;
        triple = 3 * numero;

        String dos = String.valueOf(doble);
        String tres = String.valueOf(triple);


        return "El doble es: " + dos + "\n" + "El triple es: " + tres;
        
    }
    
}