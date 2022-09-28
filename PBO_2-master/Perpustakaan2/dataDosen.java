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
public class dataDosen {
    ArrayList<Dosen> listDosen = new ArrayList<>();
        Dosen dosen;
    public dataDosen(){
        listDosen.clear();
    }
    public void fillData() {
        dosen = new Dosen("Adam", "Yogyakarta", "201732");
        listDosen.add(dosen);
    }
}
