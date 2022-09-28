/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author old
 */
public class SearchInALinkedList {

    public static void main(String[] args) {
        // initializing the linked list
        LinkedList<Integer> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);

        //Element to be searched
        int element = 0;
        try{
            
        
        System.out.print("Input Number to Search: ");
        Scanner scan = new Scanner(System.in);
         element = scan.nextInt();
        }catch(Exception e){
            System.out.println("Input Again");
            
        }

        //initiliazing the answer to the index -1
        int ans = -1;

        //Traversing through the linked list
        for (int i = 0; i < ll.size(); i++) {
            int llElement = ll.get(i);
            if (llElement == element) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found in linked list at "+ans);
        }
    }
}
