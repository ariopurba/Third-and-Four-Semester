/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author old
 */
public class Mahasiswa implements Comparable {

    private int nim;
    private String nama;

    public Mahasiswa() {

    }

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
        if (((Mahasiswa) o).getNim() == nim) {
            return 0;
        } else if (((Mahasiswa) o).getNim() > nim) {
            return 1;
        } else {
            return -1;
        }
    }

//    public static void cetak(String mahasiswa []){
//        for (int i = 0; i < mahasiswa.length; i++) {
//            System.out.println("Nama Mahasiswa :"+mahasiswa[i]);
//        }
//    }
//    public static void main(String[] args) {
//        String [] mahasiswa = {"ario", "joe", "adi", "gab", "tom"};
//        Mahasiswa.cetak(mahasiswa);
//    }
    public static int binarySearch(int array[], int toFind) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (toFind < array[mid]) {
                high = mid + 1;
            } else if (toFind > array[mid]) {
                low = mid + 1;
            } else if (toFind == array[mid]) {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "NIM = " + nim + ", Nama= " + nama;
    }

}
