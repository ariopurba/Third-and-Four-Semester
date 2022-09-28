/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author old
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("ario");
        list.add("Purba");
        String str = (String) list.listIterator(1).previous();
        System.out.println(list);
        
        List<String> names = new ArrayList<>();
        names.add(0, "Jadi");
          names.add("Jeje");
          System.out.println(names);
     
    }
}
