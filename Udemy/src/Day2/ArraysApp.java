package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author old
 */
public class ArraysApp {
    /*
    untuk memanipulasi data
    */
    public static void main(String[] args) {
        int [] num = {
            1,3,4,23, 34,2342, 342
        };
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num, 3));
        System.out.println(Arrays.binarySearch(num, 100));
        
        int [] result = Arrays.copyOf(num, 5);
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(num, 0, 7);
        System.out.println(Arrays.toString(result2));
    }
    
}
