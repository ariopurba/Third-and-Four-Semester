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
public class dataUmum {
    ArrayList<Umum> listUmum = new ArrayList<>();
        Umum umum;
    public dataUmum(){
        listUmum.clear();
    }
    public void fillData() {
        umum = new Umum("Charlie", "Klaten", "347103");
        listUmum.add(umum);
    }
}
