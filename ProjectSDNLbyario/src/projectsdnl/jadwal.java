/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsdnl;

/**
 *
 * @author old
 */
public class jadwal {
    private int kuota;
    private String jam;
    private String tgl;
    private String imam;
    private Tree umat;

    public jadwal(int kuota, String jam, String tgl, String imam, Tree umat) {
        this.kuota = kuota;
        this.jam = jam;
        this.tgl = tgl;
        this.imam = imam;
        this.umat = umat;
    }

    public jadwal() {
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getImam() {
        return imam;
    }

    public void setImam(String imam) {
        this.imam = imam;
    }

    public Tree getUmat() {
        return umat;
    }

    public void setUmat(Tree umat) {
        this.umat = umat;
    }
    
    
}
