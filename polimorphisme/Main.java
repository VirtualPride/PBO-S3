/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorphisme;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item teko = new Item();
        Senjata pedang = new Senjata();
        Senjata tombak = new Senjata("Tombak", "Senjata 2 tangan");
        Senjata Gada = new Senjata("Gada", "Senjata 1 tangan",3);
        
        teko.Info();
        pedang.Info();
        tombak.Info();
        Gada.Info();
    }
    
}
