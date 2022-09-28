package ProjectSDL3;

import java.util.Scanner;

public class Data {
    public static int stok, i = 1, bulanBaru = 1, hargaBarang = 0;
    public static String edisi;
    String produk, namaBarang, nama, alamat, noHp, size, dataPembeli;
    int hargaBeli;
    Scanner input = new Scanner(System.in);

    public void barang() {
        if (bulanBaru == 1) {
            System.out.print("\nJenis Produk: ");
            produk = input.next();
            System.out.print("Nama Edisi: ");
            edisi = input.next();
            System.out.print("Stok Barang: ");
            stok = input.nextInt();
            System.out.print("Harga Barang : ");
            hargaBarang = input.nextInt();
            for (int i = stok; i >= 1; i--) {
                namaBarang = produk + " " + edisi + "[" + i + "]";
                Stok.push(namaBarang);
            }
            bulanBaru = 0;
        } else {
            System.out.println("=>\nMaaf, Produk untuk bulan ini masih tersedia.\n" + 
                    "Untuk menambahkan produk tunggu edisi " + edisi + " berakhir"
            );
        }
    }
      
    public void pembeli() {
        if (i <= stok) {
            System.out.print("\nNama: ");
            nama = input.next();
            System.out.print("Alamat: ");
            alamat = input.next();
            System.out.print("Nomor Hp: ");
            noHp = input.next();
            System.out.print("Size: ");
            size = input.next();
            System.out.print("Harga Beli ");
            hargaBeli = input.nextInt();
            if(hargaBeli == hargaBarang){
                dataPembeli = "Nama: " + nama + " | Alamat: " + alamat + " | Nomor Hp: " + noHp + " "
                        + "| Size: " + size + " | Harga Beli: " +hargaBeli;
                Antrian.antrianBaru(dataPembeli);
                i++;
            }else if(hargaBeli > hargaBarang){
                int harga = hargaBeli - hargaBarang;
                dataPembeli = "Nama: " + nama + " | Alamat: " + alamat + " | Nomor Hp: " + noHp + " |"
                        + " Size: " + size + " | Harga Beli: " +hargaBeli;
                Antrian.antrianBaru(dataPembeli);
                i++;
            }else{
                System.out.println("Harga tidak mencukupi!");
            }
        } else {
            System.out.println("Maaf, Stok habis");
        }
    }
}
