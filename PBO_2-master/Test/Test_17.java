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
class Test_17 {
  public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");
    }
    catch (NumberFormatException ex) {
      System.out.println("NumberFormatException");
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException");
    }
  }

  static void method() {
    String s = "5.6";
    Integer.parseInt(s); // Cause a NumberFormatException

    int i = 0;
    int y = 2 / i;
    System.out.println("Welcome to Java");
  }
}