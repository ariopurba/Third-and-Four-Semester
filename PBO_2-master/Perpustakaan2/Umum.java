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
public class Umum extends Peminjam {
    protected String nik;
    
    public Umum(){
        
    }
    public Umum(String nama, String alamat, String nik){
        this.nama=nama;
        this.alamat=alamat;
        this.nik=nik;
    }
}
