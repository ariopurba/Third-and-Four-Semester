/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.LinkedList;

/**
 *
 * @author old
 */
public class collection_linkedlist {
    public static void main(String[] args) {
        //deklarasi linked lis
        LinkedList<String> list_data = new LinkedList<>();
        list_data.addFirst("red");
        list_data.add("blue");
        list_data.add("pink");
        list_data.addFirst("white");
        list_data.add("green");
        System.out.println("Linked list "+list_data);
    }
}
