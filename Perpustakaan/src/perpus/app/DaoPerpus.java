package perpus.app;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoPerpus {
    ArrayList<Peminjam> peminjamList = new ArrayList<>();
    ArrayList<Koleksi> koleksiList = new ArrayList<>();
    ArrayList<Transaksi> transaksiList = new ArrayList<>();
        
    public DaoPerpus(){

    }
    
    public void isiDataPeminjam(Peminjam data) {
            try {
                peminjamList.add(data);
            } catch (Expackage perpus.app;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoPerpus {
    ArrayList<Peminjam> peminjamList = new ArrayList<>();
    ArrayList<Koleksi> koleksiList = new ArrayList<>();
    ArrayList<Transaksi> transaksiList = new ArrayList<>();
        
    public DaoPerpus(){

    }
    
    public void isiDataPeminjam(Peminjam data) {
            try {
                peminjamList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DaoPerpus.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void isiDataKoleksi(Koleksi data) {
            try {
                koleksiList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DaoPerpus.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void isiDataTransaksi(Transaksi data) {
            try {
                transaksiList.add(data);
            } catch (Exception ex) {
                Logger.getLogger(DaoPerpus.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
