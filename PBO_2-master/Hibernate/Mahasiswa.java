/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author Rafael Mahesa
 */
public class Mahasiswa {
    private String nim;
   private String nama;
   private String ipk;

   public Mahasiswa() {
   }

   public Mahasiswa(String nim, String nama, String ipk){
       this.nim = nim;
       this.nama = nama;
       this.ipk = ipk;
   }

   public String getnim(){
       return nim;
   }

   public void setnim(String nim){
       this.nim = nim;
   }

   public String getnama(){
       return nama;
   }

   public void setnama(String nama){
       this.nama = nama;
   }

   public String getipk(){
       return ipk;
   }

   public void setipk(String ipk){
       this.ipk = ipk;
   }

   public String clear(){
       nim="";
       nama="";
       ipk="";
       return "clear";
   }
}
