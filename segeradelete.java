import java.util.Scanner;

public class segeradelete {
    public static void main(String[] args){
        
       
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan ip = ");
        int ip = sc.nextInt();
        System.out.print("masukkan sks = ");
        int sks = sc.nextInt();
        System.out.print("masukkan jumlah mata kuliah = ");
        int jumlahmatkul = sc.nextInt();

        int nilai;
        nilai = ip*sks*jumlahmatkul;

        System.out.println("nilai anda adalah = " + nilai);

        if(nilai > 300){
            System.out.println("predikat anda a");
        }else if(nilai < 300){
                System.out.println("predikat anda b");
            }
        



    }
}