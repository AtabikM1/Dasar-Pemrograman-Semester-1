package Pertemuan13;

import java.util.Scanner;

public class ucapan_06 {
    public static String penerimaucapan() { //Buat fungsi PenerimaUcapan di dalam class tersebut yang mengembalikan nilai
        Scanner sc = new Scanner(System.in);
        System.out.print("tuliskan nama orang yang ingin anda beri ucapan = ");
        String namaorang = sc.nextLine();
        sc.close();
        return namaorang;
    }
    public static void main(String[] args) { //Buat fungsi main di dalam class tersebut, dan eksekusi fungsi PenerimaUcapan
        String nama = penerimaucapan();
        System.out.println("thank u " + nama +"\nmuchas gracias");
    }
}
