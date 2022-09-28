package tree;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tree {

    private TreeNode root;
    private int size = 1;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void bacaData() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try ( Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sdnl", "root", "")) {
                Statement st = (Statement) con.createStatement();
                String sql = ("SELECT * FROM hotel ");
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    job job = new job();
                    job.setnama(rs.getString(1));
                    job.setalamat(rs.getString(2));
                    job.setpekerjaan(rs.getString(3));
                    job.setno(rs.getString(4));
                    insertNode(job);
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Tree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertNode(job key) {
        TreeNode node = new TreeNode(key);
        if (root == null) {
            root = node;
        } else {
            getRoot().insert(key);
            size++;
        }
    }
    
    public TreeNode searchNode(job key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getno().equalsIgnoreCase(cari.getData().getno())) {
                    return cari;
                } else {
                    if (key.getno().charAt(0)
                            > cari.getData().getno().charAt(0)) {
                        cari = cari.getRightNode();
                    } else {
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public static String inorder = "";

    public String inOrderHelpera(TreeNode node) {
        if (node != null) {
            inOrderHelpera(node.getLeftNode());
            inorder = inorder + node.getData().getnama()
                    + "\t" + node.getData().getalamat() + "\t"
                    + node.getData().getpekerjaan()+ "\t"
                    + node.getData().getno()+ "\n";
            inOrderHelpera(node.getRightNode());
        }
        return inorder;
    }

    public boolean delete(job key) {
        TreeNode bantu = searchNode(key);
        TreeNode parent = getCurrent(key);
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                parent.setLeftNode(null);
                return true;
            } else {
                parent.setRightNode(null);
                return true;
            }
        } else if (bantu.getLeftNode() == null || bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                if (bantu.getLeftNode() == null) {
                    parent.setLeftNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setLeftNode(bantu.getLeftNode());
                    return true;
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    parent.setRightNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setRightNode(bantu.getLeftNode());
                    return true;
                }
            }
        } else {
            TreeNode predeccessor = getPredeccessor(bantu);
            bantu.setData(predeccessor.getData());
            if (predeccessor.isLeaf()) {
                TreeNode cariKanan = new TreeNode();
                while (bantu.getRightNode() != null) {
                    cariKanan = bantu;
                    bantu = bantu.getRightNode();
                }
                cariKanan.setRightNode(null);
                return true;
            } else {
                bantu.setData(bantu.getLeftNode().getData());
                bantu.setLeftNode(null);
                return true;
            }
        }
    }

    public TreeNode getCurrent(job key) {
        TreeNode cari = root;
        TreeNode parent = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getno().equals(cari.getData().getno())) {
                    return parent;
                } else {
                    if (key.getno().charAt(0) > cari.getData().getno().charAt(0)) {
                        parent = cari;
                        cari = cari.getRightNode();
                    } else {
                        parent = cari;
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public TreeNode getPredeccessor(TreeNode del) {

        TreeNode predeccessor = del;
        while (predeccessor.getRightNode() != null) {
            predeccessor = predeccessor.getRightNode();
        }
        return predeccessor;

    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
   
}


