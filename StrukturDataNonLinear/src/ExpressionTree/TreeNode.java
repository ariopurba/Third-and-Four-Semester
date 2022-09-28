/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
class TreeNode {

    TreeNode leftNode;
    char data;
    TreeNode rightNode;

    public TreeNode(char nodeData) {
        data = nodeData;
        leftNode = null;
        rightNode = null;
    }

    public void insert(char insertValue) {
        if (insertValue < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(insertValue);

            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}
