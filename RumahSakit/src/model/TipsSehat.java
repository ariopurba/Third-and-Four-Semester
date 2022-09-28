/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import HospitalManagementSystem.health_tips;
import java.util.Random;
import java.util.random.RandomGenerator;

/**
 *
 * @author old
 */
public class TipsSehat {

    TipsSehat() {
        Random_tip_generator();
    }
    String arr[] = {"Makan makanan Sehat dan bergizi seimbang  \n",
         "Mengatur waktu makan atau Makan yang teratur \n", "Istirahat atau Tidur yang cukup  \n", "Olahraga secara teratur \n",
         "Hindari Stres  \n", "Mendapatkan Asupan Vitamin yang cukup \n", "Banyak Minum Air Putih \n",
         "Tetap memperhatikan dan menjaga Kebersihan lingkungan  \n", "Tidak merokok  \n", "Mengurangi konsumsi Gula  \n"};

    void Random_tip_generator() {
        System.out.println(arr[new Random().nextInt(arr.length)]);

    }

    public static void main(String[] args) {
        TipsSehat ht = new TipsSehat();
    }
}
