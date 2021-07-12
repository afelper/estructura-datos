package herencia.ejemplos;

//subclase electrodoméstico
public class Electrodomestico extends Aparato
{

    //Variable propia, sirve para determinar a qué tipo de electrodoméstico se está refiriendo ya que son muchos.
    String Tipo;

    public Electrodomestico(String Marca, double Peso, String Tipo) {
        super(Marca, Peso); //Constructor de la Superclase Aparato
        this.Tipo = Tipo;
    }

    public String Descripcion()
    {
        return "Un Electrodoméstico es un aparato que facilita labores en el hogar";
    }

    
    
}
