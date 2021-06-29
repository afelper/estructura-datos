public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        var nombre = "Cesar Díaz";

        var resultado = saludo(nombre);

        System.out.println(resultado);
    }

    public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}
