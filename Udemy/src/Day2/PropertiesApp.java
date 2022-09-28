/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author old
 */
public class PropertiesApp {

    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            
            properties.load(new FileInputStream("aplication.properties"));
            
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            
            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
            
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak dimukan");
        }catch (IOException exception){
            System.out.println("Gagal Load data dari file");
        }
        
        try{
            Properties properties = new Properties();
        properties.put("name.first", "Ario");
        properties.put("name.middle", "Tua");
        properties.put("name.last", "Purba");
        
        properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        }catch (FileNotFoundException execption){
            System.out.println("Error membuat file");
        }catch(IOException exception){
            System.out.println("Error menyimpan properties");
        }
    }
}
