/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST01;

/**
 *
 * @author old
 */
public class TreeNode {
    private int Data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;
    
    public TreeNode(int Data){
        this.Data = Data;
    }
    public int getData(){
        return Data;
    }
    public void setData(int Data){
        this.Data = Data;
    }
    public TreeNode getLeftNode(){
        return leftNode;
    }
    public void setLeftNode(TreeNode leftNode){
        this.leftNode = leftNode;
    }
    public TreeNode getRightNode(){
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    
}
