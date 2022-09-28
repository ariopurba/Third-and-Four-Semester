/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

/**
 *
 * @author old
 */
import java.util.Base64;
public class Base64Aoo {
    public static void main(String[] args) {
        String ori = "ario tua purba";
        String encoded = Base64.getEncoder().encodeToString(ori.getBytes());
        System.out.println(encoded);
        
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}
