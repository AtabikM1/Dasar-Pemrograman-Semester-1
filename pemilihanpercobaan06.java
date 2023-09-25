import java.util.Scanner;

public class pemilihanpercobaan06 {
    public static void main(String[] args){
        Scanner input00 = new Scanner(System.in);

        System.out.println("masukan angka: ");
        int angka = input00.nextInt();

        if (angka % 2 == 0)
            System.out.println("nilai " +angka+" bilangan genap");
        else
            System.out.println("nilai "+angka+" bilangan ganjil");
        
    }
}
