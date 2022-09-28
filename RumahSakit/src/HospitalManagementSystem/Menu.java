package HospitalManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String nama, alamat, username, password;

        patient pt = new patient();
        Pharmacy ph = new Pharmacy();

        System.out.println("Selamat Datang di Hospital Berkah");
        System.out.println("==============================");

        pt.insert(30, 2, "Markus Adi", "Jl.Ngemplak", "Mark", "Male");
        int menu = 0;
        while (menu != 9) {

            int op;
            System.out.println("1. Tips Sehat Hari Ini \n2. take appoitment \n3. Beli Obat\n9. Keluar");
            System.out.print("==> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    @SuppressWarnings("unused") health_tips ht = new health_tips();
                    break;

                case 2:
//                    username = JOptionPane.showInputDialog("Masukkan username");
//                    password = JOptionPane.showInputDialog("Masukkan password");
//
//                    if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("2022")) {

                    do {

                        System.out.println(
                                " 5 to exit \n 1 Add Patient" + "\n 2 del patient \n 3 search by Name" + "\n 4 to print list");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Enter Patient details here");
                                System.out.println("Enter Name");
                                String name = sc.next();
                                System.out.println("Enter age");
                                int age = sc.nextInt();
                                System.out.println("Enter Gender");
                                String gender = sc.next();
                                System.out.println("Enter Phone Number");
                                int number = sc.nextInt();
                                System.out.println("Enter disease");
                                String disease = sc.next();

                                System.out.println("Enter Address");
                                String address = sc.next();
                                pt.insert(age, number, name, address, disease, gender);
                                break;

                            case 2:
                                System.out.println("Enter name of patient you want to delete");
                                String name1 = sc.next();
                                pt.delete(name1);
                                break;

                            case 3:
                                System.out.println("Enter Name of Patient whose detail you want");
                                String name3 = sc.next();
                                System.out.print(pt.search(name3));
                                break;

                            case 4:
                                System.out.println("List of Patients");
                                pt.inorder();
                                break;

                            case 5:
                                System.out.println("Program has been terminated");
                                break;

                        }
                    } while (op < 6 && op > 0);

//            else {
//                        JOptionPane.showMessageDialog(null, "Username atau password salah !", "Gagal login", JOptionPane.ERROR_MESSAGE);
//                    }
                    break;

                case 3:

                    ArrayList<String> ar = new ArrayList<String>();
                    ar.add("Panadol");
                    ar.add("bruffin");
                    ar.add("Paracetamol");
                    ar.add("Farsifen Ibuprofen");
                    ar.add("Vicodin");
                    ar.add("Lipitor");
                    System.out.println("==Daftar Obat==");
                    for (int i = 0; i < ar.size(); i++) {
                        System.out.println((i + 1) + "." + ar.get(i));
                    }
                    System.out.println("Masukkan Nama Obat yang ingin di pesan: ");
                    String med = sc.next();
                    ph.medicine(ar, med);
                    if (ar.equals(med)) {
                        System.out.println("Do you want to buy");
                        String med1 = sc.next();
                        if (med1.equalsIgnoreCase("y")) {
                            ph.cart(med1);

                        } else {
                            System.out.println("Input dengan benar");
                            break;
                        }
                    } else {
                        break;
                    }

                    break;

                case 9:
                    break;
            }
        }

    }
}
