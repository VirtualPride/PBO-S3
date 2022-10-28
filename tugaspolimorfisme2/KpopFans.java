/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspolimorfisme2;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class KpopFans extends Fans {

    public KpopFans() {
    }

    public KpopFans(String _name) {
        super(_name);
    }

    public void watchingPerformance(Musician _musician, String _expression) {
        System.out.print("\n");
        showName();
        System.out.println("\t: " +  _expression+" melihat idolanya" );
        _musician.perform();
    }
}
