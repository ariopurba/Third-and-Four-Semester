/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.util.StringJoiner;

/**
 *
 * @author old
 */
public class StringJoin {
    public static void main(String[] args) {
        String [] names = {"ario", "Tua", "Purba"};
        
        StringJoiner joiner = new StringJoiner(" ","[" ,"]");
        for (var name : names) {
            joiner.add(name);
        }
        joiner.add("ais");
        System.out.println(joiner.toString());
        
        
    }
}
