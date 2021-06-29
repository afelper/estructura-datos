public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        var nombre = "Cesar Díaz"; //variable String

        var resultado = saludo(nombre);  //método static

        System.out.println(resultado); // imprimir resultado
    }

    // método static con salida String
    public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}
