/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

/**
 *
 * @author old
 */
public class NumberKelas {
    public static void main(String[] args) {
        Integer intNilai = 10;
        Long longNilai = intNilai.longValue();
        Double doubleNilai = longNilai.doubleValue();
        Short shortNilai = doubleNilai.shortValue();
        
        //Gunakan Parse untuk data primitif int dan valueOf untuk data non ==> object
        String contoh = "1000.32";
        Double contohint = Double.valueOf(contoh);
        System.out.println(contohint);
        
    }
}




