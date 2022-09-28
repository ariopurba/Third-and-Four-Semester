/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.app;

/**
 *
 * @author hertada
 */
public class Disk extends Koleksi {
    private String isbn;
    private String format;

    public Disk() {
        super();
        this.format = "noFormat";
        this.isbn = "noISBN";
    }

    public Disk (String id_koleksi, String judul, String penerbit, boolean status_pinjam, String format, String isbn){
        super(id_koleksi, judul, penerbit, status_pinjam);
        this.format = format;
        this.isbn = isbn;
    }
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }
}
