package Jobsheet5;
import java.util.Scanner;

public class switchcase06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.println("masukan angka = ");
        angka = sc.nextInt();

        switch(angka) {
            case 1:
            System.out.println("hari senin");
            case 2:
            System.out.println("hari selasa");
            break;
            case 3:
            System.out.println("hari rabu");
            break;
            case 4:
            System.out.println("hari kamis");
            case 5:
            System.out.println("hari jumat");
            break;
            case 6:
            System.out.println("hari sabtu");
            case 7:
            System.out.println("hari minggu");
            break;

            default:
            System.out.println("maaf angka yang anda masukkan salah");
        }

    }
}
