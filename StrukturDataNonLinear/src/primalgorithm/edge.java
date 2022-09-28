/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primalgorithm;

/**
 *
 * @author old
 */
public class edge {

    private int vertexA;
    private int vertexB;
    private int weight;

    public edge() {

    }

    public edge(int vertexA, int vertexB) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
    }

    public int getVertexA() {
        return vertexA;
    }

    public void setVertexA(int vertexA) {
        this.vertexA = vertexA;
    }

    public int getVertexB() {
        return vertexB;
    }

    public void setVertexB(int vertexB) {
        this.vertexB = vertexB;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

   

}
