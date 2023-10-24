package Jobsheet7;


import java.util.Scanner;

public class forvar306 {
    public static void main(String [] args){
        int bil, n;
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        for (n = 0; !stop; n++ ) {
            System.out.print("masukkan bilangan = ");
            bil = sc.nextInt();
            System.out.println("bilangan yang anda masukkan = " + bil);
            if (bil <  n) {
                stop = true;
            }
        }
        System.out.println("program end ");
    }
}
