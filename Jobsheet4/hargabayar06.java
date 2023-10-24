package Jobsheet4;

import java.util.Scanner;

public class hargabayar06 {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int harga, jumlah, jumlahhalaman;
        String merkbuku;
        double dis, total, bayar, jumlahdiskon;
        //perintah untuk input jumlah dan harga
        System.out.println("masukkan harga yang dibeli =");
        harga = sc.nextInt();
        System.out.println("masukan diskon =");
        dis = sc.nextDouble();
        System.out.println("masukkan merek yang dibeli =");
        merkbuku = sc.next();
        System.out.println("masukkan jumlah barang yang dibeli =");
        jumlah = sc.nextInt();
        System.out.println("masukkan jumlah halaman buku yang dibeli =");
        jumlahhalaman = sc.nextInt();
        //perintah hitung total belanja
        total = harga*jumlah;
        //hitung total diskon
        jumlahdiskon = total*dis;
        //hitung bayar
        bayar =  total - jumlahdiskon;
        //tampilkan isi variable
        System.out.println("diskon yang didapat = "+ jumlahdiskon);
        System.out.println("yang harus anda bayar = "+ bayar);


    }
}