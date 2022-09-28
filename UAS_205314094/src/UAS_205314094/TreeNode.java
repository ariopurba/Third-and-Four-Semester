/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_205314094;





/**
 *
 * @author Ario Purba
 */
public class TreeNode <E> {

    private E Data;
    private TreeNode<E> leftNode;
    private TreeNode<E> rightNode;
    private TreeNode<E> parent;

    public TreeNode(E Data) {
        this.Data = Data;
    }

    public E getData() {
        return (E)Data;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public void setData(E Data) {
        this.Data = Data;
    }

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<E> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<E> rightNode) {
        this.rightNode = rightNode;
    }

}
