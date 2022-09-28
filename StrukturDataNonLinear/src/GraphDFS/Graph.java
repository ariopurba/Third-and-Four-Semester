
package GraphDFS;

import java.util.Stack;


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
                    System.out.println(vertexList[i].label+" "
                            + "terhubung ke "+vertexList[j].label+""
                             + " dengan beban "+adjencyMatrix[i][j]);
                }
            }
        }
    }
    public void dfs(){
        int seed = 0;
        Stack baru = new Stack();
        baru.push(seed);
        while( baru != null){
            int bantu = (int)baru.pop();
             if (!vertexList[bantu].flagVisited) {
                 System.out.print(vertexList[bantu].label+ " ");
                 vertexList[bantu].flagVisited = true;
                 for (int i = countVertex; i >= 0; i--) {
                     if (adjencyMatrix[bantu][i] >= 1 && !vertexList[i].flagVisited == true) {
                         baru.push(i);
                     }
                 }
            }else{
                 break;
             }
        }
    }


    @Override
    public String toString() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(" "+adjencyMatrix[i][j]);
            }
            System.out.println("");
        }
        return "";
    }
    
}
