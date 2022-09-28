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
public class Mahasiswa extends Peminjam {
    protected String nim;
    
    public Mahasiswa(){
        
    }
    public Mahasiswa(String nama, String alamat, String nim){
        this.nama=nama;
        this.alamat=alamat;
        this.nim=nim;
    }
}
