package Pertemuan14;

import java.util.Scanner;
public class soalno2 {
    static int hitungpangkat(int x, int y) {
        if (y == 0) {
            //System.out.print("x1");
            return 1;
        } else {
            System.out.print(x);
            if (y > 1) {
                System.out.print("x");
            }
            return x * hitungpangkat(x, y - 1);}
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("bilangan yang dihitung = ");
        bilangan = sc.nextInt();
        System.out.print("pangkat = ");
        pangkat = sc.nextInt();

        System.out.print("Hasil dari " + bilangan + "^" + pangkat + " = ");
        int hasil = hitungpangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}


