package Pertemuan9;
import java.util.Scanner;

public class arrayratanilai06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int lulus = 0, tidaklulus = 0;
        double total = 0;
        double rata2;
        double rata2tidaklulus = 0;
        double rata2lulus = 0;
        System.out.print("masukkan jumlah mahasiswa = ");
        int length = sc.nextInt();
        int [] nilaimhs = new int[length];
        for (int i = 0; i < nilaimhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" = ");
            nilaimhs[i] = sc.nextInt();
        }for (int i = 0; i < nilaimhs.length; i++){
            total += nilaimhs[i];
            if (nilaimhs[i]>70){
                rata2lulus += nilaimhs[i];
                lulus++;
                
            } else{
                rata2tidaklulus += nilaimhs[i];
                tidaklulus++;
                
            }

        }
        
        System.out.println("lulus: " + lulus);
        rata2 = total/nilaimhs.length;
        System.out.println("rata-rata nilai lulus = "+rata2lulus/lulus);
        System.out.println("rata-rata nilai tidak lulus = "+rata2tidaklulus/tidaklulus);
    }
}
