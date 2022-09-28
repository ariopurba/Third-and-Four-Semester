/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

/**
 *
 * @author old
 */
public class Perusahaan {
    private String namaPerusahaan;
    private String alamat;
    private String pemilik;
    private String NPWP;
    private Pegawai [] daftarPegawai;

    public Perusahaan() {
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
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

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }

    public void setDaftarPegawai(Pegawai[] daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }
    
    
}
