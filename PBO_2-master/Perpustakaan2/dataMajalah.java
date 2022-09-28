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
public class dataMajalah {
    ArrayList<Majalah> listMajalah = new ArrayList<>();
        Majalah majalah;
    public dataMajalah(){
        listMajalah.clear();
    }
    public void fillData() {
        majalah = new Majalah("Forbes Indonesia September 2021", "Wahana Mediatama", "2021", "9786024125189");
        listMajalah.add(majalah);
    }
}
