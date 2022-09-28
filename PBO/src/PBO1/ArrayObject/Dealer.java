/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

/**
 *
 * @author old
 */
public class Dealer {
    private String namaDealer;
    private String alamat;
    private String pemilik;
    private Mobil[] daftarMobil;

    public Dealer() {
    }

    public Dealer(String namaDealer, String alamat, String pemilik, Mobil[] daftarMobil) {
        this.namaDealer = namaDealer;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.daftarMobil = daftarMobil;
    }

    public String getNamaDealer() {
        return namaDealer;
    }

    public void setNamaDealer(String namaDealer) {
        this.namaDealer = namaDealer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public Mobil[] getDaftarMobil() {
        return daftarMobil;
    }

    public void setDaftarMobil(Mobil[] daftarMobil) {
        this.daftarMobil = daftarMobil;
    }
    
    
}
