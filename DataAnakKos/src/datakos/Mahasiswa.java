package datakos;

public class Mahasiswa extends Civitas{
    private String gelar;
    private int semester;
    private double kirimanUang;

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public double getKirimanUang() {
        return kirimanUang;
    }

    public void setKirimanUang(double kirimanUang) {
        this.kirimanUang = kirimanUang;
    }
    
    @Override
    public double totalBiaya(){
        return kirimanUang / 5;
    }
    
    @Override
    public String getStatus(){
        return "Mahasiswa";
    }
}
