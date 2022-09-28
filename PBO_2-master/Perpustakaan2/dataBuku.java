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
public class dataBuku {
    ArrayList<Buku> listBuku = new ArrayList<>();
        Buku buku;
    public dataBuku(){
        listBuku.clear();
    }
    public void fillData() {
        buku = new Buku("Filosofi Teras", "Kompas", "2008", "9786024125189");
        listBuku.add(buku);
        buku = new Buku("Cinta (Tidak Harus) Mati", "Kompas", "2014", "9789797096762");
        listBuku.add(buku);
    }
}
