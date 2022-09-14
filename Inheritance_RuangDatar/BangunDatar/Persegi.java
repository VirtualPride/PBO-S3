/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class Persegi extends BangunDatar {
  private float s;

  public Persegi(float _s) {
    this.s = _s;
  }

  public void hitungLuas() {
    this.luas = s * s;
  }

  public void hitungKeliling() {
    this.keliling = 4 * s;
  }
}

