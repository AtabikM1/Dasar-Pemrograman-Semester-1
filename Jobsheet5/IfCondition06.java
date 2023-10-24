package Jobsheet5;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * IfCondition06
 */
public class IfCondition06 {

    public static void main(String[] args){
    Scanner sc00 = new Scanner(System.in);
    
    System.out.println("masukan suhu : ");
    int suhu = sc00.nextInt();
    
    if (suhu<16){
        System.out.println("Silahkan gunakan jaket");
    }
    if (suhu<20){
        System.out.println("silahkan gunakan baju tebal");
    }
    else
        System.out.println("silahkan pakai topi");

}

}