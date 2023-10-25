package Jobsheet9;

import java.util.Scanner;

public class LinearSearch06 {

    public static void main(String [] args){
        
        int key = 0;
        int hasil = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah elemen array = ");//input untuk memberikan length
        int length = sc.nextInt();
        int [] arrayInt = new int[length];

        for(int i= 0; i < arrayInt.length; i++){
            //gunakan looping dengan struktur for untuk memberikan input
            System.out.print("masukkan elemen array ke-"+(i)+" = ");
            arrayInt[i] = sc.nextInt();           
        }
        System.out.print("masukkan key yang ingin dicari = ");
        key= sc.nextInt();
        for(int i= 0; i < arrayInt.length; i++){    
            if ( arrayInt[i]== key){    //gunakan struktur loooping untuk memproses searching key
                hasil = i;
                System.out.println("key ada dalam posisi indeks ke = "+hasil);

            }else {
                System.out.println("indeks tidak ditemukan");
                break;

            }
            
            
        }
        
    }
}
