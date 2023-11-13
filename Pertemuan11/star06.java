import java.util.Scanner;

public class star06 {
    public static void main(String[] args) {//Buat fungsi/method main() di dalamnya.
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai N = ");
        int N = sc.nextInt();// instruksi untuk memasukan nilai variable N 
        

        for(int i = 0 ; i <= N; i--){ //sintaks perulangan dengan for
            System.out.print(" * ");
        }
        
    }
}