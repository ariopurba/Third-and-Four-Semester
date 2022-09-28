/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBaru;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ribka Restu
 */
public class Main1 {

    static ArrayList<Jadwal> jadwal = new ArrayList<Jadwal>();

    public static void main(String[] args) {
        String nama, alamat, username, password;
        int createId = 99, pilihMisa = 0, kuota = 0;
        String cari, hapus, id = null, jam, tanggal;
        String hari = null;
        int Pilihimam = 0;

        int pilihan = 0, pilihstatus = 0, pilihanUmat = 0;
        jadwal.add(new Jadwal(50, "pukul 17.00 WIB", "28-05-2022", "Sabtu"));
        jadwal.get(0).setImam("Cyprianus Kuntoro Adi, S.J. M.A., M.Sc., Ph.D.");
        jadwal.add(new Jadwal(32, "pukul 07.00 WIB", "29-05-2022", "Minggu"));
        jadwal.get(1).setImam("Drs.Hari Suparwito, S.J. M.App.IT");
        jadwal.add(new Jadwal(30, "pukul 17.00 WIB", "29-05-2022", "Minggu"));
        jadwal.get(2).setImam("Cyprianus Kuntoro Adi, S.J. M.A., M.Sc., Ph.D.");
        while (pilihstatus != 3) {
            try {
                pilihstatus = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu :\n1. Masuk sebagai Admin \n2. Masuk sebagai Umat\n3. Keluar"));
                pilihan = 0;
                switch (pilihstatus) {
                    case 1:
                        username = JOptionPane.showInputDialog("Masukkan username");
                        password = JOptionPane.showInputDialog("Masukkan password");
                        if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("2022")) {
                            while (pilihan != 6) {
                                try {
                                    pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu \n1. Cari data umat \n2. Lihat data umat \n3. Tambah jadwal misa \n4. Hapus jadwal misa \n5. Kosongkan jadwal misa \n6. Logout"));
                                    switch (pilihan) {
                                        case 1:
                                            cari = JOptionPane.showInputDialog("Masukkan kode umat yang dicari");
                                            Umat cariUmat = new Umat(cari);
                                            TreeNode hasil = null;
                                            int indeksCariUmat = 0;
                                            for (int i = 0; i < jadwal.size(); i++) {
                                                if (jadwal.get(i).getUmat().getCurrent(cariUmat) != null) {
                                                    hasil = jadwal.get(i).getUmat().getCurrent(cariUmat);
                                                    indeksCariUmat = i;
                                                    break;
                                                }
                                            }
                                            if (hasil != null) {
                                                JOptionPane.showMessageDialog(null, "Silahkan masuk!");
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Kode tidak cocok !", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                                            }
                                            break;
                                        case 2:
                                            for (int i = 0; i < jadwal.size(); i++) {
                                                System.out.print(jadwal.get(i).toString());
                                                jadwal.get(i).getUmat().inorderTraversal();
                                            }
                                            break;
                                        case 3:
                                            hari = JOptionPane.showInputDialog("Masukkan hari");
                                            tanggal = JOptionPane.showInputDialog("Masukkan tanggal");
                                            jam = JOptionPane.showInputDialog("Masukkan jam dengan contoh format : pukul 10.00 WIB");
                                            kuota = Integer.parseInt(JOptionPane.showInputDialog(("Masukkan kuota misa")));
                                            Jadwal tambahJadwal = new Jadwal(kuota, jam, tanggal, hari);
                                            while (true) {
                                                Pilihimam = Integer.parseInt(JOptionPane.showInputDialog("Pilih imam : \n1. Cyprianus Kuntoro Adi, S.J. M.A., M.Sc., Ph.D. \n2. Drs.Hari Suparwito, S.J. M.App.IT"));
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
                                            jadwal.add(tambahJadwal);
                                            break;

                                        case 4:
                                            String temp1 = "";
                                            for (int i = 0; i < jadwal.size(); i++) {
                                                temp1 += (i + 1) + ". " + jadwal.get(i);
                                            }
                                            int pilihhapusJadwal = Integer.parseInt(JOptionPane.showInputDialog(temp1 + "Silahkan pilih jadwal yang mau dihapus"));
                                            jadwal.remove(pilihhapusJadwal - 1);
                                            JOptionPane.showMessageDialog(null, "Jadwal berhasil dihapus");
                                            break;
                                        case 5:
                                            jadwal.removeAll(jadwal);
                                            JOptionPane.showMessageDialog(null, "Semua jadwal berhasil dihapus");
                                            break;
                                        case 6:
                                            int temp = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                                            if (temp == JOptionPane.YES_OPTION) {
                                                break;

                                            } else {
                                                pilihan = 0;
                                            }
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Pilihan tidak ada di daftar menu!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
                                            pilihan = 0;
                                            break;
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Inputan tidak valid, harap input dengan angka!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);

                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Username atau password salah !", "Gagal login", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 2:
                        String temp = "";
                        for (int i = 0; i < jadwal.size(); i++) {
                            temp += (i + 1) + ". " + jadwal.get(i);

                        }
                        if (temp.equals("")) {
                            JOptionPane.showMessageDialog(null, "Belum ada jadwal misa, silahkan cek di lain waktu!");
                        } else {
                            pilihanUmat = Integer.parseInt(JOptionPane.showInputDialog(temp + "Pilih menu : \n1. Daftar misa  \n2. Pembatalan misa"));
                            if (pilihanUmat == 1) {
                                nama = JOptionPane.showInputDialog("Masukkan nama (panggilan) anda");
                                alamat = JOptionPane.showInputDialog("Masukkan alamat anda");
                                pilihMisa = 0;
                                while (pilihMisa <= 0 || pilihMisa > jadwal.size()) {
                                    pilihMisa = Integer.parseInt(JOptionPane.showInputDialog("Pilih jadwal misa : \n" + temp));
                                }
                                createId++;
                                id = "G-" + createId;
                                int jumlahNode = jadwal.get(pilihMisa - 1).getUmat().countNodes(jadwal.get(pilihMisa - 1).getUmat().getRoot());
                                if (jumlahNode < jadwal.get(pilihMisa - 1).getKuota()) {
                                    jadwal.get(pilihMisa - 1).getUmat().insert(new Umat(nama, alamat, id));
                                    jadwal.get(pilihMisa - 1).setKuota(jadwal.get(pilihMisa - 1).getKuota() - 1);
                                    JOptionPane.showMessageDialog(null, "Kode pendaftaran kamu adalah " + id + ""
                                            + "!\nSilahkan simpan untuk ditunjukan pada petugas, terima kasih.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Kuota penuh !", "Gagal mendaftar", JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            } else if (pilihanUmat == 2) {

                                hapus = JOptionPane.showInputDialog("Masukkan kode misa anda ");
                                Umat hapusUmat = new Umat(hapus);
                                TreeNode<Umat> cariHapus = null;
                                int indeksHapus = 0;
                                for (int i = 0; i < jadwal.size(); i++) {
                                    if (jadwal.get(i).getUmat().getCurrent(hapusUmat) != null) {
                                        cariHapus = jadwal.get(i).getUmat().getCurrent(hapusUmat);
                                        indeksHapus = i;
                                        break;
                                    }
                                }
                                if (cariHapus != null) {
                                    int tampung = JOptionPane.showConfirmDialog(null, "Atas nama  " + cariHapus.getData().getNama() + " ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                                    if (tampung == JOptionPane.YES_OPTION) {
                                        int tampung2 = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan misa"
                                                + "? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                                        if (tampung2 == JOptionPane.YES_OPTION) {
                                            jadwal.get(indeksHapus).getUmat().delete(hapusUmat);
                                            JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                                            jadwal.get(indeksHapus).setKuota(jadwal.get(indeksHapus).getKuota() + 1);
                                        }
                                    }
                                } else {
                                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Menu tidak ada!");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Inputan tidak valid, harap input dengan angka!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
