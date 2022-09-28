/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpressionTree;

/**
 *
 * @author old
 */
public class TreeTest {
    public static void main(String[] args) {
//        String s1 = "(A+B)";
//        String s1 = "(A+B)*((B-C)+D)";
//        String s1 = "(A+B*C)^((P+Q)*R)";
        String s1 = "(A+B*C)^((P+Q)*R)";

        char notasi[] = new char[s1.length()];
        s1.getChars(0, s1.length(), notasi, 0);
        
        Tree tree = new Tree();
        Infix infix = new Infix(notasi);
        
        tree.setRootTree(infix.buatPohon());
        
        System.out.println("\nInfix (Inorder Traversal)");
        tree.inorderTraversal();
        System.out.println("");
        System.out.println("Prefix (Preorder Traversal)");
        tree.preorderTransversal();
        System.out.println("");
        System.out.println("Postfix (Postorder Traversal)");
        tree.postorderTransersal();
    }
}
