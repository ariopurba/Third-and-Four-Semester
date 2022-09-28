/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;

import java.util.Scanner;
import javax.swing.JOptionPane;
import projectsdnl.Tree;
import projectsdnl.TreeNode;
import projectsdnl.Umat;
import projectsdnl.jadwal;

/**
 *
 * @author old
 */
public class umatTest {

    public static void main(String[] args) {
        Umat umat;
        Tree pohon = new Tree();
        int pilihan = 0;
        umat = new Umat("Ario", "Jl.Krodan", 205314094);
        pohon.insert(umat);
//        int baru = umat.getId();
//        System.out.println("" + baru);
        umat = new Umat("Ribka", "Jl.paingan", 205314050);
        pohon.insert(umat);
//        pohon.inorderTraversal();
        Scanner input = new Scanner(System.in);

//        System.out.println("=====Layanan Misa Gereja=====");
//        System.out.println("-----------------------------");
//        System.out.println("1. Menu Admin");
//        System.out.println("2. Menu Pendaftar");
//        System.out.println("3. Keluar");
//        System.out.print("Pilih Aksi: ");
//        int aksi = input.nextInt();
//        switch (aksi) {
//            case 1:
//                while (pilihan != 5) {
//                    pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu \n1. Insert data umat "
//                            + "\n2.Cari data umat \n3. Lihat data umat\n4.Hapus data umat\n5.Keluar"));
//                    switch (pilihan) {
//                        case 1:
//                            String nama = JOptionPane.showInputDialog("Masukkan nama :");
//                            String alamat = JOptionPane.showInputDialog("Masukkan alamat :");
//                            int id = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ID :"));
//                            pohon.insert(new Umat(nama, alamat, id));
//                            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//                            break;
//                        case 2:
//                            String cari = JOptionPane.showInputDialog("Masukkan nama yang dicari");
//                            Umat cariUmat = new Umat(cari);
//
//                            TreeNode hasil = pohon.getCurrent(cariUmat);
//                            if (hasil == null) {
//                                System.out.println("Data Umat " + cari + " tidak ditemukan");
//                            } else {
//                                System.out.println("Data Umat " + cari + " ditemukan");
//                            }
//                            break;
//
//                        case 3:
//                            pohon.inorderTraversal();
//                            break;
//                        case 4:
//                            pohon.inorderTraversal();
//                            System.out.println("");
//                            System.out.print("Nama Umat Yang ingin dihapus: ");
//                            String hapus = input.next().toUpperCase();
////                            String hapus = JOptionPane.showInputDialog("Masukkan nama yang ingin dihapus");
//                            Umat hapusUmat = new Umat(hapus);
//                            pohon.delete(hapusUmat);
//                            JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//                            break;
//                        case 5:
//                            break;
//                        default:
//                            JOptionPane.showMessageDialog(null, "Input tidak valid");
//                            break;
//
//                    }
//                }
//                break;
//            case 2:
        while (pilihan != 3) {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu \n1. Lihat Jadwal Misa "
                    + "\n2.Hapus Jadwal \n3. Keluar"));
//            System.out.println("====Menu Pendaftar Misa====");
//            System.out.println("----------------------------");
            switch (pilihan) {
                case 1:
                    jadwal baru = new jadwal();
                    baru.toString();
                    
                    String nama = JOptionPane.showInputDialog("Masukkan nama :");
                    String alamat = JOptionPane.showInputDialog("Masukkan alamat :");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ID :"));
                    pohon.insert(new Umat(nama, alamat, id));
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
//        break;
                    while (pilihan != 3) {
                        System.out.println("1. Daftar Misa Sabtu");
                        System.out.println("2. Daftar Misa Minggu");
                        System.out.println("3. Keluar");
                        JOptionPane.showMessageDialog(null, "Selamat Anda Telah Terdaftar");
                        System.out.print("Pilih Aksi: ");
                        pilihan = input.nextInt();

                    }
            }
        }
    }
}
//}
