package tree;
public class TreeNode {
    
    private job data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    
    public TreeNode() {
    }
    public TreeNode(job data) {
        this.data = data;
    }
    
    public void insert(job key) {
        if (key.getno().charAt(0) > getData().getno().charAt(0)) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(key));
            } else {
                getRightNode().insert(key);
            }
        } else {
            if (getLeftNode() == null) {
                setLeftNode(new TreeNode(key));
            } else {
                getLeftNode().insert(key);
            }
        }
    }

    public job getData() {
        return data;
    }
     public void setData(job data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }
}
     



