/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

/**
 *
 * @author Rafael Mahesa
 */
import java.sql.*;
public class TestConnect {
    public static void main(String args[]){
      String jdbcURL = "jdbc:mysql://localhost:3306/sakila";
      String user = "MHS205314077";
      String password = "205314077";
      Connection conn = null;
      Statement stmt;
      ResultSet rs;
      String output = "";
      
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection(jdbcURL, user, password);
          stmt = conn.createStatement();
          rs = stmt.executeQuery("SELECT first_name FROM actor");
          if (rs !=null){
              while (rs.next()){
                  output += rs.getString("first_name")+ "\n";
                  
              }
          }
          rs.close();
          stmt.close();
          conn.close();
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
      System.out.print(output);
  }  
}
