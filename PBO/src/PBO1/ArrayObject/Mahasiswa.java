/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

/**
 *
 * @author old
 */
public class Mahasiswa {

    private String nama;
    private double uts1, uts2, uas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, double uts1, double uts2, double uas) {
        this.nama = nama;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double nilaiFinal() {
        double nFinn = (uts1 + uts2 + uas) / 3;

        if (nFinn >= 80) {
            System.out.println("A");
        } else if (nFinn <= 79) {
            System.out.println("B");
        } else if (nFinn <= 59) {
            System.out.println("C");
        } else if (nFinn <= 49) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        return nFinn;
    }
    
}
