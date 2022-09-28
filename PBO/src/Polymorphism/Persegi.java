/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author old
 */
public class Persegi extends BangunDatar {
    int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    float luas() {
        System.out.println("Luas");
        return this.sisi * this.sisi; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    float keliling() {
        System.out.println("Keliling");
        return this.sisi * 4; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  
}
