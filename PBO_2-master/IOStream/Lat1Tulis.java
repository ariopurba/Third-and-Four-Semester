/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;

/**
 *
 * @author Rafael Mahesa
 */
import java.io.*;
import java. util.Scanner;
public class Lat1Tulis {
    public static void main (String[] args) throws IOException {
        Scanner key=new Scanner(System.in);
        //setup file and stream
        File              outFile       = new File("cek.data");
        FileOutputStream  outFileStream = new FileOutputStream(outFile);
        PrintWriter       outStream     = new PrintWriter(outFileStream);
        
        //kunci jawaban
        System.out.println("Masukkan kunci jawaban");
        outStream.println(key.next());
        
        //jawaban siswa
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukan nama :");
            outStream.println(key.next());
            System.out.println("Masukan jawaban :");
            outStream.println(key.next());
        }
      
      //output done, so close the stream
      outStream.close();
   }
}
