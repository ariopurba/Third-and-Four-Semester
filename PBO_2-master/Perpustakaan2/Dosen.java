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
public class Dosen extends Peminjam {
    protected String nip;
    
    public Dosen(){
        
    }
    public Dosen(String nama, String alamat, String nip){
        this.nama=nama;
        this.alamat=alamat;
        this.nip=nip;
    }
}
