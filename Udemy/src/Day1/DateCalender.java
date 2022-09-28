/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author old
 */
public class DateCalender {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.YEAR, 2000);
        calender.set(Calendar.MONTH, Calendar.JANUARY);
        calender.set(Calendar.HOUR_OF_DAY, 10);
        
        Date result = calender.getTime();
        System.out.println(result);
    }
}
