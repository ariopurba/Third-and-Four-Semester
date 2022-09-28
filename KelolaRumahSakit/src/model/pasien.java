/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author old
 */
public class pasien implements Comparable<Object> {

    private String nama, alamat, jenis_kelamin, penyakit, id;
    private int umur, no_hp, no_kamar;

    public pasien() {
    }

    public pasien(String nama, String alamat, String jenis_kelamin, String penyakit, String id, int umur, int no_hp) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
        this.penyakit = penyakit;
        this.id = id;
        this.umur = umur;
        this.no_hp = no_hp;
    }

    public pasien(String nama, String jenis_kelamin, String penyakit, String id, int no_kamar) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.penyakit = penyakit;
        this.id = id;
        this.no_kamar = no_kamar;
    }

    public pasien(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public int getNo_kamar() {
        return no_kamar;
    }

    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }

    @Override
    public String toString() {
        return "" + nama + "\t\t" + jenis_kelamin + "\t\t" + penyakit + "\t\t" + id + "\t\t" + no_kamar;
    }

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((pasien) o).getId());
    }

}
