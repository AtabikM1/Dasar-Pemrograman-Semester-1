package latihan;
import java.util.Scanner;

public class forkelipatan06 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int jumlah = 0, kelipatan, counter = 0;
        

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }

}