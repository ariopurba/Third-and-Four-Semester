package datakos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teknis {
    private Kos kos;
    private Civitas[] civitas;
    private RuanganKosElit[] elit;
    private RuanganKosMurmer[] murmer;
    private int limit, lmtElit, lmtMurmer;
    private boolean sudahTerisi = false, dataSiswaTerisi, dataKaryaTerisi;
    private int urutanData;
    private int pengulanganData;
    private int krywnElit, krywnMurmer, siswaElit, siswaMurmer;
    private double rataMhsElite, rataMhsMurmer, rataKrywnElite, rataKrywnMurmer;
    
    // Untuk memunculkan panel Java
    JOptionPane panel = new JOptionPane();
    
    // BPB = Biaya Per Bulan
    public double hitungBPB(Civitas civic){
        Kos biaya;
        double value = 0;
        if(civic instanceof Mahasiswa){
            Mahasiswa mah = (Mahasiswa)civic;
            if(mah.getJenisRuangan().equalsIgnoreCase("Elite")){
                biaya = new RuanganKosElit();
                value = mah.totalBiaya() + biaya.hitungBiaya();
            }
            else if(mah.getJenisRuangan().equalsIgnoreCase("Murmer")){
                biaya = new RuanganKosMurmer();
                value = mah.totalBiaya()/20 + biaya.hitungBiaya();
            }
        }
        else if(civic instanceof Karyawan){
            Karyawan kar = (Karyawan)civic;
            if(kar.getJenisRuangan().equalsIgnoreCase("Elite")){
                biaya = new RuanganKosElit();
                value = kar.totalBiaya() + biaya.hitungBiaya();
            }
            else if(kar.getJenisRuangan().equalsIgnoreCase("Murmer")){
                biaya = new RuanganKosMurmer();
                value = kar.totalBiaya()/20 + biaya.hitungBiaya();
            }
        }
        return value;
    }
    
    // BTK = Biaya Total Kos
    public double hitungBTK(Civitas civic){
        return hitungBPB(civic) * civic.getBulanKontrak();
    }
    
    // Hitung total data untuk digunakan dalam rerata dan penghasilan
    public void hitungTotalData(Civitas civic){
        if(civic instanceof Mahasiswa && civic.getJenisRuangan().equalsIgnoreCase("Elite")){
            siswaElit++;
            rataMhsElite += hitungBPB(civic);
        }
        else if(civic instanceof Mahasiswa && civic.getJenisRuangan().equalsIgnoreCase("Murmer")){
            siswaMurmer++;
            rataMhsMurmer += hitungBPB(civic);
        }
        else if(civic instanceof Karyawan && civic.getJenisRuangan().equalsIgnoreCase("Elite")){
            krywnElit++;
            rataKrywnElite += hitungBPB(civic);
        }
        else if(civic instanceof Karyawan && civic.getJenisRuangan().equalsIgnoreCase("Murmer")){
            krywnMurmer++;
            rataKrywnMurmer += hitungBPB(civic);
        }
        else{
            System.out.print("");
        }
    }
    
    // Hitung rerata untuk satu data
    public double hitungRerataData(double a, int b){
        double rata;
        if(b == 0){
            rata = 0;
        }
        else{
            rata = a / b;
        }
        return rata;
    }
    
    // Hitung untuk keseluruhan data
    public double hitungRerataKeseluruhan(double rata1, double rata2, int jmlh1, int jmlh2){
        double rata;
        if(jmlh1 == 0 || jmlh2 == 0){
            rata = rata1 + rata2;
        }
        else{
            rata = (rata1 + rata2) / 2;
        }
        return rata;
    }
    
    // Input data kos (Sangat Krusial)
    public void inputDataKos(){
        String namaKos = JOptionPane.showInputDialog(null, "Nama kos:");
        String alamatKos = JOptionPane.showInputDialog(null, "Alamat kos:");
        String noTelp = JOptionPane.showInputDialog(null, "Masukkan no. telp kos:");
        
        kos = new Kos(namaKos, noTelp);
        kos.setAlamatKos(alamatKos);
        
        int jmlhRuang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah ruangan \"Elite\":"));
        kos.setJmlhElit(jmlhRuang);
        elit = new RuanganKosElit[jmlhRuang];
        jmlhRuang = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah ruangan \"Murah Meriah\":"));
        kos.setJmlhMurmer(jmlhRuang);
        murmer = new RuanganKosMurmer[jmlhRuang];
        
        // Mereset data
        dataSiswaTerisi = false;
        dataKaryaTerisi = false;
        urutanData = 0;
        pengulanganData = 0;
        lmtElit = 0;
        lmtMurmer = 0;
        limit = kos.getJmlhElit() + kos.getJmlhMurmer();
        civitas = new Civitas[limit];
        sudahTerisi = true;
        krywnElit = 0;
        krywnMurmer = 0;
        siswaElit = 0;
        siswaMurmer = 0;
        rataMhsElite = 0;
        rataMhsMurmer = 0;
        rataKrywnElite = 0;
        rataKrywnMurmer = 0;
    }
    
    // Akan men-trigger pilihan untuk mengisi inputDataKos() maupun untuk mereset datanya
    public void menuSatu(){
        if(sudahTerisi == true){
            Scanner input = new Scanner(System.in);
            String pilihan;
            do{
                System.out.print("Apakah Anda yakin untuk mereset data? (Y/N): ");
                pilihan = input.next();
            } while(!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("N"));
            
            if(pilihan.equalsIgnoreCase("Y")){
                sudahTerisi = false;
                inputDataKos();
            }
            else{}
        }
        else if(sudahTerisi == false){
            inputDataKos();
        }
    }
    
    // Untuk menginput mahasiswa dan karyawannya apabila menuSatu() telah terisi
    public void menuDua(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else{
            /*
                Dalam menu dua, beginilah cara kerja pembatas data (Limit ruangan keseluruhan):
            
                1.  int n adalah deklarasi variabel primitif "int" dengan nama variabel "n". Secara sintatik, ini akan digunakan
                    untuk menghitung berapa data yang ingin diinput terlebih dahulu.
                2. Dalam perulangan "do", user akan ditanyakan berapa data yang ingin diinput. User dapat menginputnya
                    secara bebas, asalkan input tidak melebihi "limit" atau secara semantik "batas ruangan yang tersedia".
                    Jika melebihi, akan ada sebuah peringatan. Jika data sudah penuh dan user ingin keluar, cukup dengan
                    mengetik 0, maka panel akan otomatis tertutup.
                3. Ketika user sudah memasukkan "n" dengan syarat terpenuhi, maka program akan melakukan operasi
                    perhitungan untuk mengurangi jumlah "limit" dan akan menambah "pengulanganData" yang bernilai 0
                    untuk digunakan dalam perulangan "for" dan untuk mencegah terlalu banyak perulangan yang tidak 
                    diinginkan pengguna untuk terjadi.
                4. Untuk perulangan for, kita menggunakan "urutanData" yang dimulai dari 0 dan akan ditambah apabila
                    telah mencapai akhir dari brackets "for". Gunanya adalah untuk mencegah data array tereset pada saat
                    user ingin mengisi lagi.
            */
            int n;
            do{
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah data yang akan diinput (Jika data penuh, ketik 0 untuk keluar dari dialog):"));
                if(n > limit) JOptionPane.showMessageDialog(null, "Jumlah data yang akan diinput tidak boleh melebihi limit ruangan", "Terjadi kesalahan", 0);
            }while(n > limit);
            limit -= n;
            pengulanganData += n;
            for(int i = urutanData; i < pengulanganData; i++){
                String jenis;
                String jenisRuangan;
                boolean ruanganPenuh;
                
                String nama = JOptionPane.showInputDialog(null, "Nama penghuni:", "Pengisian data ke-" + (i+1), 3);
                String domisili = JOptionPane.showInputDialog(null, "Daerah asal:", "Pengisian data ke-" + (i+1), 3);
                int umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Usia:", "Pengisian data ke-" + (i+1), 3));
                int bulanKontrak = Integer.parseInt(JOptionPane.showInputDialog(null, "Kontrak berapa lama? (Per bulan)", "Pengisian data ke-" + (i+1), 3));
                do{
                    jenis = JOptionPane.showInputDialog(null, "Penghuni merupakan kalangan (Mahasiswa/Karyawan):", "Pengisian data ke-" + (i+1), 3);
                    if(!jenis.equalsIgnoreCase("Mahasiswa") && !jenis.equalsIgnoreCase("Karyawan")){
                        JOptionPane.showMessageDialog(null, "Kesalahan dalam pengisian!", "Terjadi kesalahan", 0);
                    }
                }while (!jenis.equalsIgnoreCase("Mahasiswa") && !jenis.equalsIgnoreCase("Karyawan"));
                if(jenis.equalsIgnoreCase("Mahasiswa")){
                    String gelar;
                    civitas[i] = new Mahasiswa();
                    Mahasiswa mahasiswa = (Mahasiswa)civitas[i];
                    do{
                        gelar = JOptionPane.showInputDialog(null, "Gelar mahasiswa (Diploma/S1/S2/S3):", "Pengisian data ke-" + (i+1), 3);
                        if(!gelar.equalsIgnoreCase("Diploma") && !gelar.equalsIgnoreCase("S1") && !gelar.equalsIgnoreCase("S2") && !gelar.equalsIgnoreCase("S3")){
                            JOptionPane.showMessageDialog(null, "Kesalahan dalam pengisian!", "Terjadi kesalahan", 0);
                        }
                    }while(!gelar.equalsIgnoreCase("Diploma") && !gelar.equalsIgnoreCase("S1") && !gelar.equalsIgnoreCase("S2") && !gelar.equalsIgnoreCase("S3"));
                    int semester = Integer.parseInt(JOptionPane.showInputDialog(null, "Semester:", "Pengisian data ke-" + (i+1), 3));
                    double kirimanUang = Double.parseDouble(JOptionPane.showInputDialog(null, "Uang kiriman per bulan:", "Pengisian data ke-" + (i+1), 3));
                    mahasiswa.setGelar(gelar);
                    mahasiswa.setSemester(semester);
                    mahasiswa.setKirimanUang(kirimanUang);
                    
                    dataSiswaTerisi = true;
                }
                if(jenis.equalsIgnoreCase("Karyawan")){
                    civitas[i] = new Karyawan();
                    Karyawan karyawan = (Karyawan)civitas[i];
                    String namaPerusahaan = JOptionPane.showInputDialog(null, "Nama perusahaan:", "Pengisian data ke-" + (i+1), 3);
                    double gajiTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Gaji total:", "Pengisian data ke-" + (i+1), 3));
                    karyawan.setNamaPerusahaan(namaPerusahaan);
                    karyawan.setGajiTotal(gajiTotal);
                    
                    dataKaryaTerisi = true;
                }
                do{
                    ruanganPenuh = false;
                    jenisRuangan = JOptionPane.showInputDialog(null, "Jenis ruangan (Murmer/Elite):", "Pengisian data ke-" + (i+1), 3);
                    if(!jenisRuangan.equalsIgnoreCase("Murmer") && !jenisRuangan.equalsIgnoreCase("Elite")){
                        JOptionPane.showMessageDialog(null, "Kesalahan dalam pengisian!", "Terjadi kesalahan", 0);
                    }
                    if(jenisRuangan.equalsIgnoreCase("Elite") && lmtElit > elit.length-1){
                        ruanganPenuh = true;
                        JOptionPane.showMessageDialog(null, "Ruangan elite telah penuh!", "Ruangan penuh", 0);
                    }
                    if(jenisRuangan.equalsIgnoreCase("Murmer") && lmtMurmer > murmer.length-1){
                        ruanganPenuh = true;
                        JOptionPane.showMessageDialog(null, "Ruangan murmer telah penuh!", "Ruangan penuh", 0);
                    }
                }while((!jenisRuangan.equalsIgnoreCase("Murmer") && !jenisRuangan.equalsIgnoreCase("Elite")) || ruanganPenuh);
                if(jenisRuangan.equalsIgnoreCase("Elite")){
                    lmtElit++;
                }
                else if(jenisRuangan.equalsIgnoreCase("Murmer")){
                    lmtMurmer++;
                }
                civitas[i].setJenisRuangan(jenisRuangan);
                civitas[i].setNama(nama);
                civitas[i].setDomisili(domisili);
                civitas[i].setUmur(umur);
                civitas[i].setBulanKontrak(bulanKontrak);
                urutanData++;
            }
            kos.setCivitas(civitas);
        }
    }
    
    // Menampilkan background dari kos
    public void menuTiga(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else{
            System.out.println();
            System.out.println("Nama kos\t\t: " + kos.getNamaKos());
            System.out.println("Alamat kos\t\t: " + kos.getAlamatKos());
            System.out.println("No telp.\t\t: " + kos.getNoTelp());
            System.out.println();
            System.out.println("Jumlah ruangan total\t: " + (kos.getJmlhElit() + kos.getJmlhMurmer()));
            System.out.println("Jumlah ruangan elite\t: " + kos.getJmlhElit());
            System.out.println("Jumlah ruangan murah meriah\t: " + kos.getJmlhMurmer());
            System.out.println(); 
            System.out.println("Ruangan tersedia\t: " + ((kos.getJmlhElit() - lmtElit) + (kos.getJmlhMurmer() - lmtMurmer)));
            System.out.println("Ruangan elite tersedia\t: " + (kos.getJmlhElit() - lmtElit));
            System.out.println("Ruangan murah meriah tersedia\t: " + (kos.getJmlhMurmer() - lmtMurmer));
            System.out.println();
            System.out.println("Biaya normal untuk per bulan:");
            
            Kos biayaElit = new RuanganKosElit();
            System.out.println("Untuk ruangan elite\t: " + biayaElit.hitungBiaya());
            
            Kos biayaMurmer = new RuanganKosMurmer();
            System.out.println("Untuk ruangan murah meriah\t: " + biayaMurmer.hitungBiaya());
            
            System.out.println();
            System.out.println("Pajak yang diterapkan per bulannya untuk setiap penghuni:");
            System.out.println("Untuk Penghuni Elite");
            System.out.println("Karyawan\t: 10% Gaji Total + " + biayaElit.hitungBiaya());
            System.out.println("Mahasiswa\t: 5% Uang Kiriman + " + biayaElit.hitungBiaya());
            System.out.println("Untuk Penghuni Murah Meriah");
            System.out.println("Karyawan\t: 20% dari 10% Gaji Total + " + biayaMurmer.hitungBiaya());
            System.out.println("Mahasiswa\t: 20% dari 5% Uang Kiriman + " + biayaMurmer.hitungBiaya());
            System.out.println();
        }
    }
    
    // Menampilkan tabel data mahasiswa
    public void menuEmpat(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else if(dataSiswaTerisi == false) System.err.println("Data mahasiswa masih kosong!");
        else{
            Civitas[] dataCivitasKos = kos.getCivitas();
            int no = 1;
            
            System.out.println();
            System.out.println("Data Penghuni Kos: Mahasiswa");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("No\tNama\tDaerah Asal\tUmur\tBulan Kontrak\tRuangan\tGelar\tSemester\tUang Kiriman\t\tBiaya Per Bulan\t\tSyarat Lunas");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Civitas data : dataCivitasKos) {
                if(data instanceof Mahasiswa){
                    Mahasiswa maha = (Mahasiswa)data;
                    System.out.print(no + "\t" + maha.getNama() + "\t" + maha.getDomisili() + "\t" + maha.getUmur() + "\t" + maha.getBulanKontrak() + "\t" + maha.getJenisRuangan() +"\t" + maha.getGelar() + "\t" + maha.getSemester());
                    System.out.printf("\t%.0f\t\t%.0f\t\t%.0f\n", maha.getKirimanUang(), hitungBPB(maha), hitungBTK(maha));
                    no++;
                }
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }
    
    // Menampilkan tabel data karyawan
    public void menuLima(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else if(dataKaryaTerisi == false) System.err.println("Data karyawan masih kosong!");
        else{
            Civitas[] dataCivitasKos = kos.getCivitas();
            int no = 1;
            
            System.out.println();
            System.out.println("Data Penghuni Kos: Karyawan");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("No\tNama\tDaerah Asal\tUmur\tBulan Kontrak\tRuangan\tNama Perusahaan\tGaji Total\t\tBiaya Per Bulan\t\tSyarat Lunas");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Civitas data : dataCivitasKos) {
                if(data instanceof Karyawan){
                    Karyawan karya = (Karyawan)data;
                    System.out.print(no + "\t" + karya.getNama() + "\t" + karya.getDomisili() + "\t" + karya.getUmur() + "\t" + karya.getBulanKontrak() + "\t" + karya.getJenisRuangan() +"\t" + karya.getNamaPerusahaan());
                    System.out.printf("\t\t%.0f\t\t%.0f\t\t%.0f\n", karya.getGajiTotal(), hitungBPB(karya), hitungBTK(karya));
                    no++;
                }
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }
    
    // Mencari penghuni berdasarkan nama
    public void menuEnam(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else if(dataKaryaTerisi == false && dataSiswaTerisi == false) System.err.println("Data penghuni masih kosong!");
        else{
            String cari = JOptionPane.showInputDialog(null, "Cari penghuni kos (Nama lengkap):");
            boolean ketemu = false;
            try{
                for(int i = 0; i < civitas.length; i++){
                    Civitas[] dataCivitasKos = kos.getCivitas();
                    if(Civitas.cariNama(cari).equalsIgnoreCase(dataCivitasKos[i].getNama())){
                        String statusCivitas = "";
                        if(dataCivitasKos[i] instanceof Mahasiswa){
                            Mahasiswa maha = (Mahasiswa)dataCivitasKos[i];
                            statusCivitas += "\nStatus\t: " + maha.getStatus() +
                                                        "\nGelar:\t: " + maha.getGelar() +
                                                        "\nKiriman uang\t: " + String.format("%.0f" , maha.getKirimanUang()) +
                                                        "\n----------------------------------------------------------------------------------------------" +
                                                        "\nJenis ruangan\t: " + maha.getJenisRuangan() +
                                                        "\nBiaya per bulan\t: " + String.format("%.0f", hitungBPB(maha)) +
                                                        "\nTotal lunas\t: " + String.format("%.0f", hitungBTK(maha));
                        }
                        else if(dataCivitasKos[i] instanceof Karyawan){
                            Karyawan karya = (Karyawan)dataCivitasKos[i];
                            statusCivitas += "\nStatus\t: " + karya.getStatus() +
                                                        "\nNama perusahaan:\t: " + karya.getNamaPerusahaan() +
                                                        "\nGaji total\t: " + String.format("%.0f",karya.getGajiTotal()) +
                                                        "\n----------------------------------------------------------------------------------------------" +
                                                        "\nJenis ruangan\t: " + karya.getJenisRuangan() +
                                                        "\nBiaya per bulan\t: " + String.format("%.0f", hitungBPB(karya)) +
                                                        "\nTotal lunas\t: " + String.format("%.0f", hitungBTK(karya));
                        }
                        JOptionPane.showMessageDialog(null, 
                                "Nama penghuni\t: " + dataCivitasKos[i].getNama() +
                                "\nDaerah asal\t: " + dataCivitasKos[i].getDomisili() +
                                "\nUsia\t: " + dataCivitasKos[i].getUmur() +
                                "\nBulan kontrak\t: " + dataCivitasKos[i].getBulanKontrak() +
                                statusCivitas, "Pencarian ditemukan", JOptionPane.INFORMATION_MESSAGE);
                        ketemu = true;
                        break;
                    }
                    else if (i == (civitas.length - 1) && !ketemu){
                        JOptionPane.showMessageDialog(null, "Pencarian tidak ditemukan!", "Penghuni tidak ditemukan", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NullPointerException e){
                    JOptionPane.showMessageDialog(null, "Pencarian tidak ditemukan!", "Penghuni tidak ditemukan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    // Menghitung rerata per bulan
    public void menuTujuh(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else if(dataKaryaTerisi == false && dataSiswaTerisi == false) System.err.println("Data penghuni masih kosong!");
        else{
            Civitas[] dataCivitasKos = kos.getCivitas();
            
            for (int i = 0; i < dataCivitasKos.length; i++) {
                hitungTotalData(dataCivitasKos[i]);
            }
            
            double seluruhMhs = hitungRerataKeseluruhan(rataMhsElite, rataMhsMurmer, siswaElit, siswaMurmer);
            double seluruhKrywn = hitungRerataKeseluruhan(rataKrywnElite, rataKrywnMurmer, krywnElit, krywnMurmer);
            double seluruhData = hitungRerataKeseluruhan(seluruhMhs, seluruhKrywn, (siswaElit + siswaMurmer), (krywnElit + krywnMurmer));
            
            System.out.println();
            System.out.println("Rata-rata biaya untuk Mahasiswa:");
            System.out.println("\tElite\t: " + String.format("%.0f", hitungRerataData(rataMhsElite, siswaElit)));
            System.out.println("\tMurah meriah\t: " + String.format("%.0f", hitungRerataData(rataMhsMurmer, siswaMurmer)));
            System.out.println("\tKeseluruhan\t: " + String.format("%.0f", seluruhMhs));
            System.out.println("Rata-rata biaya untuk Karyawan:");
            System.out.println("\tElite\t: " + String.format("%.0f", hitungRerataData(rataKrywnElite, krywnElit)));
            System.out.println("\tMurah meriah\t: " + String.format("%.0f", hitungRerataData(rataKrywnMurmer, krywnMurmer)));
            System.out.println("\tKeseluruhan\t: " + String.format("%.0f", seluruhKrywn));
            System.out.println("Rata-rata seluruhnya:");
            System.out.println("\tElite\t: " + String.format("%.0f", hitungRerataData((rataMhsElite + rataKrywnElite), (siswaElit + krywnElit))));
            System.out.println("\tMurah meriah\t: " + String.format("%.0f", hitungRerataData((rataMhsMurmer + rataKrywnMurmer), (siswaMurmer + krywnMurmer))));
            System.out.println("\tKeseluruhan\t: " + String.format("%.0f", seluruhData));
            System.out.println();
        }
    }
    
    // Menghitung penghasilan kos
    public void menuDelapan(){
        if(sudahTerisi == false) System.err.println("Data masih kosong!");
        else if(dataKaryaTerisi == false && dataSiswaTerisi == false) System.err.println("Data penghuni masih kosong!");
        else{
            Civitas[] dataCivitasKos = kos.getCivitas();
            
            for (int i = 0; i < dataCivitasKos.length; i++) {
                hitungTotalData(dataCivitasKos[i]);
            }
            
            System.out.println("Penghasilan per bulan berdasarkan penghuni:");
            System.out.println("\tMahasiswa:");
            System.out.println("\t\tElite\t\t: " + String.format("%.0f", rataMhsElite));
            System.out.println("\t\tMurmer\t\t: " + String.format("%.0f", rataMhsMurmer));
            System.out.println("\t\tTotal penghasilan\t: " + String.format("%.0f", (rataMhsElite + rataMhsMurmer)));
            System.out.println("\tKaryawan:");
            System.out.println("\t\tElite\t\t: " + String.format("%.0f", rataKrywnElite));
            System.out.println("\t\tMurmer\t\t: " + String.format("%.0f", rataKrywnMurmer));
            System.out.println("\t\tTotal penghasilan\t: " + String.format("%.0f", (rataKrywnElite + rataKrywnMurmer)));
            System.out.println("\tSeluruh penghuni:");
            System.out.println("\t\tElite\t\t: " + String.format("%.0f", (rataMhsElite + rataKrywnElite)));
            System.out.println("\t\tMurmer\t\t: " + String.format("%.0f", (rataMhsMurmer + rataKrywnMurmer)));
            System.out.println("\t\tTotal penghasilan\t: " + String.format("%.0f", ((rataMhsElite + rataMhsMurmer) + (rataKrywnElite + rataKrywnMurmer))));
            System.out.println();
        }
    }
}
