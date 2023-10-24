package Jobsheet4;
import java.util.Scanner;

public class Gaji06 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int jumlahmasuk, jumlahtidakmasuk, totalgaji;
    int gaji, potgaji;
    
    System.out.println("masukkan jumlah hari masuk anda");
    jumlahmasuk= sc.nextInt();
    System.out.println("masukkan jumlah tidak masuk anda");
    jumlahtidakmasuk=sc.nextInt();
    System.out.println("masukkan gaji = ");
    gaji= sc.nextInt();
    System.out.println("potongan gaji = ");
    potgaji= sc.nextInt();
    totalgaji = (jumlahmasuk*gaji)-(jumlahtidakmasuk*potgaji);
    System.out.println("gaji anda = "+ totalgaji);
    }
}
