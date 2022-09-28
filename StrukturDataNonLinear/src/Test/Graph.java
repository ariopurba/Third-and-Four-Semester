/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author old
 */
public class Graph {

    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        //membuat vertex list menjadi nilai max vertex
        vertexList = new Vertex[maxVertex];
        //set adjacency matrix menjadi nilai max vertex
        adjacencyMatrix = new int[maxVertex][maxVertex];
        //membuat perulangan untuk mengeset adjacancy menjadi nol
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(char label) {
        vertexList[countVertex] = new Vertex(label);
        countVertex++;

    }

    public void addEdge(int data1, int data2, int edge) {
        adjacencyMatrix[data1][data2] = edge;
        adjacencyMatrix[data2][data1] = edge;
    }

    public void addEdge(char data1, char data2, int edge) {
        addEdge(indexVertex(data1), indexVertex(data2), edge);
    }

    public int indexVertex(char label) {
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
                if (adjacencyMatrix[i][j] > 0) {
                    System.out.println(vertexList[i].label + " Terhubung "
                            + "ke " + vertexList[j].label + " dengan beban "
                            + adjacencyMatrix[i][j]);

                }
            }
        }
    }
}
