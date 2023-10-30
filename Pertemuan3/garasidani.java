package Pertemuan3;
import java.util.Scanner;

public class garasidani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Panjang Alas");
        alas = sc.nextInt();
        System.out.print("Panjang Tinggi");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas Garasi: "+ luas);
    

    }
}