/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

/**
 *
 * @author old
 */
public class StringBaru {

    public static void main(String[] args) {
        String nama = "Ario";
        String nama2 = nama + " Tua";

        System.out.println(nama2);
        StringBuilder build = new StringBuilder();
        build.append("Nama Pertama");
        build.append("nama Kedua");
        build.reverse();
        System.out.println(build);
    }

}
