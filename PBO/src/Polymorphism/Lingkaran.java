/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author old
 */
public class Lingkaran extends BangunDatar{
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    float keliling() {
        return (float)(2 *Math.PI  * r); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    float luas() {
        return (float)(Math.PI * r * r); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
