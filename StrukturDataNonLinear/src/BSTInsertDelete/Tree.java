/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTInsertDelete;

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
        /*
        === Algoritma ===
        1. Jika root masih kosong maka menset root dari data baru
        2. Jika root terisi mengecek besar atau kecil data baru
        3. jika data baru < root maka baru ke left node
                jika node left terisi maka data baru ditentukan
        4. jika data baru > root maka baru ke right node
        5. jika data baru < root akan ke left node  
         */
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
                        break;
                    }
                } else {
                    if (bantu.getRightNode() != null) {
                        bantu = bantu.getRightNode();
                    } else {
                        bantu.setRightNode(baru);
                        break;
                    }
                }
            }
        }

    }

    public TreeNode delete(int data) {
        TreeNode bantu = root;
        if (bantu == null) {
            return null;
        } else {
            while (true) {
                if (bantu.getData() < data) {
                    bantu = bantu.getRightNode();
                    if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
                        bantu = null;
                    } else if (bantu.getLeftNode() == null || bantu.getRightNode() == null) {
                        if (bantu.getLeftNode() != null) {
                            TreeNode baru = bantu.getLeftNode();
                            bantu = null;
                            return baru;
                        } else {
                            TreeNode baru = bantu.getRightNode();
                            bantu = null;
                            return baru;
                        }
                    } else {
                        
                            
                        }
//                        TreeNode baru = findMaximum();
//                    }else {

                }
                }
            }
        }
    
    public void preorder() {
        preorder(root);
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        preorder(root.getLeftNode());
        preorder(root.getRightNode());
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.getLeftNode());
            System.out.print(root.getData() + " ");
            inOrder(root.getRightNode());
        }
    }
    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            System.out.print(root.getData() + " ");
        }
    }

    public int findMinimum() {
        if (root == null) {
            return -1;
        }
        TreeNode bantu = this.root;
        while (bantu.getLeftNode() != null) {
            bantu = bantu.getLeftNode();
        }
        return (bantu.getData());
    }

    public int findMaximum() {
        if (root == null) {
            return -1;
        }
        TreeNode bantu = this.root;
        while (bantu.getRightNode() != null) {
            bantu = bantu.getRightNode();
        }
        return (bantu.getData());
    }

    public TreeNode search(int data) {
        /*
        
        ===ALGORITMA===
        1. membuat simpul bantu menunjuk sama dengan root
        2. mengecek nilai data dicari dengan bantu
        3. jika kurang dari
        4. maka bantu menunjuk ke kiri node
        5. jika besar dari 
        6. maka bantu ke kanan node
        7. jika data yang di cari kosong mereturn null
         */

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

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(42);
        t.insert(21);
        t.insert(38);
        t.insert(27);
        t.insert(71);
        t.insert(82);
        t.insert(55);
        t.insert(63);
        t.insert(6);
        t.insert(2);
        t.insert(40);
        t.insert(12);
        System.out.println("Data Prerder");
        t.preorder();
        System.out.println("");
        System.out.println("Data InOrder");
        t.inOrder();
        System.out.println("");
        System.out.println("Data Post Order");
        t.postOrder();
//        TreeNode found = t.search(3);
//        if (found != null) {
//            System.out.println("Data dicari Di temukan");
//        } else {
//            System.out.println("Data dicari Tidak Ditemukan");
//        }
    }
}

//        t.search(82);
//        t.search(0);
//        System.out.println(t.findMinimum());
//        System.out.println(t.findMaximum());
//        int search = 3;

