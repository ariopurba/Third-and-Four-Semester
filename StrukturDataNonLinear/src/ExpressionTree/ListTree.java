/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
public class ListTree {

    private ListTreeNode firstNode;
    private ListTreeNode lastNode;
    private String name;

    public ListTree() {
        this("list");
    }

    public ListTree(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtfront(TreeNode insertitem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(insertitem);
        } else {
            firstNode = new ListTreeNode(insertitem, firstNode);
        }
    }
    public void insertAtBack(TreeNode insertitem){
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(insertitem);
        }else{
            lastNode = lastNode.nextNode = new ListTreeNode(insertitem);
        }
    }

    public TreeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        TreeNode removeItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
        }
        return removeItem;
    }

    public TreeNode removeFromBack() {
        if (isEmpty()) {
            return null;
        }
        TreeNode removeItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListTreeNode current = firstNode;
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }
            lastNode = current;
            current.nextNode = null;
        }
        return removeItem;
    }

    public boolean isEmpty() {
        if(firstNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty" + name);
            return;
        }
        System.out.println("The" + name + " isl: ");
        ListTreeNode current = firstNode;

        while (current != null) {
            System.out.println(current.data.toString() + "");
            current = current.nextNode;
        }
        System.out.println("\n");
    }

}
