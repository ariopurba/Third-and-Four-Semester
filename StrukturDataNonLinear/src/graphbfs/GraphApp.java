/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphbfs;

import GraphDFS.*;

/**
 *
 * @author old
 */
public class GraphApp {

    public static void main(String[] args) {
        Graph test = new Graph();
        test.addVertex('A');
        test.addVertex('B');
        test.addVertex('C');
        test.addVertex('D');
        test.addVertex('F');
        test.addVertex('G');
        test.addVertex('H');
        test.addEdge('A', 'B', 5);
        test.addEdge('A', 'F', 4);
        test.addEdge('A', 'D', 7);
        test.addEdge('B', 'D', 6);
        test.addEdge('B', 'C', 7);
        test.addEdge('C', 'G', 9);
        test.addEdge('C', 'H', 15);
        test.addEdge('C', 'D', 6);
        test.addEdge('D', 'G', 5);
        test.addEdge('F', 'G', 9);
        test.addEdge('G', 'H', 8);
        test.show();
        System.out.println("");
        System.out.print("Depth First Search (DFS) : ");
        test.dfs();
        System.out.println("");
        System.out.print("Breath First Search (BFS) : ");
        test.bfs();
        System.out.println("\n");
        System.out.println("Adjency Matrix : ");
        System.out.println(test.toString());
    }
}
