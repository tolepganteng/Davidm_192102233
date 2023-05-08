/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;
    import java.util.Scanner;
    import javax.swing.JOptionPane;

public class Latihan1 {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
        String nama, nim;
        final double n_absensi , n_latihan, n_uts, n_uas, n_akhir;
        
        
        /*System.out.println("Menghitung NIlai Anda\n");
        
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        
        System.out.print("Masukan Nilai Absensi : ");
        n_absensi = input.nextInt();
        
        System.out.print("Menghitung NIlai Latihan : ");
        n_latihan = input.nextInt();
        
        System.out.print("Menghitung NIlai UTS : ");
        n_uts = input.nextInt();
        
        System.out.print("Menghitung NIlai Latihan : ");
        n_uas = input.nextInt();
        
        n_akhir = (0.20 * n_latihan + 0.10 * n_absensi + 0.30 * n_uts + 0.40 * n_uas);
        
        System.out.println(nama+" dengan NIM "+ nim +" Memiliki Nilai Akhir : "+n_akhir);
       // System.out.println("Masukan Nama Anda :");
        //nama = input.nextLine();
       // System.out.println("Nama Saya Adalah "+nama);
       //nama = JOptionPane.showInputDialog("Masukan Nama Anda : " );
       //JOptionPane.showMessageDialog(null, "Nama anda adalah "+nama);*/
       
       
       nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
       nim = JOptionPane.showInputDialog("Masukan NIM Anda : ");
       
       n_absensi = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Absensi : "));
       n_latihan = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Latihan : "));
       n_uts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS : "));
       n_uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS : "));
       
       
       n_akhir = (0.20 * n_latihan + 0.10 * n_absensi + 0.30 * n_uts + 0.40 * n_uas);
        
       JOptionPane.showMessageDialog(null, " Nilai Akhir " + nama + " Dengan NIM " + nim + "\nadalah = "+n_akhir);
       
    }
    
}