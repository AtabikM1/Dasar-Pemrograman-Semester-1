package Pertemuan7;


public class while06 {
    public static void main(String[] args){
        int i = 1;
        while (i<=10) {
            if (i % 2 != 0) {
                System.out.println("angka "+ i +" adalah bilangan ganjil");
            } else if ( i % 3 == 0 ) {
                System.out.println("angka "+ i +" adalah kelipatan 3");
            }else {
                System.out.println("angka "+ i +" adalah bilangan genap");
            }
            i++;
        }   
    }
}
