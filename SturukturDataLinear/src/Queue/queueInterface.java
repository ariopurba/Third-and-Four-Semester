/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author old
 */
public class queueInterface {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        //add elemen
        for (int i = 0; i < 10; i++) {
            q.add(i);
            
         
        }
        System.out.println("urutan data "+q);
        Integer remove = q.remove();
        System.out.println("hapus data "+remove);
    }
}
