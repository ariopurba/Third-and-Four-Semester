/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.*;

public class Test20 {

    public static void main(String[] args) throws Exception {

        ResultSet rs = null;

        Connection conn = null;

        PreparedStatement pstmt = null;

        PreparedStatement pstmt2 = null;

        conn =;

        String[] columnNames = {"actor_id", "first_name", "last_name", "last_update"};

        Object[] inputValues = new Object[columnNames.length];

        inputValues[0] = new java.lang.Integer(202);

        inputValues[1] = new String("Heru");

        inputValues[2] = new String("Superheru");

        inputValues[3] = new Timestamp((new java.util.Date()).getTime());

        String insert = "INSERT INTO actor (actor_id, first_name, last_name,last_update) values(?, ?, ?, ?)";

        pstmt = conn.prepareStatement(insert);

        pstmt.setObject(1, inputValues[0]);

        pstmt.setObject(2, inputValues[1]);

        pstmt.setObject(3, inputValues[2]);

        pstmt.setObject(4, inputValues[3]);

        pstmt.executeUpdate();

        String query = "SELECT actor_id, first_name, last_name, last_update FROM actor WHERE actor_id=?";

        pstmt2 = conn.prepareStatement(query);

        pstmt2.setObject(1, inputValues[0]);

        rs = pstmt2.executeQuery();

        Object[] outputValues = new Object[columnNames.length];

        if (rs.next()) {

            for (int i = 0; i < columnNames.length; i++) {

                outputValues[i] = rs.getObject(i + 1);

            }

        }

        System.out.println("autor_id = " + ((java.lang.Integer) outputValues[0]).toString());

        System.out.println("first_name = " + ((String) outputValues[1]));

        System.out.println("last_name = " + ((String) outputValues[2]));

        System.out.println("last_update = " + ((java.sql.Timestamp) outputValues[3]).toString());

        rs.close();

        pstmt.close();

        pstmt2.close();

        conn.close();

    }

    public static Connection getMySqlConnection() throws Exception {

        String driver = "org.gjt.mm.mysql.Driver";

        String url = "jdbc:mysql://localhost/sakila";

        String username = "root";

        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);

        return conn;

    }

}
