/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsdnl;

/**
 *
 * @author Ribka Restu
 */
public class Umat implements Comparable<Object>{

private String nama ;
private String alamat;
private String id;
private String jadwal;

    public Umat() {
    }

    public Umat(String nama, String alamat, String id, String jadwal) {
        this.nama = nama;
        this.alamat = alamat;
        this.id = id;
        this.jadwal = jadwal;
    }

    public Umat(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

     @Override
    public int compareTo(Object t) {
        return nama.compareTo(((Umat)t).getNama());
          
    }

    @Override
    public String toString() {
        return  nama + "\t" + alamat + "\t" + id +"\t"+jadwal+"\n";
    }
    
}
