/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.util.UUID;

/**
 *
 * @author old
 */
public class UUIDApp {
    public static void main(String[] args) {
        for (var i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }
    }
    
}
