/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.Object;

/**
 *
 * @author old
 */
public class Pegawai {
    private String nip;
    public String nama;
    private String email;
    private String gelar;

    public Pegawai(String nip, String nama, String email, String gelar) {
        this.nip = nip;
        this.nama = nama;
        this.email = email;
        this.gelar = gelar;
    }

    public Pegawai() {
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
    
    
}
