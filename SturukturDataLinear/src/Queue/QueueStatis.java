/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

//import java.util.NoSuchElementException;

import java.util.*;


/**
 *
 * @author old
 */
public class QueueStatis {

    public int[] element;
    public int front;
    public int rear;
    public int size;

    public QueueStatis() {
    }

    public QueueStatis(int ukuran) {
        element = new int[ukuran];
    }

    boolean enqueue(int data) {
        /*
        Proses penambahan data di posisi rear atau belakang
        Penambahan akan ada jika queue tidak penuh
        Jika Masih kosong maka ditambah front dan rear 1
        JIka ada elemen rear tambah 1
        */
                
        if (size < element.length) { //cek ukuran elemen besar dari size
            element[rear] = data;
            if (rear == element.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            size++;
            return true;
        } else {
            return false;
        }
    }

    int dequeue() {
        if (!isEmpty()) {
            int hapus = element[front];
            if (front == element.length - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            return hapus;
        }else{
            throw new NoSuchElementException();
        }
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    int size(){
        return size;
    }
    void display(){
        if (size == 0) {
            System.out.println("Data Masih Kosong");
        }else{
            for (int i = 0; i <= size; i++) {
                System.out.print(element[i]+ ", ");
            }
        }
        
    }
    public static void main(String[] args) {
        QueueStatis antrian = new QueueStatis(7);
        antrian.enqueue(23);
        antrian.enqueue(21);
        antrian.enqueue(12);
        antrian.dequeue();
        antrian.dequeue();
        antrian.display();
    }

}
