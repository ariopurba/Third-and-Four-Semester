/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author old
 */
public class BangundatarApp {
    public static void main(String[] args) {
        BangunDatar bgn = new BangunDatar();
        
        Persegi persegi = new Persegi(4);
        Segitiga segit = new Segitiga(3, 2);
        Lingkaran ling = new Lingkaran(7);
        
        bgn.luas();
        bgn.keliling();
        
        System.out.println(persegi.luas());
        System.out.println(persegi.keliling());
    }
}
