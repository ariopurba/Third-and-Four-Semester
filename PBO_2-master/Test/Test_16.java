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
class Test_16 {
  public static void main (String[] args) {
    try {
      System.out.println("Welcome to Java");
      return;
    }
    catch (Exception ex) {
      System.out.println("The finally clause is executed");
    }
  }
}