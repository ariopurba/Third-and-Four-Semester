/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_205314094;

/**
 *
 * @author Ario Purba
 */
public class TreeApp {
        public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.insert(75);
        pohon.insert(30);
        pohon.insert(21);
        pohon.insert(65);
        pohon.insert(89);
        pohon.insert(80);
        pohon.insert(90);
        pohon.insert(94);
        System.out.println("Node predecessor: ");
        System.out.println(pohon.getPredeccessor(pohon.getRoot()).getData());
        pohon.delete(75);
        pohon.preorderTraversal();
        pohon.inorderTraversal();
        System.out.println("");
        pohon.postorderTraversal();
    }
}
