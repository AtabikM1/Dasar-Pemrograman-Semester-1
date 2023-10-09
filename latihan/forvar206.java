package latihan;

import java.util.Scanner;

public class forvar206 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int bil;
        boolean stop = false;
        for(; !stop;) {
            System.out.println("masukkan bilangan : ");
            bil = sc.nextInt();
            System.out.println("bilangan yang anda masukkan: " + bil);
            if (bil == 0){
                stop = true;
            }
        } 
        System.out.println("program end");
    }
}
