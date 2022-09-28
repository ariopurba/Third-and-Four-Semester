package datakos;

public class Kos implements Ruangan{
    private Civitas[] civitas;
    protected String namaKos;
    protected String noTelp;
    protected String alamatKos;
    protected int jmlhElit;
    protected int jmlhMurmer;
    
    public Kos(){};
    
    public Kos(String namaKos, String noTelp){
        this.namaKos = namaKos;
        this.noTelp = noTelp;
    }
    
    public Civitas[] getCivitas() {
        return civitas;
    }

    public void setCivitas(Civitas[] civitas) {
        this.civitas = civitas;
    }

    public String getNamaKos() {
        return namaKos;
    }
    
    public String getNoTelp(){
        return noTelp;
    }

    public String getAlamatKos() {
        return alamatKos;
    }

    public void setAlamatKos(String alamatKos) {
        this.alamatKos = alamatKos;
    }

    public int getJmlhElit() {
        return jmlhElit;
    }

    public void setJmlhElit(int jmlhElit) {
        this.jmlhElit = jmlhElit;
    }

    public int getJmlhMurmer() {
        return jmlhMurmer;
    }

    public void setJmlhMurmer(int jmlhMurmer) {
        this.jmlhMurmer = jmlhMurmer;
    }
    
    @Override
    public double hitungBiaya(){
        return 0;
    }
}
