package Pertemuan13;

import java.util.Scanner;

public class percobaan6_06 { //tanpa fungsi 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("masukkan panjang = ");
        p = sc.nextInt();
        System.out.print("masukkan lebar = ");
        l = sc.nextInt();
        System.out.print("masukkan tinggi = ");
        t = sc.nextInt();
 
        L = hitungluas(p, l);
        System.out.println("luas persegi panjang adalah = "+ L);

        vol = hitungvolume(t, p, l);
        System.out.println("volume of block = " + vol);

    }
    static int hitungluas (int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    } 
    static int hitungvolume (int t, int a, int b){
        int volume = hitungluas(a, b)* t;
        return volume;
    }
}
