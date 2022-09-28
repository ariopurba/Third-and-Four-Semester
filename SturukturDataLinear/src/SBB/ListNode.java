/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SBB;

/**
 *
 * @author old
 */
public class ListNode {
    int elemen;
    ListNode next;
    ListNode prev;
    
    ListNode(){
    }
    ListNode(int elemen){
        this.elemen = elemen;
    }
    ListNode(int elemen, ListNode next, ListNode prev){
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
    public int getElemen(){
        return elemen;
    }
    public void setElemen(int elemen){
        this.elemen = elemen;
    }
    public ListNode getNext(){
        return next;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
    public ListNode getPrev(){
        return prev;
    }
    public void setPrev(ListNode prev){
        this.prev = prev;
    }

}
