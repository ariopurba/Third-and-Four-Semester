/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBaru;

/**
 *
 * @author Ribka Restu
 */
public class Umat implements Comparable<Object> {

    private String nama;
    private String alamat;
    private String id;

    public Umat() {
    }

    public Umat(String nama, String alamat, String id) {
        this.nama = nama;
        this.alamat = alamat;
        this.id = id;

    }

    public Umat(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//     @Override
//    public int compareTo(Object t) {
//        return nama.compareTo(((Umat)t).getNama());
//          
//    }
    @Override
    public String toString() {
        return nama + "\t\t" + alamat + "\t" + id + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Umat) o).getId());
    }

}
