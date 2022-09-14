/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RIDHO WAHYU AKMAL
 */
public class PersegiPanjang extends BangunDatar{
     private float p;
  private float l;

  public PersegiPanjang(float _p, float _l) {
    this.p = _p;
    this.l = _l;
  }

  public void hitungLuas() {
    this.luas = p * l;
  }

  public void hitungKeliling() {
    this.keliling = 2 * (p + l);
  }
}
