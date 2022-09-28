package ProjectSDL3;

import static ProjectSDL3.Relasi.barang;
import static ProjectSDL3.Data.stok;
import static ProjectSDL3.Relasi.relasi;
import java.util.NoSuchElementException;

public class Antrian {

    static Node head, tail;
    public static int i = stok - 1;
    public static String[] daftarAntri = new String[stok];

    public static boolean antrianKosong() {
        return head == null;
    }
    public static void antrianBaru(String dataPembeli) {
        dataPembeli = dataPembeli + barang[relasi];
        Node Newdata = new Node(dataPembeli);
        if (antrianKosong()) {
            head = Newdata;
        } else {
            tail.Next = Newdata;
        }
        Newdata.Previous = tail;
        tail = Newdata;
        daftarAntri[i] = tail.data;
        if (i > 0) {
            i--;
        }
        if (relasi > 0) {
            relasi--;
        }
    }
    public static void hapusAntrian() {
        if (antrianKosong()) {
            throw new NoSuchElementException();
        }
        Node current = head;
        if (head != tail) {
            tail = null;
        } else {
            head.Next = null;
            head.Previous = null;
        }
        head = head.Next;
        current.Next = null;
    }
    public static void daftarAntrian() {
        Node current = head;
        System.out.println("=>");
        while (current != null) {
            System.out.println(" ");
            System.out.print(current.data);
            System.out.println(" ");
            current = current.Next;
        }
        if (antrianKosong()) {
            System.out.println("Tidak ada pembeli");
        }
    }
}
