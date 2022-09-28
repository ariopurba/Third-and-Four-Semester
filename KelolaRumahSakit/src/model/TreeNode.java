/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author old
 */
public class TreeNode<T> {

    private T data;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;
    private TreeNode<T> parent;

    public TreeNode(T data) {
        this.data = data;
    }

//    public int umur, no_hp;
//    public String nama, alamat, penyakit, jenis_kelamin;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int umur, int no_hp, String nama, String alamat, String penyakit, String jenis_kelamin, TreeNode left, TreeNode right) {
//        this.umur = umur;
//        this.no_hp = no_hp;
//        this.nama = nama;
//        this.alamat = alamat;
//        this.penyakit = penyakit;
//        this.jenis_kelamin = jenis_kelamin;
//        left = right = null;
//    }
    public T getData() {
        return (T) data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

}
