package Pertemuan9;
import java.util.Scanner;

public class arraynilai06 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] nilaiakhir = new int[10];

        for (int i = 0; i < nilaiakhir.length; i++) {
           
            System.out.print("masukkan nilai akhir ke "+(i + 1)+" = ");
            nilaiakhir[i] = sc.nextInt();
            
        }   
    
        for (int i = 0; i<10; i++){
         if (nilaiakhir[i]>70){
                System.out.println("selamat! mahasiswa ke-"+ i +" lulus");
            }else if(nilaiakhir[i]<=70){
                System.out.println("mahasiswa ke-"+ i +" tidak lulus");
            }
        
            System.out.println("nilai akhir ke-"+i+" adalah "+nilaiakhir[i]);
        }
    }
}
