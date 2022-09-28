/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.ArrayObject;

import java.util.Scanner;

/**
 *
 * @author old
 */
public class BukuApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Buku[] book;
        System.out.print("Jumlah Buku Yang akan disimpan: ");
        int n = scan.nextInt();
        book = new Buku[n];
        for (int i = 0; i < book.length; i++) {
            System.out.println("Judul Buku :");
            String jdl = scan.next();
            System.out.println("Kode Buku :");
            int kd = scan.nextInt();
            System.out.println("Tahun Terbit Buku: ");
            int thn = scan.nextInt();
            System.out.println("Nama pengarang: ");
            String nm = scan.next();
            for (int j = 0; j < book.length; j++) {
                System.out.println("Nik :");
                int nik = scan.nextInt();
                System.out.println("Nama :");
                
            }
            book[i] = new Buku();
            book[i].setJudulBuku(jdl);
            book[i].setKodeBuku(kd);
            book[i].setTahunTerbit(thn);
        }
         System.out.println("Cara buku berdasarkan Tahun: ");
        int cariTahun = scan.nextInt();
        int i =0;
        while(i < book.length && book[i].getTahunTerbit()!= cariTahun){
            i++;
        }if (i == book.length) {
            System.out.println("Buku Terbiatan Tahun "+cariTahun+"Tdk Ditemukan");
        }else{
            System.out.println("Ditemukan Buku "+cariTahun+"Berjudul "+book[i].getJudulBuku());
        }
    }
}
