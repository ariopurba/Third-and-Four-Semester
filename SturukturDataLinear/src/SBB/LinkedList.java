/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SBB;

/**
 *
 * @author old
 */
public class LinkedList {
    private ListNode head;
    private int size;
    
    LinkedList(){
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        this.size = 0;
    }
    LinkedList(ListNode head, int size){
        this.head = head;
        this.size = size;
    }
    private ListNode addBefore(int elemen, ListNode bantu){
        ListNode baru = new ListNode(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(baru);
        bantu.setPrev(baru);
        
        size++;
        return baru;
    }
    private int remove(ListNode bantu){
        ListNode left = bantu.getPrev();
        ListNode right = bantu.getNext();
        left.setNext(right);
        right.setPrev(left);
        bantu.setNext(null);
        bantu.setPrev(null);
        size--;
        return bantu.getElemen();
    }
    public void addFirst(int elemen){
        addBefore(elemen, head.getNext());
    }
    public void addLast(int elemen){
        addBefore(elemen, head);
    }
    public int removeFirst(){
        return remove(head.next);
        
    }
    public int removeLast(){
        return remove(head.prev);
    }
    public ListNode search(int index){
        ListNode bantu = head;
        bantu = bantu.getNext();
        int i = 0;
        while (bantu != head){
            if (i == index){
                return bantu;
            }
            bantu = bantu.getNext();
            i++;
            
        }
        return null;
    }
    public int size(){
        int count = 0;
        if (head == null){
            return count;
        }else{
            ListNode temp = head;
            do{
                temp = temp.getNext();
                count++;
            }while(temp != head);
        }
        return count;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        ListNode bantu = head.getNext();
        while (bantu != head){
            int elemen = bantu.getElemen();
            str.append(elemen);
            str.append(" ");
            bantu = bantu.getNext();
        }
        return str.toString();
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addFirst(9);
        myList.addFirst(23);
    }
}
