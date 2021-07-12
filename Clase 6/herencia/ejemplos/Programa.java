package herencia.ejemplos;

import javax.swing.JOptionPane;

/* mostramos, por consola, los datos que retorna el método
getMarca( ) de cada objeto declarado y la información que se retorna
cuando se invoca el método Descripcion( ) que es el método abstracto de
la clase abstracta Aparato que es obligatorio y que, para cada tipo de
objeto, tiene un contenido diferente.
 */
public class Programa {

    public static void main(String[] args){

        SmartPhone DS = new SmartPhone("Nokia", 100, "Blanco", "Si", 200000, "T6", 600000, "Si", "No");
        Dispositivo DD = new Dispositivo("Compaq", 200, "Amarillo", "No", 300000, "T2", 600000);
        Electrodomestico DE = new Electrodomestico("General Electric", 1500.0, "Licuadora");

        System.out.println(DS.getMarca() + ". " + DS.Descripcion());
        System.out.println(DD.getMarca() + ". " + DD.Descripcion());
        System.out.println(DE.getMarca() + ". " + DE.Descripcion());

        // JOptionPane.showMessageDialog(null, DS.getMarca() + ". " + DS.Descripcion());
        
    }
    
}
