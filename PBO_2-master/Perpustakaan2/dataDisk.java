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
public class dataDisk {
    ArrayList<Disk> listDisk = new ArrayList<>();
        Disk disk;
    public dataDisk(){
        listDisk.clear();
    }
    public void fillData() {
        disk = new Disk("Apocalypse: Hitler Takes on The West", "National Geographic", "2021", "9786024125189");
        listDisk.add(disk);
    }
}
