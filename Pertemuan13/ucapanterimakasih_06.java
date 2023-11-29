package Pertemuan13;

import java.util.Scanner;

public class ucapanterimakasih_06 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ucapanterimakasih();
        System.out.print("tambahkan ucapan lain ? = ");
        String greet = sc.nextLine();
        ucapantambahan(greet+" !");//untuk memanggil function terbaru
        sc.close();
    }
    public static String penerimaucapan() {
        System.out.print("tulis nama orang yang ingin anda beri ucapan = ");
        String namaorang = sc.nextLine();
        return namaorang;
    }
    public static void ucapanterimakasih(){
        String nama = penerimaucapan();
        System.out.println("thank u "+nama+" for being best guy in this planet.\n"+
        "you inspired me to live");
    }
    private static void ucapantambahan(String ucapantambahan){//function untuk ucapan tambahan 
        System.out.println(ucapantambahan);
    }
    
    
}

