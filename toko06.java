import java.util.Scanner;

public class toko06 {
    public static void main(String [] args){

        String namapelanggan, namaproduk, statuspelanggan, ulang;
        int kuantitasbrg, harga,  i = 0,banyakbrgbelanja;
        double  tagihan, totalbelanja, discount = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Pelanggan = ");
        namapelanggan = sc.next();
        System.out.print("banyak macam produk yang dibeli = ");
        banyakbrgbelanja = sc.nextInt();
        System.out.print("Apakah pelanggan member = (ya atau tidak) ");
        statuspelanggan = sc.next();

        i = 0;
        
        while(i<banyakbrgbelanja){

            System.out.print("Produk yang dibeli = ");
            namaproduk = sc.next();
            System.out.print("Masukkan jumlah barang = ");
            kuantitasbrg = sc.nextInt();
            System.out.print("harga = ");
            harga = sc.nextInt();
            i++;

            totalbelanja= kuantitasbrg*harga;
            
            
            if (statuspelanggan.equalsIgnoreCase("ya")){
                if(totalbelanja>=200000){
                discount = 0.1*totalbelanja;
                System.out.println(discount);
            }if(totalbelanja>=200000){
                discount = 0.05*totalbelanja;
                System.out.println(discount);
            }
            tagihan = totalbelanja-discount;
            
            
            System.out.println("total belanja = "+ tagihan );}


        }
        
    }

}
