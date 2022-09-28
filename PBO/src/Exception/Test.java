/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author old
 */
public class Test {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;
            int c = 10 / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("Syntax program Salah");
            System.out.println(e.getMessage());
        }
    }
}
