/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.Object;

/**
 *
 * @author old
 */
public class ProgramStudi {
    private int kode_prodi;
    private String nama_prodi;
    public Pegawai ketua_prodi;

    public ProgramStudi(int kode_prodi, String nama_prodi, Pegawai ketua_prodi) {
        this.kode_prodi = kode_prodi;
        this.nama_prodi = nama_prodi;
        this.ketua_prodi = ketua_prodi;
    }

    public ProgramStudi() {
    }

    public int getKode_prodi() {
        return kode_prodi;
    }

    public void setKode_prodi(int kode_prodi) {
        this.kode_prodi = kode_prodi;
    }

    public String getNama_prodi() {
        return nama_prodi;
    }

    public void setNama_prodi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
    }

    public Pegawai getKetua_prodi() {
        return ketua_prodi;
    }

    public void setKetua_prodi(Pegawai ketua_prodi) {
        this.ketua_prodi = ketua_prodi;
    }

    @Override
    public String toString() {
        return "ProgramStudi{" + "kode_prodi=" + kode_prodi + ", nama_prodi=" + nama_prodi + ", ketua_prodi=" + ketua_prodi + '}';
    }
    
    
}
