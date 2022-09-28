/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.util.StringTokenizer;

/**
 *
 * @author old
 */
public class StringToken {
    public static void main(String[] args) {
        String value = "ario Tua purba";
        StringTokenizer token = new StringTokenizer(value, " ");
        while(token.hasMoreTokens()){
            String result = token.nextToken();
            System.out.println(result);
        }
    }
}
