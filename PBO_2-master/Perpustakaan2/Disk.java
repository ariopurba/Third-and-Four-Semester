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
public class Disk extends Koleksi{
    protected String format, ISBN;
    public Disk(){
    }
    public Disk(String judul, String penerbit, String tahunTerbit, String ISBN){
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahunTerbit=tahunTerbit;
        this.ISBN=ISBN;
    }
}
