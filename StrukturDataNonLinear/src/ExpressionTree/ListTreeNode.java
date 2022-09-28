/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
class ListTreeNode {

    TreeNode data;
    ListTreeNode nextNode;

    ListTreeNode(TreeNode treeNode) {
        this(treeNode, null);
    }

    ListTreeNode(TreeNode treeNode, ListTreeNode node) {
        data = treeNode;
        nextNode = node;
    }

    TreeNode getTreeNode() {
        return data;
    }

    ListTreeNode getNext() {
        return nextNode;
    }
}
