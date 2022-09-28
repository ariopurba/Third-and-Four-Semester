/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestClass;

import model.Tree;
import model.pasien;

/**
 *
 * @author old
 */
public class DataPasien {

    Tree pohon;

    public void dataPasien() {

        pasien data = new pasien();
          data = new pasien("Ario Tua Purba", "Male", "Demam", "90", 12);
        pohon.insert(data);
        data = new pasien("Markus Adi", "Male", "Demam", "99", 34);
        pohon.insert(data);
        data = new pasien("Ong Gabriel", "Male", "Demam", "97", 67);
        pohon.insert(data);

    }
}
