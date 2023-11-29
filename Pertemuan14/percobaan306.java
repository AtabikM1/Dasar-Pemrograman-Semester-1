package Pertemuan14;

import java.util.Scanner;

public class percobaan306 { //n buat file Java dengan nama Percobaan3
    static double hitunglaba(double saldo, int tahun){ //Buat fungsi static dengan nama hitungLaba(),
        if (tahun == 0) { //base case
            return (saldo);
        } else {
            return (1.11 * hitunglaba(saldo, tahun - 1)); //recursion call
        }
    }
    public static void main(String[] args) { //fungsi main dan deklarasikan Scanner dengan nama sc
        Scanner sc = new Scanner(System.in); //variabel bertipa double dengan nama saldoAwal
        double saldoawal;
        int tahun; // dan int tahun
        System.out.println("jumlah saldo awal = ");
        saldoawal = sc.nextInt();
        System.out.println("lama investasi (tahun) = ");
        tahun = sc.nextInt();
        System.out.println("jumlah saldo setelah " +tahun+" tahun");
        System.out.println(hitunglaba(saldoawal, tahun)); //Lakukan pemanggilan fungsi hitungLaba 
    }
}
