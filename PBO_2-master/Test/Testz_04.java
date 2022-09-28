/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rafael Mahesa
 */
public class Testz_04 {
    public static void main(String[] args) {
    try {
        File f = new File("xxx.ser");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Object());
        oos.close();
        fos.close();
      }
      catch (Exception x) { }
   }
}
