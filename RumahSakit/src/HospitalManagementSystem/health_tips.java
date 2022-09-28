package HospitalManagementSystem;

import java.util.Random;

public class health_tips {
	
		health_tips(){
			Random_tip_generator();
		}
	

		
	    String arr[] = {"Makan makanan Sehat dan bergizi seimbang  \n"
				, "Mengatur waktu makan atau Makan yang teratur \n" , "Istirahat atau Tidur yang cukup  \n" , "Olahraga secara teratur \n"
				,"Hindari Stres  \n" ,"Mendapatkan Asupan Vitamin yang cukup \n","Banyak Minum Air Putih \n"
				,"Tetap memperhatikan dan menjaga Kebersihan lingkungan  \n","Tidak merokok  \n","Mengurangi konsumsi Gula  \n"};
	    
	    void Random_tip_generator() {
	    	System.out.println(arr[new Random().nextInt(arr.length)]);
        
		}
        public static void main(String[] args) {
        	health_tips ht=new health_tips();
        }
}
