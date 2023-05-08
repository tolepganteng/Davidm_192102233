package Latihan;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class looping {
    public static void main(String[] args) {
        String[] arrayNim = new String[5];
        String[] arrayNama = new String[5];
        String nim;
        String nama;
        int i=0;
        
        nim=JOptionPane.showInputDialog("Masukan NIM");
        nama=JOptionPane.showInputDialog("Masukan Nama");
        while  (!nim.equals("")){
            arrayNim[i]=nim;
            arrayNama[i]=nama;
            i++;
            
              nim=JOptionPane.showInputDialog("Masukan NIM");
              nama=JOptionPane.showInputDialog("Masukan Nama");
        }
        for (int x=0; arrayNim[x]!=null; x++){
            System.out.println("NIM : "+arrayNim[x] + " Nama : "+arrayNama[x]);
        }
    }
}
