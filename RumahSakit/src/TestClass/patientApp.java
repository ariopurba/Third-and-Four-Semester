/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;

import java.util.UUID;
import model.Tree;
import model.pasien;

/**
 *
 * @author old
 */
public class patientApp {

    public static void main(String[] args) {
        pasien ario = new pasien("09");
        ario.setAlamat("paingan");
        ario.setNama("Ario");
        Tree pohon = new Tree();
        pohon.insert(ario);
//        pohon.inorderTraversal();
        int id = (int) (Math.random() * 50);
        System.out.println("P-" + id);
    }
}
