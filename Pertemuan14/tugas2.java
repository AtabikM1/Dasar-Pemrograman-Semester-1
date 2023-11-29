package Pertemuan14;

import java.util.Scanner;
public class tugas2 {
    // Fungsi rekursif untuk menghitung penjumlahan bilangan
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0; // Basis: penjumlahan dari 0 adalah 0
        } else {
            return n + penjumlahanRekursif(n - 1); // Rekursi: jumlahkan n dengan hasil rekursif dari n-1
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int hasil = penjumlahanRekursif(n);

        System.out.println("Penjumlahan dari 1 sampai " + n + " adalah: " + hasil);
        
        for ( int i = 1; i <= n; i++){
            System.out.print(i);
            if ( i < n){
                System.out.print("+");
            }
        }
        System.out.println("="+hasil);
    }
}

