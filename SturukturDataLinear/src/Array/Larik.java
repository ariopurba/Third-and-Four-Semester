/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author old
 */
public class Larik {

    public static void cetak(Object[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index ke " + i + ": " + data[i]);
        }
    }

    public static int binarySearchObject(Object array[], Object toFind) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (((Comparable) array[mid]).compareTo(toFind) == 0) {
                return mid;
            } else if (((Comparable) array[mid]).compareTo(toFind) == 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
    public static void quickSortObject(Object[] arrData, int low, int high){
        if (low < high){
            int i = low +1;
            int j = high;
            
            while((i <= high)&& ((((Comparable)arrData[i]).compareTo(arrData[low])<0) || 
                    (((Comparable)arrData[i]).compareTo(arrData[low])== 0))){
                i += 1;
            }
            while ((j > low) && (((Comparable)arrData[j]).compareTo(arrData[low]) > 0)){
                j -= 1;
            }
            while (i < j){
                Object n = arrData[i];
                arrData[i] = arrData[j];
                arrData[j] = n;
                while ((i <= high ) && ((((Comparable)arrData[i]).compareTo(arrData[low]) < 0)
                        || (((Comparable) arrData[i]).compareTo(arrData[low]) == 0))){
                    i += 1;
                }
                while((j > low) && (((Comparable)arrData[j]).compareTo(arrData[low]) > 0)){
                    j -= 1;
                }
            }
            Object change = arrData[low];
            arrData[low] = arrData[j];
            arrData[j] = change;
            quickSortObject(arrData, low, j - 1);
            quickSortObject(arrData, j + 1, high);
            
        }
    }
}
