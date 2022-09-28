/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author old
 */
public class MainLarik {

    public static void main(String[] args) {
//        int [] data = {10, 12, 22, 23, 43};
//        
//        Larik.cetak(data);

        Mahasiswa[] mhs = new Mahasiswa[7];
        mhs[0] = new Mahasiswa(5, "Ario");
        mhs[1] = new Mahasiswa(6, "Budi");
        mhs[2] = new Mahasiswa(7, "Calvin");
        mhs[3] = new Mahasiswa(8, "Dedy");
        mhs[4] = new Mahasiswa(1, "Efraim");
        mhs[5] = new Mahasiswa(2, "Frans");
        mhs[6] = new Mahasiswa(4, "Goddy");
        
        System.out.println("Data Sebelum diurutkan");
        Larik.cetak(mhs);
        System.out.println("");
        System.out.println("Data Setelah diurutkan");
        Larik.quickSortObject(mhs, 0, mhs.length - 1);
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(mhs[i]+ ", ");
        }
    }


}
