/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_205314094;

/**
 *
 * @author 205314094
 */
public class Tree {

    private TreeNode root;
    int internalCount;
    
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

    public void leaf() {
        System.out.print("Leaf dari Tree : ");

        int count = leafHelper(root);
        if (root == null) {
            System.out.println(" Kosong");
        } else {
            System.out.println("\nJumlah Node Leaf: " + count);

        }
    }

    public void postorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.getLeftNode());
            postorderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void postTranserversal() {
        System.out.println("Post Order = ");

        postorderHelper(root);
        System.out.println();
    }

    public int leafHelper(TreeNode localRoot) {
        TreeNode bantu = localRoot;

        if (localRoot == null) {
            return 0;
        }
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            System.out.print(bantu.getData() + " ");
            return 1;
        } else {
            return leafHelper(localRoot.getLeftNode()) + leafHelper(localRoot.getRightNode());

        }
    }

    public void internalHelper(TreeNode localRoot) {
      if(localRoot!=null){
            if(localRoot.isInternal()==true){
                System.out.print(localRoot.getData()+" ");
                internalCount++;
            }
            internalHelper(localRoot.getLeftNode());
            internalHelper(localRoot.getRightNode());
        }
    }

    public void internal() {
      if(root != null){
            System.out.print("Internal Node yang ada di dalam Tree: ");
            internalHelper(root);
            System.out.println("\nSebanyak "+internalCount+" node");
        }

}
}