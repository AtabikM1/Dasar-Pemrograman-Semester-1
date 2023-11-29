package Pertemuan13;

import java.util.Scanner;

public class kubus06 {
    
    public static void main(String[] args) { //main function
        Scanner sc = new Scanner(System.in);
        int sisi, luaspermukaan, volume;
    
        System.out.println("masukkan panjang sisi = ");
        sisi = sc.nextInt();
    
        luaspermukaan = hitungluas(sisi); // memanggi func hitung luas   
        volume = hitungvolume(sisi);
        
        System.out.println("volume kubus tersebut adalah = " + volume);
        System.out.println("luas permukaan adalah = "+ luaspermukaan);
    }
    private static int hitungluas(int sisi){ //function hitung luas permukaan kubus
        int luas = sisi * sisi * 6; 
        return luas;
    }
    private static int hitungvolume(int sisi){ //function hiyung volume kubus
        int volume = sisi * sisi * sisi;
        return volume;
    }
}
