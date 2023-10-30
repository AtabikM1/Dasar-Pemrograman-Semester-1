package Pertemuan4;
import java.util.Scanner;

public class Lingkaran06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas;
        System.out.println("masukan jari2 lingkaran  =");
        r=input.nextInt();

        System.out.println("keliling =");
        keliling = 2*3.14* r;
        System.out.println("luas =");
        luas = 3.14*r*r;

        System.out.println(keliling);
        System.out.println(luas);

    }
    
}
