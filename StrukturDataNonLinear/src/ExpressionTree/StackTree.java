/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
public class StackTree {

    public ListTree stackListTree;

    public StackTree(ListTree stackListTree) {
        this.stackListTree = stackListTree;
    }
    public StackTree(){
       stackListTree = new ListTree();
    }
    public void Push(TreeNode node){
        stackListTree.insertAtfront(node);
    }
    public TreeNode Pop(){
        return stackListTree.removeFromFront();
    }
    public boolean isEmpty(){
        return stackListTree.isEmpty();
    }
    public void print(){
        stackListTree.print();
    }
}
