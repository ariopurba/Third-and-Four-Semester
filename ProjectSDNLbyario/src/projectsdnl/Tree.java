/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsdnl;

/**
 *
 * @author Ribka Restu
 */
public class Tree {

    private TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public Tree() {

    }
    public void insert(Object data) {
        root = insertHelper(data, root);
    }

    public TreeNode insertHelper(Object data, TreeNode localRoot) {
        if (localRoot == null) {
            localRoot = new TreeNode(data);
            return localRoot;
        }
         if (((Comparable)data).compareTo(localRoot.getData())< 0 ||((Comparable)data).compareTo(localRoot.getData())==0) {
//        if (localRoot.getData() >= data) {
            localRoot.setLeftNode(insertHelper(data, localRoot.getLeftNode()));
            localRoot.getLeftNode().setParent(localRoot);
        } else {
            localRoot.setRightNode(insertHelper(data, localRoot.getRightNode()));
            localRoot.getRightNode().setParent(localRoot);
        }

        return localRoot;

    }

    public TreeNode getCurrent(Object data) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (((Comparable)data).compareTo(bantu.getData()) == 0) {
                return bantu;
            } else {
                if (((Comparable)data).compareTo(bantu.getData())<0) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }

        return null;
    }

    public void preorderTraversal() {
        System.out.println("Pre-order traversal : ");
        preorderHelper(root);
        System.out.println();
    }

    public void preorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderHelper(localRoot.getLeftNode());
            preorderHelper(localRoot.getRightNode());
        }
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void inorderTraversal() {
        System.out.println("In order traversal : ");
        inorderHelper(root);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void postorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.getLeftNode());
            postorderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void postorderTraversal() {
        System.out.println("Post-order traversal : ");
        postorderHelper(root);
    }

    public boolean delete(Object data) {
        TreeNode node = getCurrent(data);
        boolean cek = false;
        if (node != null) {
            if (isLeaf(node.getData())) {
                cek = delete0(node);
            } else if (node.getRightNode() == null || node.getLeftNode() == null) {
                cek = delete1(node);
            } else {
                cek = delete2(node);
            }
        }
        return cek;
    }

    public boolean delete0(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getRightNode() == data) {
            parent.setRightNode(null);
            return true;
        } else {
            parent.setLeftNode(null);
            return true;
        }
    }

    public boolean delete1(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getLeftNode() == data) {
            if (data.getLeftNode() != null) {
                parent.setLeftNode(data.getLeftNode());
                data.getLeftNode().setParent(parent);
                setNull(data);
                return true;
            } else {
                parent.setLeftNode(data.getRightNode());
                data.getRightNode().setParent(parent);
                setNull(data);
                return true;
            }
        } else {
            if (data.getLeftNode() != null) {
                parent.setRightNode(data.getLeftNode());
                data.getLeftNode().setParent(parent);
                setNull(data);
                return true;
            } else {
                parent.setRightNode(data.getRightNode());
                data.getRightNode().setParent(parent);
                setNull(data);
                return true;
            }
        }
    }

    public void setNull(TreeNode data) {
        data.setParent(null);
        data.setRightNode(null);
        data.setLeftNode(null);
        data.setParent(null);
        data.setData(0);
    }

    public boolean isLeaf(Object data) {
        TreeNode node = getCurrent(data);
        if (node != null) {
            if (node.getRightNode() == null && node.getLeftNode() == null) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println(data + " tidak ditemukan");
            return false;
        }
    }

    public TreeNode getPredeccessor(TreeNode node) {
        if (getCurrent(node.getData()) != null) {
            TreeNode bantu = node.getLeftNode();
            while (bantu.getRightNode() != null) {
                bantu = bantu.getRightNode();
            }
            return bantu;
        } else {
            return null;
        }
    }

    public boolean delete2(TreeNode hapus) {
        TreeNode parentPre = getPredeccessor(hapus).getParent();
        TreeNode parentHapus = hapus.getParent();
        TreeNode predeccessor = getPredeccessor(hapus);
        TreeNode kiri, kanan;

        if (parentPre != hapus) {
            parentPre.setRightNode(null);
            if (parentHapus == null) {

                this.root = predeccessor;
                predeccessor.setParent(null);
                predeccessor.setRightNode(hapus.getRightNode());
                predeccessor.setLeftNode(hapus.getLeftNode());
                predeccessor.getRightNode().setParent(predeccessor);
                predeccessor.getLeftNode().setParent(predeccessor);
                return true;

            }
            if (parentHapus.getLeftNode() == hapus) {
                parentHapus.setLeftNode(predeccessor);
                kiri = parentHapus.getLeftNode();
                kiri.setParent(parentHapus);
                kiri.setRightNode(hapus.getRightNode());
                kiri.getRightNode().setParent(kiri);
                kiri.setLeftNode(hapus.getLeftNode());
                kiri.getLeftNode().setParent(kiri);
                return true;
            } else {
                parentHapus.setRightNode(predeccessor);
                kanan = parentHapus.getRightNode();
                kanan.setParent(parentHapus);
                kanan.setLeftNode(hapus.getLeftNode());
                kanan.getLeftNode().setParent(kanan);
                kanan.setRightNode(hapus.getRightNode());
                kanan.getRightNode().setParent(kanan);
                return true;
            }
        } else {
            if (parentHapus.getLeftNode() == hapus) {
                parentHapus.setLeftNode(predeccessor);
                kiri = parentHapus.getLeftNode();
                kiri.setParent(parentHapus);
                return true;
            } else {
                parentHapus.setRightNode(predeccessor);
                kanan = parentHapus.getRightNode();
                kanan.setParent(parentHapus);
                return true;
            }
        }

    }
}


