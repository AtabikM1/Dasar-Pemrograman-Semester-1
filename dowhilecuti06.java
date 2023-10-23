

import java.util.Scanner;

public class dowhilecuti06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jatahcuti, jumlahhari;
        String konfirmasi;

        System.out.println("jatah cuti = ");
        jatahcuti = sc.nextInt();

        do {
            System.out.println("apakah anda ingin mengambil cuti (y/t)?");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("jumlah hari = ");
                jumlahhari = sc.nextInt();

                if (jumlahhari<=jatahcuti) {
                    jatahcuti -= jumlahhari;
                    System.out.println("sisa jatah cuti = " + jatahcuti);               
                }else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi ");
                    break;
                }

            } 
        }while (jatahcuti>0);
    }
}
