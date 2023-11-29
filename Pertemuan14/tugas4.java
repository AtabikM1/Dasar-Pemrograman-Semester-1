package Pertemuan14;

public class tugas4 {

        // Fungsi rekursif Fibonacci untuk menghitung jumlah pasangan marmut
        static int hitungPopulasiMarmut(int bulan) {
            if (bulan <= 2) {
                return 1;  // Basis: pada bulan pertama dan kedua, hanya ada satu pasangan marmut
            } else {
                return hitungPopulasiMarmut(bulan - 1) + hitungPopulasiMarmut(bulan - 2);
                // Rekursi: jumlah pasangan marmut pada bulan ke-n adalah jumlah pasangan marmut pada bulan ke-(n-1) dan ke-(n-2)
            }
        }
        public static void main(String[] args) {
            int bulan = 12;
    
            int jumlahPasanganMarmut = hitungPopulasiMarmut(bulan);
    
            System.out.println("Pada akhir bulan ke-" + bulan + ", jumlah pasangan marmut adalah: " + jumlahPasanganMarmut);
        }
}
    
