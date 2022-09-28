/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

/**
 *
 * @author old
 */
public class RunTime {
    public static void main(String[] args) {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
    
}
