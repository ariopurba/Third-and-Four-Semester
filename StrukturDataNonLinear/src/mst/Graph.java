package mst;

import primalgorithm.*;
import graphbfs.*;
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

    private int maxVertex = 20;
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
                } else {
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

    public ArrayList<edge> getPrimEdges(char baru) {
        //Create variable for edge and data type arraylist
        ArrayList<edge> primEdges = new ArrayList();
        ArrayList<Integer> primVertexs = new ArrayList();
        int seed = 0;
//        int seed = indexVertex(seedVertex);
        primVertexs.add(seed);  //add seed to primVertex
        vertexList[seed].flagVisited = true; //set flag vertex true
        while (primVertexs.size() < countVertex) {
            int tempMinWeight = Integer.MAX_VALUE;
            int tempMinIndekVertexI = -1;
            int tempMinIndekVertexJ = -1;
            for (int i = 0; i < primVertexs.size(); i++) {
                for (int j = 0; j < countVertex; j++) {
                    if (adjencyMatrix[primVertexs.get(i)][j] > 0
                            && vertexList[j].flagVisited == false && adjencyMatrix[primVertexs.get(i)][j]
                            < tempMinWeight) {
                        tempMinWeight = adjencyMatrix[i][j];
                        tempMinIndekVertexI = primVertexs.get(i);
                        tempMinIndekVertexJ = j;
                    }
                }
            }
            primVertexs.add(tempMinIndekVertexJ);
            vertexList[tempMinIndekVertexJ].flagVisited = true;
            //
            edge tepi = new edge();
//            Vertex x = (int) tempMinIndekVertexI;
            tepi.setVertexA(tempMinIndekVertexI);
            tepi.setVertexB(tempMinIndekVertexJ);
            tepi.setWeight(adjencyMatrix[tempMinIndekVertexI][tempMinIndekVertexJ]);
            primEdges.add(tepi);
        }
//        setFlagFalse();
        return primEdges;
    }

    public void setFlagFalse() {
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].flagVisited = false;
        }
    }

//    public String displayVertex(int vertex){
//        return vertexList[vertex].label;
//    }
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

    public void showEdges(ArrayList<edge> seed) {
        System.out.println("MST :(" + vertexList[seed.get(1).getVertexA()].label + ")");
        int tot = 0;
        for (int i = 0; i < seed.size(); i++) {
            System.out.println(vertexList[seed.get(i).getVertexA()].label+ " Terhubung dengan "
            +vertexList[seed.get(1).getVertexB()].label+ " Dengan Jarak "+seed.get(i).getWeight());
            vertexList[i].flagVisited = false;
        }
        for (int i = 0; i < seed.size(); i++) {
            tot += seed.get(i).getWeight();
        }
        System.out.println("\n Total Jarak MST : "+tot);
        setFlagFalse();
    }
     
}
