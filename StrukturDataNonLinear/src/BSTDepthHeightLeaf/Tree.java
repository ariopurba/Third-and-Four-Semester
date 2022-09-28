/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTDepthHeightLeaf;

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

    public void insertNode(TreeNode current, TreeNode value) {
        if (value.getData() < current.getData()) {
            if (current.getLeftNode() == null) {
                value = current.getLeftNode();
            } else {
                insertNode(current.getLeftNode(), value);
            }
        } else {
            if (current.getRightNode() == null) {
                value = current.getRightNode();
            } else {
                insertNode(current.getRightNode(), value);
            }
        }
    }
    //    public void insertNode(int value){
    //        TreeNode bantu = root;
    //        if (value < bantu.getData()) {
    //            if (bantu.getLeftNode() != null) {
    //                insertNode(value);
    //            }else{
    //                bantu = bantu.getLeftNode();
    //            }
    //        }else if(value > bantu.getData()){
    //            if (bantu.getRightNode() != null) {
    //                insertNode(value);
    //            }else{
    //                bantu = bantu.getRightNode();
    //            }
    //        }
    //    }
    //    public void insertNode(int key){
    //        root = insertNode(root, new TreeNode(key));
    //    }
    //    public TreeNode insertNode(TreeNode currentParent, TreeNode newNode) {
    //
    //    if (currentParent == null) {
    //        return newNode;
    //    } else if (newNode.key > currentParent.key) {
    //        currentParent.right = insertNode(currentParent.getRightNode(), newNode);
    //    } else if (newNode.key < currentParent.key) {
    //        currentParent.left = insertNode(currentParent.left, newNode);
    //    }

    //    return currentParent;
    //}
    //
    //    public void insert(TreeNode node, int value) {
    //        if (value < node.getData()) {
    //            if (node.getLeftNode() != null) {
    //                insert(node.getLeftNode(), value);
    //
    //            } else {
    //                node.getLeftNode() = new TreeNode(value);
    //            }
    //        }
    //        
    //    }
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

//    public int heightHelper(TreeNode localRoot) {
//        if (localRoot == null) {
//            return 0;
//        } else {
//            int leftHeight = heightHelper(localRoot.getLeftNode());
//            int rightHeight = heightHelper(localRoot.getRightNode());
//            if (leftHeight > rightHeight) {
//                return leftHeight + 1;
//            } else {
//                return rightHeight + 1;
//
//            }
//        }
//    }
//
//    public void height() {
//        heightHelper(root);
//    }
    public int findDepth(int data) {
        TreeNode bantu = root;
        int temp = 0;
        while (bantu.getData() != data) {
            if (data <= bantu.getData()) {
                bantu = bantu.getLeftNode();
                temp++;
            } else {
                bantu = bantu.getRightNode();
                temp++;
            }
            if (bantu == null) {
                return 0;
            }
        }
        System.out.println(temp);
        return temp;
    }

    public int findHeight(TreeNode localRoot) {
        if (localRoot == null) {
            return 0;
        } else {
            int left = findHeight(localRoot.getLeftNode());
            int right = findHeight(localRoot.getRightNode());
            if (left > right) {
                return 1 + left;
            } else {
                return 1 + right;
            }
        }

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

    public void leaf() {
        int count = leafHelper(root);
        if (root == null) {
            System.out.println("Tree Kosong");
        } else {
//            System.out.println(": ");
            System.out.println("Jumlah node Leaf: "+count);

        }
    }
//
//    public int leafCount(TreeNode node) {
//        int tampung;
//        if (node == null) {
//            return 0;
//        }
//        if (node.getLeftNode() == null && node.getRightNode() == null) {
//            return 1;
//        }else{
//            return leafCount(node.getLeftNode()+leafCount(node.getRightNode()));
//        }
//    }

    public int leafHelper(TreeNode localRoot) {
        TreeNode bantu = localRoot;
//        if (bantu != null) {
if (localRoot == null) {
            return 0;
        }
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            System.out.print(bantu.getData() + " ");
            return 1;
        } else {
            return leafHelper(localRoot.getLeftNode()) + leafHelper(localRoot.getRightNode());

//            }
        }
    }

    public void descendants(int data) {
        if (root == null) {
            System.out.println("Tree Kosong");
        } else {
            TreeNode bantu = root;
            while (bantu != null) {
                if (bantu.getData() == data) {
                    preorderHelper(bantu);
                    break;
                } else {
                    if (bantu.getData() > data) {
                        bantu = bantu.getLeftNode();
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }
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
        tree.leaf();
        System.out.println("");
        System.out.println("Descandents : ");
        tree.descendants(12);
        System.out.println("");
        System.out.println("Depth : ");
        tree.findDepth(38);
        System.out.println("Height : ");
        System.out.println(tree.findHeight(tree.root));
    }
}
