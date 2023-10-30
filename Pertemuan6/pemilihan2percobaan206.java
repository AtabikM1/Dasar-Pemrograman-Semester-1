package Pertemuan6;

import java.util.Scanner;

public class pemilihan2percobaan206 {

    public static void main(String[] args){

        float totalsudut;

        Scanner input06 = new Scanner(System.in);
        System.out.println("masukkan sudut 1 = ");
        float sudut1 = input06.nextFloat();
        System.out.println("masukkan sudut 2 = ");
        float sudut2 = input06.nextFloat();
        System.out.println("masukkan sudut 3 = ");
        float sudut3 = input06.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;
        
        if ( totalsudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("segitiga tersebut siku-siku");
            else if (sudut1 == sudut2 && sudut2 == sudut3)
                System.out.println("segitiga tersebut sama sisi");
            else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut3 == sudut2)
                System.out.println("segitiga tersebut sama kaki");
            else if ((sudut1 ==60) || (sudut2 == 60) || (sudut3 == 60))
                System.out.println("segitiga sembarang");
        }else 
        System.out.println("segitiga sembarang");
    }
}