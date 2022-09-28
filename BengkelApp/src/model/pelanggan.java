/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author old
 */
public class pelanggan {
    public int kode_pelanggan;
    public String nama_pelanggan;
    public String alamat;
    public String no_tlp;

    public pelanggan() {
    }

    public pelanggan(int kode_pelanggan, String nama_pelanggan, String alamat, String no_tlp) {
        this.kode_pelanggan = kode_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
    }

    public int getKode_pelanggan() {
        return kode_pelanggan;
    }

    public void setKode_pelanggan(int kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }
    
    
}
