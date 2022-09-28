package datakos;

public abstract class Civitas implements StatusCivitas{
    protected String nama;
    protected String domisili;
    protected int umur;
    protected int bulanKontrak;
    protected String jenisRuangan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getBulanKontrak() {
        return bulanKontrak;
    }

    public void setBulanKontrak(int bulanKontrak) {
        this.bulanKontrak = bulanKontrak;
    }

    public String getJenisRuangan() {
        return jenisRuangan;
    }

    public void setJenisRuangan(String jenisRuangan) {
        this.jenisRuangan = jenisRuangan;
    }
    
    public static String cariNama(String cariNama){
        return cariNama;
    }
    
    @Override
    public abstract double totalBiaya();
    @Override
    public abstract String getStatus();
}
