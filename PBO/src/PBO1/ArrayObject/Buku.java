/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

/**
 *
 * @author old
 */
public class Buku {

    private int kodeBuku;
    private String judulBuku;
    private Pengarang[] daftarPengarang;
    private int tahunTerbit;

    public Buku() {
    }

    public Buku(int kodeBuku, String judulBuku, Pengarang[] daftarPengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.daftarPengarang = daftarPengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public int getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(int kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }

    public void setDaftarPengarang(Pengarang[] daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

}
