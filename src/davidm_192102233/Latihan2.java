/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;
import java.util.Scanner;
import javax.swing.SpringLayout;
/**
 *
 * @author Mahasiswa C-03;wddwffdguagduwdvgdwqdgc,mscl
 * xackszfkhwafhhflihghuwa nhwuw
 */
public class Latihan2 {
    //Contoh 8
    public static void main(String[] args) {
        int hasil, nilai;
        
        nilai = -2;
        hasil = nilai < 0 ? -nilai : nilai;
        System.out.println("| " +nilai+ " |" + hasil);
        
        nilai = 2;
        hasil = nilai < 0 ? -nilai  : nilai;
        System.out.println("| " +nilai+ " |=" +hasil);
    }
    
    /*
    //Contoh 7
    public static void main(String[] args) {
        // Buat Variabel
    boolean b1 = 5 < 10;
    boolean b2 = 9 > 11;
    boolean b3 = !b1;
    boolean b4 = !b2;
    
    boolean tesAND1 = b1 & b2;
    boolean tesAND2 = b1 && b2;
    boolean tesAND3 = b1 && b3;
    boolean tesAND4 = b1 && b4;
    
    boolean TesOR1 = b1 | b2;
    boolean TesOR2 = b1 || b2;
    boolean TesOR3 = b1 || b3;
    boolean TesOR4 = b1 || b4;
    
    boolean TesXOR1 = b1 ^ b2;
    boolean TesXOR2 = b1 ^ b3;
    boolean TesXOR3 = b1 ^ b4;
    
    System.out.println("Tes  AND 1 =" + tesAND1);
    System.out.println("Tes  AND 2 =" + tesAND2);
    System.out.println("Tes  AND 3 =" + tesAND3);
    System.out.println("Tes  AND 4 =" + tesAND4);
    System.out.println("Tes OR 1 =" + TesOR1);
    System.out.println("Tes OR 2 =" + TesOR2);
    System.out.println("Tes OR 3 =" + TesOR3);
    System.out.println("Tes OR 4 =" + TesOR4);
    System.out.println("Tes XOR 1 =" + TesXOR1);
    System.out.println("Tes XOR 2 =" + TesXOR2);
    System.out.println("Tes XOR 3 =" + TesXOR3);
    }*/
    
/*    
//Contoh 6
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("a == b bernilai" +(a==b));
        System.out.println("a != b bernilai" +(a!=b));
        System.out.println("a > b bernilai" +(a>b));
        System.out.println("a < b bernilai" +(a<b));
        System.out.println("a >= b bernilai" +(a>=b));
        System.out.println("a <= b bernilai" +(a<=b));
              
    } */
    
    /*
    //Contoh 5
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 9;
        int d = 9;
        
        System.out.println("Print ke 1");
        System.out.println("A =" +a++);
        System.out.println("B =" + ++b);
        System.out.println("c =" + c--);
        System.out.println("D =" + --d);
        
        System.out.println("Print ke 2");
        System.out.println("A =" +a++);
        System.out.println("B =" + ++b);
        System.out.println("c =" + c--);
        System.out.println("D =" + --d);
        
        System.out.println("Print ke 3");
        System.out.println("A =" +a++);
        System.out.println("B =" + ++b);
        System.out.println("c =" + c--);
        System.out.println("D =" + --d);
        
        System.out.println("Print ke 4");
        System.out.println("A =" +a++);
        System.out.println("B =" + ++b);
        System.out.println("c =" + c--);
        System.out.println("D =" + --d);
    }*/
    
   /* 
    //Contoh 4
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pre-Decrement");
        System.out.println("a\t" +a);
        System.out.println("--a\t:" + --a);
        System.out.println("a\t:" +a);
    }*/
    
    /*
    //Contoh 3
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Pre increment");
        System.out.println("a\t" +a);
        System.out.println("++a\t:" + ++a);
        System.out.println("a\t:" +a);
        
        int b = 5;
        System.out.println("\n Post increment");
        System.out.println("b\t" +b);
        System.out.println("++b\t:" + ++b);
        System.out.println("b\t:" +b);
        
        
    }*/
    
   /* 
    //Contoh 2
    public static void main(String[] args) {
        int a = 11, b=4;
        int c = a%b;
        double da = 13.75;
        double dc = da % b;
        System.out.println("Sisa bagi" +a+ " / " +b+ "adalah" +c);
        System.out.println("Sisa bagi" + da + " /" +b+ " adalah" +dc);
    }*/
    
   /*
    //Contoh 1
    public static void main(String[] args) {
        System.out.println("Operasi Aritmatika pada tipe integer");
        int a = 2+1;
        int b = a-1;
        int c = a * b;
        int d = c/ 3;
        int e = -a;
        System.out.println("Nilai a" +a);
        System.out.println("Nilai b" +b);
        System.out.println("Nilai c" +c);
        System.out.println("Nilai d" +d);
        System.out.println("Nilai e" +e);
        System.out.println();
        
        System.out.println("Operasi Aritmatika pada tipe floating point");
        double fa = 2+1;
        double fb = fa - 1;
        double fc = fa * fb;
        double fd = fc / 3;
        double fe = -a;
        System.out.println("Nilai fa"+fa);
        System.out.println("Nilai fb"+fb);
        System.out.println("Nilai fc"+fc);
        System.out.println("Nilai fd"+fd);
        System.out.println("Nilai fe"+fe);
    }*/
}
