import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class pemilihanpercobaan206 {
    public static void main(String[] args){
        Scanner input00 = new Scanner(System.in);

        System.out.println("nilai UAS = ");
        float uas = input00.nextFloat();
        System.out.println("nilai UTS = ");
        float uts = input00.nextFloat();
        System.out.println("nilai kuis = ");
        float kuis = input00.nextFloat();
        System.out.println(" nilai tugas = ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas *0.2F);
        String message = total < 65 ? "remidi": "tidak remidi", nilaiHuruf = " Null ", kualifikasi = "Null";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        double nilaiSetara;

        if (total >80 && total <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = " sangat baik";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }

        else if (total >73 && total<=80){
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = " lebih dari baik";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }

        else if (total >65 && total<=73){
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = " baik";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }

        else if (total >60 && total<=65){
            nilaiHuruf = "c+";
            nilaiSetara = 2.5;
            kualifikasi = "lebih dari cukup ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
        else if (total >50 && total<=60){
            nilaiHuruf = "c";
            nilaiSetara = 2;
            kualifikasi = " cukup ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
        else if (total >39 && total<=50){
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = " kurang ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
        else if (total <=39){
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = " gagal ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }


    }
}
