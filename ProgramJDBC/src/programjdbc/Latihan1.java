package programjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("====================");
        
        System.out.println("Mencoba membuat koneksi ke database...");
        Latihan1 p = new Latihan1();
        Connection conn =  p.getConnection();
          
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        String host = "localhost";
        String port = "1521";
        String db   = "XE";
        String usr  = "hr";
        String pwd  = "flora205314074";
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        
        Connection conn = null;
        
        try {
           conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":"
                   + port + ":" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        } 
        
        if(conn != null) {
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, koneksi ke data base gagal terbentuk");
        }
        return conn;
    }
}
