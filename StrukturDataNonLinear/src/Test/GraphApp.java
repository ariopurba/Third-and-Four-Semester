/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author old
 */
public class GraphApp {

    public static void main(String[] args) {

        Graph test = new Graph();
        test.addVertex('A');
        test.addVertex('B');
        test.addEdge('A', 'B', 4);
        test.show();
    }
}
