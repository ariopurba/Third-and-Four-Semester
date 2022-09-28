/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Rafael Mahesa
 */
class Test_18 {
  public static void main(String[] args) {
    try {
      String s = "5.6";
      Integer.parseInt(s); 

      int i = 0;
      int y = 2 / i;
      System.out.println("Welcome to Java");
    }
    catch (Exception ex) {
      System.out.println(ex);
    }
  }
}