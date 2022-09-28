/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTDelete012;

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
        root.setLeftNode(null);
        root.setRightNode(null);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insert(int value) {
        TreeNode baru = new TreeNode(value);
        if (getRoot() == null) {
            setRoot(baru);
        } else {
            TreeNode bantu = getRoot();
            while (true) {
                if (bantu.getData() >= baru.getData()) {
                    if (bantu.getLeftNode() != null) {
                        bantu = bantu.getLeftNode();
                    } else {
                        bantu.setLeftNode(baru);
                        baru.setParent(bantu);
                        return;
                    }
                } else {
                    if (bantu.getRightNode() != null) {
                        bantu = bantu.getRightNode();
                    } else {
                        bantu.setRightNode(baru);
                        bantu.setParent(bantu);
                        return;
                    }
                }
            }
        }
    }

    public TreeNode find(int data) {
        TreeNode bantu = getRoot();
        if (getRoot() == null) {
            return null;
        } else {
            while (bantu != null) {
                if (bantu.getData() == data) {
                    return bantu;
                } else {
                    if (bantu.getData() > data) {
                        bantu = bantu.getLeftNode();
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }
        return null;
    }

    public boolean delete(int value) {
        TreeNode parent = root;
        TreeNode bantu = root;
        boolean isLeftChild = false;
        while (bantu.getData() != value) {
            parent = bantu;
            if (bantu.getData() > value) {
                isLeftChild = true;
                bantu = bantu.getLeftNode();
            } else {
                isLeftChild = false;
                bantu = bantu.getRightNode();
            }
            if (bantu == null) {
                System.out.println("Data yang ingin dihapus tidak ditemukan");
            }
        }
        //Menghapus leaf atau 0 anak
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            if (bantu == root) {
                root = null;
            } else if (isLeftChild == true) {
                parent.setLeftNode(null);
            } else {
                parent.setRightNode(null);
            }

        }//Menghapus 2 anak
        else if (bantu.getLeftNode() != null && bantu.getRightNode() != null) {
            TreeNode prodec = getPredecessor(bantu);
            if (bantu == root) {
                setRoot(null);
            } else if (isLeftChild == true) {
                parent.setLeftNode(prodec);
            } else {
                parent.setRightNode(prodec);
            }
            prodec.setLeftNode(bantu.getLeftNode());
        }
        System.out.println(bantu.getData() + " Berhasil Dihapus");
        return true;
    }

    public TreeNode getParent(int x) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (x == bantu.getData()) {
                return parent;
            } else if (x < bantu.getData()) {
                parent = bantu;
                bantu = bantu.getLeftNode();
            } else {
                parent = bantu;
                bantu = bantu.getRightNode();
            }
        }
        return null;
    }

    public boolean isLeaf(int temp) {
        TreeNode bantu = find(temp);
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            return true;
        } else {
            return false;
        }
    }

    public TreeNode getPredecessor(TreeNode temp) {
        TreeNode bantu = temp;
        bantu = bantu.getLeftNode();
        while (bantu.getRightNode() != null) {
            bantu = bantu.getRightNode();
//            System.out.println(bantu.getData());
        }
        return bantu;
    }

    public TreeNode getSuccessor(TreeNode temp) {
        TreeNode bantu = temp;
        bantu = bantu.getRightNode();
        while (bantu.getLeftNode() != null) {
            bantu = bantu.getLeftNode();
        }
        return bantu;
    }

    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preOrder(localRoot.getLeftNode());
            preOrder(localRoot.getRightNode());

        }
    }

    public void preorderTransversal() {
        preOrder(getRoot());
    }

    public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.insert(75);
        pohon.insert(30);
        pohon.insert(21);
        pohon.insert(65);
        pohon.insert(89);
        pohon.insert(80);
        pohon.insert(97);
        pohon.preorderTransversal();
        System.out.println("");
//        System.out.println(pohon.getSuccessor(pohon.getRoot()).getData());
        System.out.println("Node predecessor: ");
        System.out.println(pohon.getPredecessor(pohon.getRoot()).getData());
        System.out.println("");
        pohon.delete(75);

        System.out.println("");
        pohon.preorderTransversal();

    }

}
