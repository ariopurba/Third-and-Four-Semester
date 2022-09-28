/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

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
//    public void insert(int data) {
//        TreeNode baru = new TreeNode(data);
//        TreeNode bantu = root;
//
//        if (root == null) {
//            root = new TreeNode(data);
//        } else {
//            while (true) {
//                if (bantu.getData() < baru.getData()) {
//                    if (bantu.getRightNode() != null) {
//                        bantu = bantu.getRightNode();
//                    } else {
//                        bantu.setRightNode(baru);
//                        break;
//                    }
//                } else {
//                    if (bantu.getLeftNode() != null) {
//                        bantu = bantu.getLeftNode();
//                    } else {
//                        bantu.setLeftNode(baru);
//                        break;
//                    }
//                }
//            }
//        }
//    }

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
        System.out.println("===Data Inorder===");
        tree.inorderTransversal();

//    public void preorderHelp() {
//        preorder(root);
//    }
//
//    public void preorder(TreeNode localRoot) {
//        if (localRoot != null) {
//
//            System.out.println(localRoot.getData() + " ");
//            preorder(localRoot.getLeftNode());
//            preorder(localRoot.getRightNode());
//        }
//    }
//    public static void main(String[] args) {
//        Tree tree = new Tree();
//        tree.insert(89);
//        tree.insert(45);
//        tree.insert(5);
//        tree.insert(4);
//        tree.insert(34);
//        tree.inorderTraversal();
//    }
    }
}
//    private TreeNode root;
//
//    public Tree(TreeNode root) {
//        this.root = root;
//
//    }
//
//    public Tree() {
//
//    }
//
//    public void insert(int data) {
//        TreeNode baru = new TreeNode(data);
//        TreeNode bantu = root;
//
//        if (root == null) {
//           root= new TreeNode(data);
//        } else {
//            while (true) {
//                if (bantu.getData() >= baru.getData()) {
//                    if (bantu.getLeftNode() != null) {
//                         bantu = bantu.getLeftNode();
//                    } else {
//                        bantu.setLeftNode(baru);
//                        break;
//                    }
//                } else {
//                    if (bantu.getRightNode() != null) {
//                         bantu = bantu.getRightNode();
//                    } else {
//                        bantu.setRightNode(baru);
//                        break;
//                       
//                    }
//                }
//            }
//        }
//    }
//    public void insertRekursif(int data){
//        root = insertHelper(data, root);
//    }
//    public TreeNode insertHelper(int data, TreeNode localRoot){
//        if (localRoot == null) {
//            localRoot = new TreeNode(data);
//            return localRoot;
//        }
//        if (localRoot.getData() >= data) {
//            localRoot.setLeftNode(insertHelper(data, localRoot.getLeftNode()));
//            
//        }else{
//            localRoot.setRightNode(insertHelper(data, localRoot.getRightNode()));
//        }
//        return localRoot;
//    }
//
//    public TreeNode search(int data) {
//        TreeNode bantu = root;
//        if (root == null) {
//            return null;
//        } else {
//            while (bantu != null) {
//                if (data == bantu.getData()) {
//                    return bantu;
//                } else {
//                    if (bantu.getData() >=data) {
//                        bantu = bantu.getLeftNode();                        
//                    } else {
//                        bantu = bantu.getRightNode();
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    public TreeNode getRoot() {
//        return root;
//    }
//
//    public void setRoot(TreeNode root) {
//        this.root = root;
//    }
//       public void preorderHelper(TreeNode localRoot) {
//        if (localRoot != null) {
//            System.out.print(localRoot.getData() + " ");
//            preorderHelper(localRoot.getLeftNode());
//            preorderHelper(localRoot.getRightNode());
//        }
//    }
//
//    public void preorderTraversal() {
//        preorderHelper(root);
//    }
//
//    public void inorderHelper(TreeNode localRoot) {
//        if (localRoot != null) {
//            inorderHelper(localRoot.getLeftNode());
//            System.out.print(localRoot.getData() + " ");
//            inorderHelper(localRoot.getRightNode());
//        }
//    }
//
//    public void inorderTransversal() {
//        inorderHelper(root);
//    }
//
//    public void postorderHelper(TreeNode localRoot) {
//        if (localRoot != null) {
//            postorderHelper(localRoot.getLeftNode());
//            postorderHelper(localRoot.getRightNode());
//            System.out.print(localRoot.getData() + " ");
//        }
//    }
//
//    public void postTranserversal() {
//        postorderHelper(root);
//    }
//    public static void main(String[] args) {
//        Tree tree = new Tree();
//        tree.insert(42);
//        tree.insert(21);
//        tree.insert(38);
//        tree.insert(27);
//        tree.insert(71);
//        tree.insert(82);
//        tree.insert(55);
//        tree.insert(63);
//        tree.insert(6);
//        tree.insert(2);
//        tree.insert(40);
//        tree.insert(12);
//        System.out.println("===Data PreOrder===");
//        tree.preorderTraversal();
//    }
//}
