//Realice un programa quew solicite por teclado al menos 5 atributos de un cliente y lo imnprima por consola.
import java.util.Scanner;

public class ProbarPersona {
    public static void main(String[] args) throws Exception {
       
        Persona a = new Persona();
        a.setNombre("Nombre: ");
        a.setApellido("Apellido: ");
        a.setEdad("Edad: ");
        a.setSexo("Sexo: 'H' ó 'M': ");
        a.mostrar();
        // Ahora vamos a mostrar por pantalla la información
        // para asegurarnos que todo se ha almacenado correctamente
        // System.out.println("Nombre: " + a.getNombre() + " " + a.getApellido());
        // System.out.println("Edad: " + a.getEdad());
        // System.out.println("Sexo: " + a.getSexo());
    }

    public static class Persona{
        
        Scanner sc = new Scanner(System.in);

        private String nombre, apellido;
        private int edad;
        private char sexo;

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String txt){
            System.out.print(txt); //imprimir texto del main.
            nombre = sc.nextLine();
        }

        public String getApellido(){
            return apellido;
        }

        public void setApellido(String txt){
            System.out.print(txt);
            apellido = sc.nextLine();
        }

        public int getEdad(){
            return edad;
        }

        public void setEdad(String txt){
            System.out.print(txt);
            edad = sc.nextInt();
        }

        public String getSexo(){
            String s = " ";
            if(sexo=='H') s="Hombre";
            if(sexo=='M') s="Mujer";
            if(sexo!='H' & sexo!='M') s="Desconocido";
            return s;
        }

        public void setSexo(String txt){
            System.out.print(txt);
            sexo = sc.next().charAt(0);
        }

        public void mostrar(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Sexo: " + getSexo());
        }
    }
}
