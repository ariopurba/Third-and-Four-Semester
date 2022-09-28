/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_205314094;

/**
 *
 * @author 205314094
 */
public class TreeApp {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(67);
        tree.insert(35);
        tree.insert(80);
        tree.insert(24);
        tree.insert(5);
        tree.insert(68);
        tree.insert(25);
        tree.insert(38);
        System.out.println("Hasil Preorder Traversal :");
        tree.preorderTraversal();
        System.out.println("\n");
        System.out.println("Hasil Inorder Traversal :");
        tree.inorderTransversal();
        System.out.println("\n");
        System.out.println("Hasil Postorder Traversal :");
        tree.postTranserversal();
        System.out.println("\n");
        tree.leaf();
        tree.internal();

    }
}
