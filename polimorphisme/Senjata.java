/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphisme;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class Senjata extends Item {

    public Senjata() {
        this.slot = "Senjata";
        this.Tipe = "Senjata";
    }

    public Senjata(String ntipe, String nslot) {
        this.Tipe = ntipe;
        this.slot = nslot;
    }

    public Senjata(String ntipe, String nslot, int nbobot) {
        this.Tipe = ntipe;
        this.slot = nslot;
        this.bobot = nbobot;
    }

    @Override
    public void Info() {
        System.out.println("\nTipe: " + this.Tipe);
        System.out.println("Slot: " + this.slot);
        System.out.println("Bobot: " + this.bobot);
    }

}
