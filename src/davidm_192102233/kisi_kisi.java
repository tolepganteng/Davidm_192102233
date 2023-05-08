/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Mahasiswa C-03
 */
            
public class kisi_kisi {
    
        //PROGRAM MENENTUKAN BILANGAN GANJIL GENAP
//     public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int bil;
//        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL & GENAP");
//        System.out.println("-------------------------------------------------");
//        System.out.print("Masukan Angka = ");
//        bil=input.nextInt();
//        
//        if (bil%2==0){
//            System.out.println("Angka tersebut "+bil+" adalah bilangan genap");
//    }else {
//             System.out.println("Angkatan tersebut "+bil+" adalah bilangan ganjil");
//        }
//    
//  }
    
    
    
    //PROGRAM MENGHITUNG NILAI AKHIR MAHASISWA
    
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
        String nama, nim, grade;
        final double n_absensi , n_latihan, n_uts, n_uas, n_akhir;
        
        nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
       nim = JOptionPane.showInputDialog("Masukan NIM Anda : ");
       
       n_absensi = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Absensi : "));
       n_latihan = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Latihan : "));
       n_uts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS : "));
       n_uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS : "));
       
       
       n_akhir = (0.20 * n_latihan + 0.10 * n_absensi + 0.30 * n_uts + 0.40 * n_uas);
       if(n_akhir >=80){
       grade = "A";
       }else{
       if(n_akhir >=70){
       grade = "B";
       }else{
       if(n_akhir >=80){
       grade = "C";
       }else{
       grade = "D";
       }
       }
       }
       JOptionPane.showMessageDialog(null, " Nama :  " + nama + "dengan NIM : " + nim + "\n Nilai : = "+n_akhir+ "\n Grade"+grade);
    }
    
}
