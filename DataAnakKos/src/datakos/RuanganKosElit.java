package datakos;

public class RuanganKosElit extends Kos{
    @Override
    public double hitungBiaya(){
        return HARGA_WIFI + HARGA_KULKAS + HARGA_KASUR + HARGA_AC;
    }
}
