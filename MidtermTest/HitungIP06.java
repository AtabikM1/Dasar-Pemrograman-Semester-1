package MidtermTest;
import java.util.Scanner;

public class HitungIP06 {
    public static void main(String [] args){

        System.out.println("program hitung IP oleh ATABIK M");
        String namaMahasiswa, matkul;
        int banyakmatkul, jumlahsks, jumlahnilai = 0;
        // inisialisasi dan deklarasi
        double IP = 0, nilai, IPK = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama = ");
        namaMahasiswa = sc.next();
        System.out.println("Banyak mata kuliah = ");
        banyakmatkul = sc.nextInt();
        

        

        int i = 0;

        while( i < banyakmatkul){
            System.out.print("masukan mata kuliah ke " +(i+1)+ " = ");
            matkul = sc.next();
            System.out.print("masukkan nilai matkul tersebut = ");
            nilai = sc.nextDouble();
            System.out.print("masukkan jumlah sks = ");
            jumlahsks = sc.nextInt();
            
            i++;
            jumlahnilai += nilai;
            IPK = jumlahnilai/nilai;
            
            IP = (nilai*jumlahsks/jumlahsks);
            System.out.println("nilai IP anda = " + IP);
            if ( IP  == 4 ){
                System.out.println("indeks nilai anda A");
            }else if ( IP > 3.5){
                System.out.println("indeks nilai anda B+");
            }else if ( IP > 3.0 ){
                System.out.println("indeks nilai anda B");
            }else if ( IP > 2.0){
                System.out.println("indeks nilai anda C");
            }else if ( IP > 2.5 ){
                System.out.println("indeks nilai anda C+");
                System.out.println("anda harus remidi");
            }else if ( IP > 1){
                System.out.println("indeks nilai anda D");
                System.out.println("anda harus remidi");
            }else if ( IP < 1){
                System.out.println("indeks nilai anda E");
                System.out.println("anda harus remidi");
            }
            
        } 
        System.out.println("jumlah nilai "+jumlahnilai);
        System.out.println("nilai IPK =" +IPK);
            


    }
}
