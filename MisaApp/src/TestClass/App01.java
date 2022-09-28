/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClass;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Jadwal;
import model.Tree;
import model.TreeNode;
import model.Umat;

/**
 *
 * @author Ribka Restu
 */
public class App01 {

    static ArrayList<Jadwal> jadwal = new ArrayList<Jadwal>();

    public static void main(String[] args) {
        Umat umat;
        Tree<Umat> pohon = new Tree<Umat>();
        String nama, alamat, username, password;
        int createId = 99, pilihMisa = 0, kuota = 0;
        String cari, hapus, id = null, jam, tanggal;
        String hari = null;
        int Pilihimam = 0, idMisa = 0;

        int Terisisabtu = 0, TerisimingguP = 0, TerisimingguS = 0;
//        String jadwalMisa = "Jadwal misa : \n1. Sabtu sore pukul 17.00 WIB \n2. Minggu pagi pukul 07.00 WIB"
//                + " \n3. Minggu sore pukul 17.00 WIB";
        int pilihan = 0, pilihstatus = 0, pilihanUmat = 0;
        menuAwal:
        while (pilihstatus != 9) {
            try {
                pilihstatus = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu :\n1. Masuk sebagai Admin \n2. Masuk sebagai Umat\n9. Keluar"));
                switch (pilihstatus) {
                    case 1:
                        menuAdmin:

                        username = JOptionPane.showInputDialog("Masukkan username");
                        password = JOptionPane.showInputDialog("Masukkan password");
                        if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("2022")) {
                            while (pilihan != 4) {
                                try {
                                    pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu \n1. Cari data umat \n2. Lihat data umat \n3. Tambah jadwal misa \n4. Logout"));
                                    switch (pilihan) {
                                        case 1:
                                            cari = JOptionPane.showInputDialog("Masukkan kode umat yang dicari");
                                            Umat cariUmat = new Umat(cari);
                                            TreeNode hasil = pohon.getCurrent(cariUmat);
                                            if (hasil == null) {
                                                System.out.println("Data tidak ditemukan");
                                            } else {
                                                System.out.println("Data ditemukan");
                                            }
                                            break;
                                        case 2:
                                            pohon.inorderTraversal();
                                            break;
                                        case 3:
                                            hari = JOptionPane.showInputDialog("Masukkan hari");
                                            tanggal = JOptionPane.showInputDialog("Masukkan tanggal");
                                            jam = JOptionPane.showInputDialog("Masukkan jam dengan contoh format : pukul 10.00 WIB");
                                            kuota = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kuota misa"));
                                            Jadwal tambahJadwal = new Jadwal(kuota, jam, tanggal, hari);
                                            while (true) {
                                                Pilihimam = Integer.parseInt("Pilih imam : \n1. Cyprianus Kuntoro Adi, S.J. M.A., M.Sc., Ph.D. \n2. Drs.Hari Suparwito, S.J. M.App.IT");
                                                if (Pilihimam == 1) {
                                                    tambahJadwal.setImam("Cyprianus Kuntoro Adi, S.J. M.A., M.Sc., Ph.D.");
                                                    break;
                                                } else if (Pilihimam == 2) {
                                                    tambahJadwal.setImam("Drs.Hari Suparwito, S.J. M.App.IT");
                                                    break;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Harap input pilihan yang benar!");
                                                }
                                            }

//                                            tambahJadwal.setUmat(pohon);
                                            jadwal.add(tambahJadwal);
//                                            int edit = JOptionPane.showConfirmDialog(null, jadwalMisa + "\nApakah anda ingin mengedit jadwal misa? ", "Informasi Misa", JOptionPane.YES_NO_OPTION);
//                                            if (edit == JOptionPane.YES_OPTION) {
//                                                jadwalMisa = JOptionPane.showInputDialog(null, "Masukkan jadwal misa dengan format : \nJadwal misa : ,1. (Isikan jadwal) ,2. dst.. \ncontoh : Jadwal misa : ,1. Sabtu sore pukul 17.00 WIB",
//                                                        "Edit jadwal misa", JOptionPane.INFORMATION_MESSAGE);
//                                                jadwalMisa = jadwalMisa.replaceAll(",", "\n");
//                                                JOptionPane.showMessageDialog(null, "Jadwal berhasil diperbaharui");
//                                                break;
//                                            } else {
//                                                break;
//                                            }
                                        case 4:
                                            int temp = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                                            if (temp == JOptionPane.YES_OPTION) {
                                                continue menuAwal;
                                            } else {
                                                pilihan = 0;
                                                break;
                                            }

                                        default:
                                            JOptionPane.showMessageDialog(null, "Pilihan tidak ada di daftar menu!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
                                            pilihan = 0;
//                                            continue menuAdmin;
                                            break;

                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Inputan tidak valid, harap input dengan angka!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);

                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Username atau password salah !", "Gagal login", JOptionPane.ERROR_MESSAGE);
                        }
                    case 2:
//                        String formattedString = jadwal.toString().replace(",", "").replace("[", "").replace("]", "").trim();
                        String temp = null;
                        for (int i = 0; i < jadwal.size(); i++) {
                            temp += (i + 1) + ". " + jadwal.get(i) + "\n";
                        }
                        pilihanUmat = Integer.parseInt(JOptionPane.showInputDialog(temp + "\nPilih menu : \n1. Daftar misa  \n2. Pembatalan misa"));
                        if (pilihanUmat == 1) {
                            nama = JOptionPane.showInputDialog("Masukkan nama (panggilan) anda");
                            alamat = JOptionPane.showInputDialog("Masukkan alamat anda");
                            pilihMisa = Integer.parseInt(JOptionPane.showInputDialog("Pilih jadwal misa : \n" + temp));
//                            jadwal.indexOf(pilihMisa);
//                            jadwal.add(e)

//                            if (pilihMisa == 1) {
//                                createId++;
//                                id = "G-" + createId;
//                                pohon.insert(new Umat(nama, alamat, id, "Sabtu sore"));
//                                Terisisabtu++;
//                            } else if (pilihMisa == 2) {
//                                createId++;
//                                id = "G-" + createId;
//                                pohon.insert(new Umat(nama, alamat, id, "Minggu pagi"));
//                                TerisimingguP++;
//                            } else if (pilihMisa == 3) {
//                                createId++;
//                                id = "G-" + createId;
//                                pohon.insert(new Umat(nama, alamat, id, "Minggu sore"));
//                                TerisimingguS++;
//                            }
                            JOptionPane.showMessageDialog(null, "Kode pendaftaran kamu adalah " + id + ""
                                    + "!\nSilahkan simpan untuk ditunjukan pada petugas, terima kasih.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                            break;
//                            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        } else if (pilihanUmat == 2) {
                            hapus = JOptionPane.showInputDialog("Masukkan nama yang ingin dihapus");
                            Umat hapusUmat = new Umat(hapus);

                            TreeNode<Umat> cekId = pohon.getCurrent(hapusUmat);
                            int tampung = JOptionPane.showConfirmDialog(null, "Apakah kode anda adalah " + cekId.getData().getId() + " ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (tampung == JOptionPane.YES_OPTION) {
                                int tampung2 = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan misa"
                                        + "? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                                if (tampung2 == JOptionPane.YES_OPTION) {
                                    pohon.delete(hapusUmat);
                                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            } else {
                                break;
                            }

                        }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Inputan tidak valid, harap input dengan angka!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
