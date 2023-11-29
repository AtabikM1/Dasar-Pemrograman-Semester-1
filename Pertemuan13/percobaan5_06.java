package Pertemuan13;

public class percobaan5_06 { //. Buat class baru
    static void Tampil(String str, int... a){ //fungsi Tampil (bertipe void)
        System.out.println("String = " + str);
        System.out.println("jumlah argumen/parameter = " + a.length);

        for (int i : a){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) { //Buat fungsi main di dalam class
        Tampil("daspro 2019", 100, 200);
        Tampil("Teknologi informasi", 1, 2, 3, 4, 5, 6, 7);
        Tampil("POLINEMA");
    }
}
