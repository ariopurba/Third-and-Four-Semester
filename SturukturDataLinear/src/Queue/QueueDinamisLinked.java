/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author old
 */
public class QueueDinamisLinked {

    public LinkedList antrian;

    public QueueDinamisLinked() {
        antrian = new LinkedList();
    }

    public QueueDinamisLinked(LinkedList antrian) {
        this.antrian = antrian;
    }

    public void enqueue(int data) {
        antrian.addLast(data);
    }

    public int dequeue() {
        return antrian.removeFirst();
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        if (antrian.size() == -1) {
            return true;
        }
        return false;
    }

    public void cetak() {
        System.out.println(antrian.toString());
    }

    public static void main(String[] args) {
        QueueDinamisLinked antri = new QueueDinamisLinked();
        antri.enqueue(12);
        antri.enqueue(43);
        antri.enqueue(21);
        antri.enqueue(13);
        antri.dequeue();
        antri.cetak();
    }
}
