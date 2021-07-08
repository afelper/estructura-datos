package finalunidad1;

/* 
Autor: Adrian Perez
Grupo: 40
Profesor: Luis Morelo 

Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar. */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String args[])
   {
      System.out.println("Juego piedra-papel-tijera");
      Scanner teclado = new Scanner(System.in);
      
      boolean s = true;

      do{
      int seleccionCompu = (int)(Math.random() * 3) + 1;
      System.out.println("La computadora ya escogio...");
      
      System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
      int seleccionUsuario = teclado.nextInt();
 
      System.out.print("La computadora habia escogido: ");
      switch ( seleccionCompu )
      {
         case 1:
            System.out.println("Piedra");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("Usted gana!"); break;
               case 3: System.out.println("La computadora gana!"); break;
            }
            break;
 
         case 2:
            System.out.println("Papel");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("La computadora gana!"); break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("Usted gana!"); break;
            }
            break;
 
         case 3:
            System.out.println("Tijera");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Usted gana!"); break;
               case 2: System.out.println("La computadora gana!"); break;
               case 3: System.out.println("Empate!"); break;
            }
            break;
      }
      System.out.print("Volver a jugar (S/N): ");
        char cons = teclado.next().charAt(0); 
        if(cons=='S' | cons=='s')
            s=true;
        else
            s=false;
      }while(s);
      teclado.close();
   }
    
}
