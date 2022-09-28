/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author old
 */
public class BinarySearch {
    public static void cetak(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index ke-"+(i)+" :"+array[i]);
        }
    }
    
    public static int binarySearch(int array[], int toFind){
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high){
            int mid = (low + high)/2;
            if (toFind < array[mid]){
                high = mid + 1;
            }else if(toFind > array [mid]){
                low = mid + 1;
            }else if(toFind ==  array[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            int array [] = {5, 8, 35, 15, 11, 31};
            Arrays.sort(array);
            System.out.println(binarySearch(array, 11));
    }
}
