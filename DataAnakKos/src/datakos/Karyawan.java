package datakos;

public class Karyawan extends Civitas{
    private String namaPerusahaan;
    private double gajiTotal;

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public double getGajiTotal() {
        return gajiTotal;
    }

    public void setGajiTotal(double gajiTotal) {
        this.gajiTotal = gajiTotal;
    }
    
    @Override
    public double totalBiaya(){
        return gajiTotal / 10;
    }
    
    @Override
    public String getStatus(){
        return "Karyawan";
    }
}
