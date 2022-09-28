package MainApp;

import TestClass.DataPasien;
import java.util.UUID;
import javax.swing.JOptionPane;
import model.Tree;
import model.TreeNode;
import model.pasien;

/**
 *
 * @author old
 */
public class AppRmhSkt {

    public static void main(String[] args) {
        Tree pohon = new Tree();
        String nama, alamat, username, password;
        String jenis_kelamin, penyakit, id = null;
        int createid = 99;
        String cari, hapus;
        int umur, nohp;
        int pilihstatus = 0;
        int pilihan = 0;
        int no_kamar;

        while (pilihan != 6) {
            try {
                pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih Menu \n1. Tambah Pasien \n2. Lihat Daftar Pasien \n3. Cari Pasien \n4. Hapus Pasien \n5. Keluar"));
                switch (pilihan) {
                    case 1:
                        nama = JOptionPane.showInputDialog("Input Nama Pasien : ");

                        jenis_kelamin = JOptionPane.showInputDialog("Input Jenis Kelamin Pasien: ");
                        penyakit = JOptionPane.showInputDialog("Penyakit Pasien: ");

                        createid++;
                        id = "P-" + createid;
                        no_kamar = Integer.parseInt(JOptionPane.showInputDialog("No Kamar pasien: "));
                        pohon.insert(new pasien(nama, jenis_kelamin, penyakit, id, no_kamar));
                        break;
                    case 2:

                        pohon.inorderTraversal();
                        break;
                    case 3:
                        cari = JOptionPane.showInputDialog("Masukkan Id Pasien yang dicari");
                        pasien cariPasien = new pasien(cari);
                        TreeNode hasil = pohon.getCurrent(cariPasien);

                        if (pohon.getCurrent(cariPasien) != null) {
                            JOptionPane.showMessageDialog(null, "Pasien Ditemukan");
                        } else {
                            JOptionPane.showMessageDialog(null, "Pasien Dengan ID Tersebut Tidak Ada !", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 4:
                        hapus = JOptionPane.showInputDialog("Masukkan Id Pasien ");
                        pasien hapuspasien = new pasien(hapus);
                        if (pohon.delete(hapuspasien)) {
                            int tampung = JOptionPane.showConfirmDialog(null, "Atas nama  " + pohon.delete(hapuspasien.getNama()) + " ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (tampung == JOptionPane.YES_OPTION) {

                                pohon.delete(hapuspasien);
                                JOptionPane.showMessageDialog(null, "Pasien Berhasil Dihapus");

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Pasien tidak ditemukan", "Kesalahan", JOptionPane.ERROR_MESSAGE);

                        }
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Input Tidak valid");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Inputan tidak valid, harap input dengan angka!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

}
