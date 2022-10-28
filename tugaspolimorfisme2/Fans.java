/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspolimorfisme2;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class Fans {

    private String name;

    public Fans() {
        name = "NoName";
    }

    public Fans(String _name) {
        name = _name;
    }

    public void showName() {
        System.out.print(name);
    }

    public void watchingPerformance() {
        System.out.print("\n" + name + "\t: melihat idolanya dari youtube");
    }

    public void watchingPerformance(Musician _musician) {
        System.out.print("\n" + name + "\t: melihat idolanya");
        _musician.perform();
    }
}
