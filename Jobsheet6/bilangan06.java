package Jobsheet6;
import java.util.Scanner;

public class bilangan06 {
    public static void main(String[] args){
        Scanner input06 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.println("masukkan bilangan 1 = ");
        bil1 = input06.nextInt();
        System.out.println("masukkan bilangan 2 = ");
        bil2 = input06.nextInt();
        System.out.println("masukkan bialnagn 3 = ");
        bil3 = input06.nextInt();
        
        if (bil1>bil2) {
            System.out.println("bilangan terbesar adalah" + bil1);
        } else if (bil2<bil3) {
            System.out.println("bilangan terbesar adalah " + bil3);

        }else
        System.out.println("bilangan terbesar adalah "+ bil2);
        
    }
}
