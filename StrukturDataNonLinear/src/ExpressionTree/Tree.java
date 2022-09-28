/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */


public class Tree {

    private TreeNode root;

    public Tree() {
        root = null;
    }
    public TreeNode getRoot(){
        return root;
    }

    public void setRootTree(TreeNode treeNode) {
        root = treeNode;
    }

    public void insertNode(char insertValue) {
        if (root == null) {
            root = new TreeNode(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preorderTransversal() {
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode);
        System.out.print(node.data + " ");
        inorderHelper(node.rightNode);

    }

    public void postorderTransersal() {
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode node) {
        if (node == null) {
            return;

        }
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.print(node.data+" ");
    }

}
