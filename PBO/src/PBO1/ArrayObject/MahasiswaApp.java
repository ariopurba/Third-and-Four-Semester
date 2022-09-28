/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author old
 */
public class MahasiswaApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa[] mhs;
        System.out.println("input jumlah siswa: ");
        int n = scan.nextInt();
        mhs = new Mahasiswa[n];
        for (int i = 0; i < mhs.length; i++) {
            String nama = JOptionPane.showInputDialog(null, "Nama : ");
            double us1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nilai UTS1 :"));
            double us2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nilai UTS2 :"));
            double uas = Double.parseDouble(JOptionPane.showInputDialog(null, "Nilai UAS :"));

            mhs[i] = new Mahasiswa();
            mhs[i].setNama(nama);
            mhs[i].setUts1(us1);
            mhs[i].setUts2(us2);
            mhs[i].setUas(uas);

        }
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("no."+i);
            System.out.println("Nama "+mhs[i].getNama());
            System.out.println("Nilai UTS1 "+mhs[i].getUts1());
            System.out.println("Nilai UTS2 "+mhs[i].getUts2());
            System.out.println("Nilai UAS "+mhs[i].getUas());
            System.out.println("Nilai Final"+mhs[i].nilaiFinal());
        }
    }

}

