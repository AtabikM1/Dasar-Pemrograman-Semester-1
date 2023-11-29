package Pertemuan14;
import java.util.Scanner;
public class tugas3 {
    // Fungsi rekursif untuk mengecek bilangan prima
    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;  // Basis: 1 dan 0 adalah bilangan prima
        } else {
            if (n % i == 0) {
                return false; // Basis: n habis dibagi i, bukan bilangan prima
            } else {
                return cekPrimaRekursif(n, i - 1); // Rekursi: periksa pembagi selanjutnya
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println(n + " bukan bilangan prima");
        } else {
            boolean hasil = cekPrimaRekursif(n, n - 1);

            if (hasil) {
                System.out.println(n + " adalah bilangan prima");
            } else {
                System.out.println(n + " bukan bilangan prima");
            }
        }
    }
}


