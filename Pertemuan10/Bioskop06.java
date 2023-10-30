package Pertemuan10;

public class Bioskop06 {
    public static void main(String [] args){ //struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
        String [][] penonton = new String[4][2];
        /*membuat array bertipe String dengan nama penonton dengan kapasitas baris 4 elemen
        dan kolom 2 elemen */

        // mengisi masing-masing elemen array penonton 
       penonton[0][0]= "Amin";
       penonton[0][1]= "Bena";
       penonton[1][0]= "Candra";
       penonton[1][1]= "Dela";
       penonton[2][0]= "Eka";
       penonton[2][1]= "Farhan";
       penonton[3][0]= "Gisel";
       penonton[3][1]= "Hena";

       //print semua isi elemennya ke layar

       System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
       System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
       System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
       System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

       System.out.println(penonton.length);
       System.out.println(penonton[0].length);
       System.out.println(penonton[1].length);
       System.out.println(penonton[2].length);
       System.out.println(penonton[3].length);

       System.out.println(penonton.length);
        //soal no 5
       for (int i = 0; i < penonton.length; i++){
        System.out.println("panjang baris ke "+ (i+1) + " = " + penonton[i].length);
       }
       System.out.println(penonton.length);
       //soal no 6
       for (String[] barispenonton : penonton){
        System.out.println("panjang baris = " + barispenonton.length);
       }
       //soal no 10
       System.out.println("penonton pada baris ke 3 = ");

       for (int i = 0; i < penonton[2].length; i++){
        System.out.println(penonton[2][i]);
       }
       //soal no 11 menggunakan for each
       System.out.println(" penonton pada baris ke 3 = ");

       for (String i : penonton[2]){
        System.out.println(i);
       }

       // soal no 12 menyebutkan nama penonton
       for (int i = 0; i < penonton.length; i++){
        System.out.println("penonton pada baris ke = " + (i+1) +" = " + String.join(", ", penonton[i]));
       }
    } 
}
