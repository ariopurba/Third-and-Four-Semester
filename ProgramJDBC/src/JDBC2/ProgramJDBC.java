package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ProgramJDBC {

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
    public void showData(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        conn = this.getConnection();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from MAHASISWA");
            
            while (rs.next()){
                System.out.println(rs.getString(1) + "  " 
                        + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void inputData(String a, String b, double c){
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();
        
        String nim = a;
        String nama = b;
        double ipk = c;
        
        try {
            ps = conn.prepareStatement("insert into mahasiswa values(?,?,?)");
            ps.setString(1, nim);
            ps.setString(2, nama);
            ps.setDouble(3, ipk);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah ditambahkan!");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public void hapusData(String a) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();

        String nim = a;

        try {
            ps = conn.prepareStatement("delete from mahasiswa where nim = ?");
            ps.setString(1, nim);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah dihapus!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void updateData(String a, String b, double c){
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();

        String nim = a;
        String nama = b;
        double ipk = c;
        
         try {
            ps = conn.prepareStatement("update mahasiswa set nama = ?, ipk = ? where nim = ?");
            ps.setString(1, nama);
            ps.setDouble(2, ipk);
            ps.setString(3, nim);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah diperbaiki!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
