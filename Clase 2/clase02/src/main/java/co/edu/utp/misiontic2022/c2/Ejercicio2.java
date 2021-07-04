package co.edu.utp.misiontic2022.c2;

//Autor:Adrian F Perez Mesa
//Grupo: 40
//Profesor: Luis Guillermo Morelo
//Universidad: UTP

/*Programa que calcula el precio de venta de un producto, conociendo: 
  - El precio por unidad (sin IVA) del producto.
  - El número de productos vendidos.
  - El IVA aplicado. 
  
  Los datos anteriores, se leerán por teclado. 
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      double precioUnidad, cantidad, total; //, precioSinIva, totalIva
      // var IVA = 0.19;

      System.out.print("Por favor, introduzca el precio del producto: ");
      precioUnidad = sc.nextDouble();
      System.out.print("Por favor, introduzca la cantidad del productos: ");
      cantidad = sc.nextDouble();

      total = (precioUnidad * cantidad)*1.19;
      // precioSinIva = precioUnidad * cantidad;
      // totalIva = precioSinIva * iva / 100;
      // total = precioSinIva + totalIva;
      System.out.println("Precio de venta -> " + total);
      sc.close();
    }
}