import java.util.Scanner;
public class tugasindiv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N (min 5)= ");
        int N = sc.nextInt();//nilai dengan min 5h

        if (N < 4) {
            System.out.println("Nilai N harus minimal 5.");
            return;
        }

        int i = N; 

        while (i >= 1) {
            int j = 1; // kolom pertama
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // new line
            i--;
        }
    }
}

