package herencia.ejemplos;

//Subclase SmartPhone
public class SmartPhone extends Dispositivo{

    private String Inteligente;
    private String Protector;
    private String Tipo = "SmartPhone";


    public SmartPhone(String Marca, double Peso, String Color, String Maleta, int MemRam,
    String Procesador, int MemAux, String Inteligente, String Protector)
    {
        super(Marca, Peso,Color, Maleta, MemRam, Procesador, MemAux);
        this.Inteligente = Inteligente;
        this.Protector = Protector;
    }

    public String getMarca()
    {
        return "\nSmartPhone Marca " + Marca;
    }

    //método abstracto que proviene de la clase abstracta Aparato y cuyo contenido es completamente
    //diferente en cada clase donde se incluye.
    public String Descripcion()
    {
        return "Un Smartphone es un aparato celular con aplicaciones y utilidades de uso frecuente";
    }
    
}
