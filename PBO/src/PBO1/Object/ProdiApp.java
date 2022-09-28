/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1.Object;

/**
 *
 * @author old
 */
public class ProdiApp {

    public static void main(String[] args) {
        Pegawai pgw = new Pegawai();
        pgw.setEmail("ariopurba@gmail.com");
        pgw.setGelar("Spd");
        pgw.setNama("Ario");
        pgw.setNip("123");
        ProgramStudi prg = new ProgramStudi();
        prg.setKetua_prodi(pgw);
        prg.setKode_prodi(0);
        prg.setNama_prodi("IKJ");
        System.out.println("Prodi: " + prg.getNama_prodi() + " Diketuai " +pgw.getNama());
    }
}
