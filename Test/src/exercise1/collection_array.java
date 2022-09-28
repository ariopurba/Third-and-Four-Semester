/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.*;

/**
 *
 * @author old
 */
public class collection_array {

    public static void main(String[] args) {
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Black");
        list_strings.add("Yellow");
        list_strings.add("Green");
        list_strings.add("Blue");
        for (int i = 0; i < list_strings.size(); i++) {
            System.out.println("index " + i + " adalah " + list_strings.get(i));
        }

        list_strings.set(0, "Purple");
        for (int i = 0; i < list_strings.size(); i++) {
            System.out.println("index " + i + " adalah " + list_strings.get(i));

        }
        
    }
}
