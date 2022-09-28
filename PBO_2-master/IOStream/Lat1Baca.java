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
public class Lat1Baca {
    public static void main (String args[]) throws IOException {
        //setup file and stream
        File           inFile     = new File("cek.data");
        FileReader     fileReader = new FileReader(inFile);
        BufferedReader buffReader  = new BufferedReader(fileReader);
        String kunci;
        String cek;
        int k;
        
        //baca dan tampilkan kunci
        kunci=buffReader.readLine();
        System.out.println(kunci);
        
        //baca dan tampilkan jawaban
        for (int i = 0; i < 5; i++){
            System.out.println(buffReader.readLine());
            cek=buffReader.readLine();
            System.out.print(cek);
            k=0;
            for(int j=0;j<kunci.length();j++)
                if(kunci.charAt(j) == cek.charAt(j)) k++;
            System.out.println(" : "+k);
        }
        
        //input done, so close the stream
        buffReader.close();
    }
}
