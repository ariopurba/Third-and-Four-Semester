/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author old
 */
public class SparePart {
    private int idSparepart;
    private int jumlah;
    private String namaSparePart;
    private int biaya_sparepart;

    public SparePart() {
    }

    public SparePart(int idSparepart, int jumlah, String namaSparePart, int biaya_sparepart) {
        this.idSparepart = idSparepart;
        this.jumlah = jumlah;
        this.namaSparePart = namaSparePart;
        this.biaya_sparepart = biaya_sparepart;
    }

    public int getIdSparepart() {
        return idSparepart;
    }

    public void setIdSparepart(int idSparepart) {
        this.idSparepart = idSparepart;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNamaSparePart() {
        return namaSparePart;
    }

    public void setNamaSparePart(String namaSparePart) {
        this.namaSparePart = namaSparePart;
    }

    public int getBiaya_sparepart() {
        return biaya_sparepart;
    }

    public void setBiaya_sparepart(int biaya_sparepart) {
        this.biaya_sparepart = biaya_sparepart;
    }
    
    
}
