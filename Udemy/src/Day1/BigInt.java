/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author old
 */
public class BigInt {
    public static void main(String[] args) {
//        Long nilai = 10000000000000000000;

        BigInteger a = new BigInteger("100000000000000000");
        BigInteger b = new BigInteger("100000000000000000");
        BigInteger c = a.add(b);
        System.out.println(c);
        BigDecimal d = new BigDecimal("10.2343234343");
        BigDecimal e = new BigDecimal("23.3443423434");
        BigDecimal f = d.add(e);
        System.out.println(f);
    }
    
}
