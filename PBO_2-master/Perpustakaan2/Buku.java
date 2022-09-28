/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan2;

/**
 *
 * @author Rafael Mahesa
 */
public class Buku extends Koleksi {
    protected String ISBN;
    protected int halaman;
    
    public Buku(){
    }
    public Buku(String judul, String penerbit, String tahunTerbit, String ISBN){
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahunTerbit=tahunTerbit;
        this.ISBN=ISBN;
    }
}
