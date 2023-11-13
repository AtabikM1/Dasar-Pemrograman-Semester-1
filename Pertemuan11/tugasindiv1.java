import java.util.Scanner;

public class tugasindiv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        // looping untuk mencetak baris
        for (int i = 1; i <= N; i++) {

            // looping untuk mencetak spasi
            for (int k = 1; k <= N - i ; k++) {
                System.out.print(" ");
                // looping untuk mencetak angka
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
            
            
            // new line setiap baris angka
            System.out.println();
        }
    }
}
