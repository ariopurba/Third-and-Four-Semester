/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primalgorithm;

import java.util.*;

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
        test.addVertex('E');
        test.addVertex('F');
        test.addVertex('G');
        test.addVertex('H');
        test.addVertex('I');
        test.addVertex('J');
        test.addEdge('A', 'B', 5);
        test.addEdge('A', 'C', 5);
        test.addEdge('B', 'D', 4);
        test.addEdge('B', 'E', 9);
        test.addEdge('C', 'D', 4);
        test.addEdge('C', 'F', 7);
        test.addEdge('D', 'E', 8);
        test.addEdge('D', 'F', 6);
        test.addEdge('E', 'F', 10);
        test.addEdge('E', 'G', 10);
        test.addEdge('E', 'I', 9);
        test.addEdge('E', 'H', 8);
        test.addEdge('F', 'G', 3);
        test.addEdge('G', 'H', 6);
        test.addEdge('G', 'J', 7);
        test.addEdge('H', 'I', 4);
        test.addEdge('H', 'J', 6);
        test.addEdge('I', 'J', 7);
        test.showEdges(test.getPrimEdges('A'));
        System.out.println("\n");
        System.out.print("Depth First Search (DFS) : ");
        test.dfs();
        System.out.println("");
        System.out.print("Breath First Search (BFS) : ");
        test.bfs();
//        test.show();
//        ArrayList<edge> tepi = test.getPrimEdges();
//        for (int i = 0; i < tepi.size(); i++) {
//            System.out.println(tepi.get(i).getVertexA()+" ==> "+tepi.get(i).getVertexB()+" dengan jarak "+tepi.get(i).getWeight());
//        System.out.println(tepi);
//        tepi.toString();
//        }
//        System.out.println(test.getPrimEdges());
//        System.out.println("");

//        System.out.println("\n");
//        System.out.println("Adjency Matrix : ");
//        System.out.println(test.toString());
    }
}
