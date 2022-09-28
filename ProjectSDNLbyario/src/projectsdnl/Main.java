/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsdnl;

/**
 *
 * @author Ribka Restu
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Umat umat;
        Tree pohon = new Tree();
        String nama, alamat;
        int id;
        String cari, hapus;
        int pilihan = 0;

        while (pilihan != 5) {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu \n1. Insert data umat "
                    + "\n2.Cari data umat \n3. Lihat data umat\n4.Hapus data umat\n5.Keluar"));
            switch (pilihan) {
                case 1:
                    nama = JOptionPane.showInputDialog("Masukkan nama :");
                    alamat = JOptionPane.showInputDialog("Masukkan alamat :");
                    id = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ID :"));
                    pohon.insert(new Umat(nama, alamat, id));
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    cari = JOptionPane.showInputDialog("Masukkan nama yang dicari");
                    Umat cariUmat = new Umat(cari);

                    TreeNode hasil = pohon.getCurrent(cariUmat);
                    if (hasil == null) {
                        System.out.println("Data tidak ditemukan");
                    } else {
                        System.out.println("Data ditemukan");
                    }
                    break;

                case 3:
                    pohon.inorderTraversal();
                    break;
                case 4:
                    hapus = JOptionPane.showInputDialog("Masukkan nama yang ingin dihapus");
                    Umat hapusUmat = new Umat(hapus);
                    pohon.delete(hapusUmat);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input tidak valid");
                    break;

            }

        }

    }
}
