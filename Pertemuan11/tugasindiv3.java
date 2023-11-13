import java.util.Scanner;
public class tugasindiv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        // looping untuk print banyak baris
        for (int i = 1; i <= N; i++) {

            // looping untuk print angka pada baris
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // beri jarak untuk setiap angka
            }

            // new line
            System.out.println();
        }
    }
}

