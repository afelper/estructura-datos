import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("Introduzca un núemro entero: ");
        var numero = sc.nextInt();

        var resultado = parImpar(numero);
        System.out.println(resultado);
    }

    public static String parImpar(int numero){
        
        return numero%2==0 ? "Es Par": "Es impar"; 

    }
    
}
