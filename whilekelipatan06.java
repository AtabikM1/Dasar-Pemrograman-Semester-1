

import java.util.Scanner;

public class whilekelipatan06 {
        public static void main(String [] args){
        Scanner scan = new Scanner(System.in); //buat library scanner
        double ratarata = 0; 
        int jumlah = 0, kelipatan, counter = 0; //inisialisasi variabel
        

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt(); // menambah code untuk menerima dari input dari keyboard
            //Buat struktur perulangan FOR dengan kondisi pemilihan IF 
        int i = 1;
        while (i <= 50){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
                ratarata = (double) jumlah/counter;
            }
            i++;
        }
        /*Tampilkan banyaknya bilangan kelipatan dan total bilangan kelipatan pada rentang 1
-       50*/

        System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("rata-rata dari seluruh bilangan kelipatan %d adalah = %2f\n", kelipatan, ratarata);
    }
    
}
