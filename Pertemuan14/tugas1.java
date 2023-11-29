package Pertemuan14;

import java.util.Scanner;
public class tugas1 {



    // Fungsi rekursif
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Deret Descending (Rekursif):");
        deretDescendingRekursif(n);
        System.out.println(); // Pindah ke baris baru setelah selesai rekursif

        System.out.println("Deret Descending (Iteratif):");
        deretDescendingIteratif(n);
    }
}


