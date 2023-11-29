package Pertemuan13;

public class programku {
    public static void tampilhinggakei(int i) {
        for (int j = 1; j <= i; j++){
            System.out.print(j+" ");
        }
    }
    public static int jumlah (int bil1, int bil2){
        return (bil1 + bil2);
    }
    public static void tampiljumlah (int bil1, int bil2){
        tampilhinggakei(jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        tampiljumlah(temp, 5);
    }
}
