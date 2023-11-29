package Pertemuan14;

import java.util.Scanner;

import Pertemuan5.suhu06;

public class percobaan206 { //buat file Java dengan nama Percobaan2

    static int hitungpangkat(int x, int y){ //Buat fungsi static dengan nama hitungPangkat(),
        if (y == 0) {
            return (1);
        }else {
            return (x *hitungpangkat(x, y - 1));
        }
    }
    public static void main(String[] args) { //Buatlah fungsi main dan deklarasikan Scanner dengan nama sc
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.println("bilangan yang dihitung = ");
        bilangan = sc.nextInt();
        System.out.println("pangkat = ");
        pangkat = sc.nextInt();
        System.out.println(hitungpangkat(bilangan, pangkat)); //. Lakukan pemanggilan fungsi hitungPangkat 
    }
}