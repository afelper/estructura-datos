package co.edu.utp.misiontic2022.c2;

public class Casilla {

    private String color;
    private Integer columna;
    private Integer fila;

    private Ficha ficha; //asociación bidireccional

    Color colorUno = Color.BLANCO; //dependencia -instancia
    Color colorDos = Color.NEGRO; //dependencia

    public Boolean ocupada(){
        return true;
    }

}
