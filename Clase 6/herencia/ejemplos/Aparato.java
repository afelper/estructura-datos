package herencia.ejemplos;

//Clase abstracta aparato
public  abstract class Aparato 
{
    public String Marca;
    public double Peso;
    
    //método constructor de la clase Aparato
    public Aparato(String Marca, double Peso)
    {
        this.Marca = Marca;
        this.Peso = Peso;
    }

    //Función tipo getter que retorne la marca que recibió
    public String getMarca()
    {
        return "\nMarca= "+ Marca;
    }

    //Declaramos el método abstracto
    public abstract String Descripcion();

}
