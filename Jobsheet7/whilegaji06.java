package Jobsheet7;

import java.util.Scanner;

public class whilegaji06 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int jumlahkaryawan, jumlahjamlembur;
        double gajilembur = 0, totalgajilembur = 0;
        String jabatan;
        System.out.print("masukkan jumlah karyawan = ");
        jumlahkaryawan = sc.nextInt();

        int i = 0;
        while ( i < jumlahkaryawan) {
            System.out.println("pilihan jabatan - direktur, karyawan, manajer");
            System.out.println("masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.println("masukkan jumlah jam lembur: ");
            jumlahjamlembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajilembur = jumlahjamlembur*1000000;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajilembur = jumlahjamlembur*2100000;
            } else {
                System.out.println("jabatan tidak valid");
                i--;
            }

            totalgajilembur += gajilembur;
            System.out.println("total gaji lembur: "+ totalgajilembur);
        }
    }
}
