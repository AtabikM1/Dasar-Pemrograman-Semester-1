package Pertemuan10;

import java.util.Arrays;

public class numbers06 {
    public static void main(String[] args) { //struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
        int [][] myNumbers = new int[3][5]; //Deklarasi dan instansiasi array 2 dimensi bernama myNumbers 
        

        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++){
            System.out.println("panjang baris ke -"+ (i+1) + ": "+ myNumbers[i].length);
        }
        
    }
}
