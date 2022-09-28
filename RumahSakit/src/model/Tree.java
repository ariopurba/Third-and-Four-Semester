/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author old
 */
public class Tree<T> {

    private TreeNode<T> root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public Tree() {

    }

    public void insert(T data) {
        root = insertHelper(data, root);
    }

    public TreeNode<T> insertHelper(T data, TreeNode<T> localRoot) {
        if (localRoot == null) {
            localRoot = new TreeNode(data);
            return localRoot;
        }
        if (((Comparable) data).compareTo(localRoot.getData()) < 0 || ((Comparable) data).compareTo(localRoot.getData()) == 0) {
            localRoot.setLeftNode(insertHelper(data, localRoot.getLeftNode()));
            localRoot.getLeftNode().setParent(localRoot);
        } else {
            localRoot.setRightNode(insertHelper(data, localRoot.getRightNode()));
            localRoot.getRightNode().setParent(localRoot);
        }
        return localRoot;
    }

    public TreeNode<T> getCurrent(T data) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (((Comparable) data).compareTo(bantu.getData()) == 0) {
                return bantu;
            } else {
                if (((Comparable) data).compareTo(bantu.getData()) < 0) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }
        return null;
    }

    public void preorderTraversal() {
        System.out.println("Pre Order Traversal : ");
        preorderHelper(root);
        System.out.println();
    }

    public void preorderHelper(TreeNode<T> localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.getData() + " ");
            preorderHelper(localRoot.getLeftNode());
            preorderHelper(localRoot.getRightNode());
        }
    }

    public int countNodes(TreeNode<T> r) {
        if (r == null) {
            return 0;
        } else {
            int jumlah = 1;
            jumlah += countNodes(r.getRightNode());
            jumlah += countNodes(r.getLeftNode());
            return jumlah;
        }
    }

    public void deleteBST(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        deleteBST(root.getLeftNode());
        deleteBST(root.getRightNode());
        root = null;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inorderHelper(TreeNode<T> localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.println(localRoot.getData());
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void inorderTraversal() {
        System.out.println("Nama\t\tJenis Kelamin\t\tPenyakit\t\tId\t\tNo Kamar: ");
        System.out.println("=========================================================================================");
        inorderHelper(root);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void postorderHelper(TreeNode<T> localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.getLeftNode());
            postorderHelper(localRoot.getRightNode());
            System.out.println(localRoot.getData() + " ");
        }
    }

    public void postorderTraversal() {
        System.out.println("Post Order Traversal: ");
        postorderHelper(root);
    }

    public boolean delete(T data) {
        TreeNode<T> node = getCurrent(data);
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

    public boolean delete0(TreeNode<T> data) {
        TreeNode parent = data.getParent();
        if (data == root) {
            root = null;
            return true;
        } else {
            if (parent.getRightNode() == data) {
                parent.setRightNode(null);
                return true;
            } else {
                parent.setLeftNode(null);
                return true;
            }
        }
    }

    public boolean delete1(TreeNode<T> data) {
        TreeNode parent = data.getParent();
        if (data == root) {
            if (root.getLeftNode() == null) {
                root = root.getRightNode();
            } else {
                root = root.getLeftNode();
            }
            return true;
        } else {
            if (parent.getLeftNode() == data) {
                if (data.getLeftNode() != null) {
                    parent.setLeftNode(data.getLeftNode());
                    data.getLeftNode().setParent(parent);
                    setNull(data);
                    return true;
                } else {
                    parent.setLeftNode(data.getRightNode());
                    data.getLeftNode().setParent(parent);
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
    }

    public TreeNode<T> getPredeccessor(TreeNode<T> node) {
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

    public boolean delete2(TreeNode<T> hapus) {
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

    public void setNull(TreeNode data) {
        data.setParent(null);
        data.setRightNode(null);
        data.setLeftNode(null);
        data.setData(0);
    }

    public boolean isLeaf(T data) {
        TreeNode node = getCurrent(data);
        if (node != null) {
            if (node.getRightNode() == null && node.getLeftNode() == null) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println(data + " Tidak Ditemukan");
            return false;
        }
    }
}
