/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static Connection koneksi;

    public static Connection getkoneksi() throws SQLException {
        if (koneksi == null) {
            try {
                String url = new String();
                String host = "127.0.0.1";
                String port = "3306";
                String db = "sdnl";
                String user = "root";
                String password = "root";
                url = "jdbc:mysql://localhost:3306/sdnl";  
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}
