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
public class Majalah extends Koleksi {
    protected String ISSN;
    protected int volume, seri;
    
    public Majalah(){
    }
    public Majalah(String judul, String penerbit, String tahunTerbit, String ISSN){
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahunTerbit=tahunTerbit;
        this.ISSN=ISSN;
    }
}
