/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

import javax.swing.JOptionPane;

/**
 *
 * @author old
 */
public class MobilApp {

    public static void main(String[] args) {
        Mobil[] mbl;
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Mobil"));
        mbl = new Mobil[n];
        for (int i = 0; i < mbl.length; i++) {
            String nama = JOptionPane.showInputDialog(null, "Nama Mobil");
            String wrn = JOptionPane.showInputDialog(null, "Warna Mobil");
            
            mbl[i] = new Mobil();
            mbl[i].setMerk(nama);
            mbl[i].setWarna(wrn);
        }
        Dealer dlr = new Dealer();
        dlr.setNamaDealer("Ario Dealer");
        dlr.setPemilik("ario");
        dlr.setDaftarMobil(mbl);
        Mobil[] tampung = dlr.getDaftarMobil();
        
        for (int i = 0; i < tampung.length; i++) {
            System.out.println(tampung[i]);
        }
    }
}
