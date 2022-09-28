/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author hertada
 */
public class Mahasiswa extends Peminjam {
    private String nim;

    public Mahasiswa() {
        super();
        this.nim="0";
    }

    public Mahasiswa(String id_peminjam, String nama, String alamat, int mak_pinjam, String nim) {
        super(id_peminjam, nama, alamat, mak_pinjam);
        this.nim = nim;
    }

    
    
    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

 
}
