/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree4;

import java.awt.event.KeyListener;

/**
 *
 * @author old
 */
public class Tree {

    private TreeNode root;

    public Tree() {

    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insert(int data) {
        TreeNode baru = new TreeNode(data);
        if (root == null) {
            root = new TreeNode(baru.getData());
        } else {
            TreeNode bantu = root;
            while (true) {
                if (bantu.getData() >= baru.getData()) {
                    if (bantu.getLeftNode() != null) {
                        bantu = bantu.getLeftNode();
                    } else {
                        bantu.setLeftNode(baru);
                        baru.setParent(bantu);
                        break;
                    }
                } else {
                    if (bantu.getRightNode() != null) {
                        bantu = bantu.getRightNode();
                    } else {
                        bantu.setRightNode(baru);
                        baru.setParent(bantu);
                        break;
                    }
                }
            }
        }
    }

    public TreeNode find(int data) {
        TreeNode bantu = root;
        if (root == null) {
            return null;
        } else {
            while (bantu != null) {
                if (bantu.getData() == data) {
                    return bantu;
                } else {
                    if (data > bantu.getData()) {
                        bantu = bantu.getRightNode();
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderHelper(localRoot.getLeftNode());
            preorderHelper(localRoot.getRightNode());
        }
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void inorderTransversal() {
        inorderHelper(root);
    }

    public void postorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.getLeftNode());
            postorderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void postTranserversal() {
        postorderHelper(root);
    }
//    public boolean isLeaf(int data){
//        TreeNode bantu = 
//    }

    public boolean delete1(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getLeftNode() == data) {
            if (data.getLeftNode() == null) {
                parent.setLeftNode(null);
            } else {
                parent.setLeftNode(data.getRightNode());
                data.getRightNode().setParent(parent);
                data = null;
                return true;
            }
        } else {
            if (data.getLeftNode() == null) {
                parent.setRightNode(data.getLeftNode());
                data.getLeftNode().setParent(parent);
                data = null;
                return true;
            } else {
                parent.setRightNode(data.getRightNode());
                data.getRightNode().setParent(parent);
                data = null;
                return true;
            }
        }

        return false;
    }

    public boolean delete0(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getLeftNode() == null) {
            parent.setLeftNode(null);
            return true;
        } else {
            parent.setRightNode(null);
            return true;
        }
    }

    public boolean delete(int data) {
        TreeNode node = find(data);
        boolean tampung = false;
        if (node != null) {
            if (node.getRightNode() == null && node.getLeftNode() == null) {
                tampung = delete0(node);

            } else if (node.getRightNode() == null || node.getLeftNode() == null) {
                tampung = delete1(node);
            }
        }
        return tampung;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(42);
        tree.insert(21);
        tree.insert(38);
        tree.insert(27);
        tree.insert(71);
        tree.insert(82);
        tree.insert(55);
        tree.insert(63);
        tree.insert(6);
        tree.insert(2);
        tree.insert(40);
        tree.insert(12);
        System.out.println("===Data PreOrder===");
        tree.preorderTraversal();
//        System.out.println("\n");
//        System.out.println("===Data InOrder===");
//        tree.inorderTransversal();
//        System.out.println("\n");
//        System.out.println("===Data PostOrder===");
//        tree.postTranserversal();
        tree.delete(12);

        System.out.println("");
        System.out.println("===Data PreOrder Setelah dihapus===");
        tree.preorderTraversal();
        tree.delete(27);
        System.out.println("");
        tree.preorderTraversal();
        System.out.println("");

        tree.delete(6);
        tree.preorderTraversal();
        System.out.println("");

        tree.delete(55);
        tree.preorderTraversal();

    }
}
