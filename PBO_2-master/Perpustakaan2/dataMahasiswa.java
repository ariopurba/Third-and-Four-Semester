/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan2;

import java.util.ArrayList;

/**
 *
 * @author Rafael Mahesa
 */
public class dataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        Mahasiswa mahasiswa;
    public dataMahasiswa(){
        listMahasiswa.clear();
    }
    public void fillData() {
        mahasiswa = new Mahasiswa("Bima", "Magelang", "207391");
        listMahasiswa.add(mahasiswa);
    }
}
