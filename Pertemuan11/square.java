import java.util.Scanner;

public class square {

    public static void main(String[] args) { // membuat  method main(),
        Scanner sc = new Scanner(System.in); // import class Scanner.

        System.out.print("masukkan nilai N = ");
        int N = sc.nextInt(); 

        for(int j = 1; j <= N; j++){ // outer untuk loop kebawah
            for (int i = 0 ; i <= N ; i++){ // inner loop yang mencetak bintang
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}