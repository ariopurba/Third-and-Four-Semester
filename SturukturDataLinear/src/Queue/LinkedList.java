/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author old
 */
public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public void addBefore(int data, ListNode bantu) {
        /*
        ====ALGORITMA=======
        1. membuat simpul baru dengan data baru
        2. membuat simpul baru.next menunjuk pointer bantu
        3. membuat 
         */
        ListNode baru = new ListNode(data);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public int remove(ListNode bantu) {
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        size--;
        return bantu.elemen;
    }

    public int removeFirst() {
        return remove(head.next);

    }

    public int removeLast() {
        return remove(head.prev);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String tempt = "";
        ListNode bantu = head.next;
        while (bantu != head) {
            tempt = tempt + bantu.elemen + " ";
            bantu = bantu.next;
        }
        return tempt;
    }

    public ListNode Search(int search) {
        ListNode bantu = head.next;
        while (bantu != head) {
            if (bantu.elemen == search) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }
}


