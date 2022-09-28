package datakos;

import java.util.Scanner;

public class DataKos {
    public static void main(String[] args) {
        Teknis teknis = new Teknis();
        
        boolean isRunning = true;
        
        Scanner input = new Scanner(System.in);

        while(isRunning){
            System.out.println("Data kos-kosan: By Kelompok 3");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("\t1. Input data kos-kosan");
            System.out.println("\t2. Input data penghuni");
            System.out.println("\t3. Tampilkan data kos");
            System.out.println("\t4. Tampilkan data mahasiswa");
            System.out.println("\t5. Tampilkan data karyawan");
            System.out.println("\t6. Cari nama penghuni");
            System.out.println("\t7. Rata-rata tagihan penghuni per bulan");
            System.out.println("\t8. Penghasilan kos per bulan");
            System.out.println("\t9. Tampilkan lagi menu awal");
            System.out.println("\t10. Keluar");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            boolean pilihanRunning = true;
            while(pilihanRunning){
                System.out.println();
                System.out.print("Pilih: ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1  :{
                        teknis.menuSatu();
                    }
                    case 2 : {
                        teknis.menuDua();
                    }
                    case 3 : {
                        teknis.menuTiga();
                    }
                    case 4 :{
                        teknis.menuEmpat();
                    }
                    case 5 : {
                        teknis.menuLima();
                    }
                    case 6 :{
                        teknis.menuEnam();
                    }
                    case 7 : {
                        teknis.menuTujuh();
                    }
                    case 8 : {
                        teknis.menuDelapan();
                    }
                    case 9 : {
                        pilihanRunning = false;
                    }
                    case 10 : {
                        System.err.println("Mengakhiri Program..");
                        isRunning = false;
                        pilihanRunning = false;
                    }
                    default : {
                        System.err.println("Pilihan tidak tersedia!");
                    }
                }
            }
        }
    }
}