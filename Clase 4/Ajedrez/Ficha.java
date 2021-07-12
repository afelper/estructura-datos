package co.edu.utp.misiontic2022.c2;

public abstract class Ficha {
    
    private String color;
    private Casilla casilla; //asociación bidireccional

    public abstract Boolean comer(); //volver abstracta el método comer
    
    Color colorUno = Color.BLANCO; //dependencia
    Color colorDos = Color.NEGRO; //dependencia

    public Boolean mover(){
        return true;
    }
}
