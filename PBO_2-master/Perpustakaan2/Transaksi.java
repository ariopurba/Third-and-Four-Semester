/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan2;

/**
 *
 * @author Rafael Mahesa
 */
import java.util.Date;
public class Transaksi {
    protected int idTransaksi;
    protected Date tglPinjam, tglKembali;
    protected float denda;
    protected Koleksi koleksi1[];
    protected Peminjam peminjam1;
}
