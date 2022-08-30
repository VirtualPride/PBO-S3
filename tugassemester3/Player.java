/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassemester3;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class Player {

    private int direction, id, strength;

    public Player() {

    }

    public Player(int id, int direction) {
        this.id = id;
        this.direction = direction;
    }

    public void AddStrength(int str) {
        this.strength = str;
    }

    public void InfoPlayer() {
        System.out.print("ID: " + this.id);
        System.out.println(" Direction: " + this.direction);
    }
}
