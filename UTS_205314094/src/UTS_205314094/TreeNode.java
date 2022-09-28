/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_205314094;

/**
 *
 * @author 205314094
 */
public class TreeNode {

    private int Data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int Data) {
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isInternal() {
        if (leftNode == null && rightNode == null) {
            return false;
        } else {
            return true;
        }
    }
}