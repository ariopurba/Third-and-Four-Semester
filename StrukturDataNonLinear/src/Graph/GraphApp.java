/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author old
 */
public class GraphApp {

    public static void main(String[] args) {
        Graph test = new Graph();
        test.addVertex('a');
        test.addVertex('b');
        test.addVertex('c');
        test.addVertex('e');
        test.addVertex('f');
        test.addEdge('a', 'b', 4);
        test.addEdge('a', 'f', 5);
        test.addEdge('b', 'f', 2);
        test.addEdge('b', 'c', 5);
        test.addEdge('b', 'e', 4);
        test.addEdge('f', 'c', 3);
        test.addEdge('f', 'e', 10);
        test.addEdge('e', 'c', 2);
        test.show();

    }
}
