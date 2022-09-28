package ProjectSDL3;

import java.util.Scanner;
import static ProjectSDL3.Antrian.*;
import static ProjectSDL3.Tanggal.*;
import static ProjectSDL3.Data.*;

public class Relasi {

    public static int i = 0, kirim = 0, terkirim = 0, relasi = 0, batas = 1;
    public static String[] barang = new String[stok];
    public static String[] waktu = new String[stok];

    public static void kirim() {
        if (Antrian.antrianKosong()) {
            System.out.println("=>\nTidak ada Pembeli");
        } else {
            waktu[kirim] = waktu();
            System.out.println(barang[kirim] + " Terkirim Pada " + waktu[kirim]);
            Stok.pop();
            Antrian.hapusAntrian();
            if (kirim > 0) {
                kirim--;
                batas++;
            }
        }
    }
    public static void terkirim() {
        if (waktu[terkirim] == null) {
            System.out.println("=>\nBelum ada yang dikirim");
        } else {
            System.out.println("=>");
            for (int i = terkirim; i >= kirim; i--) {
                if (waktu[i] == null) {
                    return;
                } else {
                    System.out.println(barang[i] + " Di kirim ke: \n" + daftarAntri[i] + "\nPada " + waktu[i] + "\n");
                }
            }
            if (batas == stok) {
                System.out.println("Maaf, Semua Produk Edisi " + edisi + " "
                    + "Telah Terjual dan Terkirim ke Pembeli \n Terima Kasih telah percaya kepada kami");
                ulang();
            }
        }
    }
    public static void ulang() {
        Scanner input = new Scanner(System.in);
        char aksi = 'b';
        while (aksi != 'y') {
            System.out.print("\nIngin Memulai Edisi Selanjutnya ? (Y/T) : ");
            aksi = input.next().charAt(0);
            switch (aksi) {
                case 'y':
                    newSeason();
                    break;
                case 't':
                    System.out.println("Terima Kasih dan Sampai Jumpa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input tidak sesuai, ulangi : ");
                    break;
            }
        }
        Main.aksi = 0;
    }
    public static void newSeason() {
        for (int i = terkirim; i >= kirim; i--) {
            daftarAntri[i] = null;
            barang[i] = null;
            waktu[i] = null;
        }
        i = 0;
        kirim = 0;
        terkirim = 0;
        relasi = 0;
        batas = 1;
        bulanBaru = 1;
        Data.i = 1;
        Antrian.i = Data.stok - 1;
        seasonChange();
    }
}
