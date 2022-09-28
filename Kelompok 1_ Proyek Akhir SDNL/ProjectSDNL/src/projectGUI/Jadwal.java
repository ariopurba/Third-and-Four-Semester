/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectGUI;


/**
 *
 * @author Ribka Restu
 */
public class Jadwal {
    private String hari;
    private int kuota;
    private String jam;
    private String tanggal;
    private String imam;
    private Tree<Umat> umat;


    public Jadwal(int kuota, String jam, String tanggal,String hari) {
        this.kuota = kuota;
        this.jam = jam;
        this.tanggal = tanggal;
        this.hari = hari;
        umat = new Tree<Umat>();
    }

    public Jadwal() {
        this(0,null,null,null);
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


    public String getTanggal() {
        return tanggal;
    }


    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }


    public String getImam() {
        return imam;
    }


    public void setImam(String imam) {
        this.imam = imam;
    }

    public Tree<Umat> getUmat() {
        return umat;
    }

    public void setUmat(Tree<Umat> umat) {
        this.umat = umat;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    @Override
    public String toString() {
        return  hari + ", "+ tanggal +" "+ jam + " kuota : " + kuota +  " " + imam +"\n";
    }
    
    
}
