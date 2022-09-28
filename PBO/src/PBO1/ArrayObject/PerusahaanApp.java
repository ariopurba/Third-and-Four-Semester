/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

import javax.swing.*;

/**
 *
 * @author old
 */
public class PerusahaanApp {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pegawai : "));

        Pegawai[] pgw;
        pgw = new Pegawai[n];
        for (int i = 0; i < pgw.length; i++) {
            String nama = JOptionPane.showInputDialog(null, "Nama : ");
            String nik = JOptionPane.showInputDialog(null, "Nik Pegawai ");
            double gaji = Double.parseDouble(JOptionPane.showInputDialog(null, "Gaji pegawai"));

            pgw[i] = new Pegawai();
            pgw[i].setNama(nama);
            pgw[i].setNIK(nik);
            pgw[i].setGaji(gaji);
        }
        Perusahaan company = new Perusahaan();
        company.setNamaPerusahaan("Ario Company");
        company.setPemilik("ario");
        company.setAlamat("Jl. Tirtayasa 23");
        company.setNPWP("3232");
        company.setDaftarPegawai(pgw);
        Pegawai[] tampung = company.getDaftarPegawai();
        
        Pegawai terbesar , terkecil;
        terbesar = terkecil = pgw[0];
        
        for (int i = 0; i < pgw.length; i++) {
            if (pgw[i].getGaji() < terkecil.getGaji()) {
                terkecil = pgw[i];
            }else if(pgw[i].getGaji() < terbesar.getGaji()){
                terbesar = pgw[i];
            }
        }
    }
}
