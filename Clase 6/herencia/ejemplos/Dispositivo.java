package herencia.ejemplos;

//Subclase Dispositivo
public class Dispositivo extends Aparato 
{

    //atributos
    private String Color;
    private String Maleta;
    private int MemRam;
    private String Procesador;
    private int MemAux;

    //método constructor
    public Dispositivo(String Marca, double Peso, String Color, String Maleta,
     int MemRam, String Procesador, int MemAux)
    {
        super(Marca, Peso); //constructor de la super clase Aparato
        this.Color = Color;
        this.Maleta = Maleta;
        this.MemRam = MemRam;
        this.Procesador = Procesador;
        this.MemAux = MemAux;
    }

    // retornar la marca del dispositivo
    public String getMarca()
    {
        return "\nDispositivo Marca " + Marca; 
    }

    //Corresponde al método abstracto de la clase abstracta Aparato.
    public String Descripcion()
    {
        return "Un Dispositivo es un aparato eléctrico o electrónico que facilita la vida de las personas";
    }
    
}
