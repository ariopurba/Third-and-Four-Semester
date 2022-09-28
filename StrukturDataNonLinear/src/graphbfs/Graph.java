package graphbfs;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author old 
 */
public class Graph {

    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(char label) {
        vertexList[countVertex] = new Vertex(label);
        countVertex++;
    }

    public void addEdge(int data1, int data2, int edge) {
        adjencyMatrix[data1][data2] = edge;
        adjencyMatrix[data2][data1] = edge;
    }

    public void addEdge(char data1, char data2, int edge) {
        addEdge(indexVertex(data1), indexVertex(data2), edge);

    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == label) {
                return i;
            }
        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjencyMatrix[i][j] > 0) {
                    System.out.println(vertexList[i].label + " "
                            + "terhubung ke " + vertexList[j].label + ""
                            + " dengan beban " + adjencyMatrix[i][j]);
                }
            }
        }
    }

    public void dfs() {
        int seed = 0;
        Stack baru = new Stack();
        baru.push(seed);
        while (!baru.isEmpty()) {
            int bantu = (int) baru.pop();
            if (!vertexList[bantu].flagVisited) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjencyMatrix[bantu][i] >= 1 && !vertexList[i].flagVisited == true) {
                        baru.push(i);
                    }
                }
            }
        }

        System.out.println("\n");
        setFlagFalse();

    }

    public void bfs() {
        int seed = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(seed);
        while (!queue.isEmpty()) {
            int bantu = (int) queue.remove();
            if (!vertexList[bantu].flagVisited) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
                for (int i = 0; i < countVertex; i++) {
                    if (adjencyMatrix[bantu][i] >= 1 && !vertexList[i].flagVisited) {
                        queue.add(i);
                    }
                }
            }
        }
        System.out.println("\n");
        setFlagFalse();

    }

    public void setFlagFalse() {
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].flagVisited = false;
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(" " + adjencyMatrix[i][j]);
            }
            System.out.println("");
        }
        return "";
    }

}
