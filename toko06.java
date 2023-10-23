import java.util.Scanner;

public class toko06 {
    public static void main(String [] args){

        String namapelanggan, namaproduk, statuspelanggan, ulang;
        int kuantitasbrg, harga,  i = 0,banyakbrgbelanja;
        double  tagihan,  discount = 0, subtotalbelanja, totalbelanja;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Pelanggan = ");
        namapelanggan = sc.next();
        System.out.print("banyak macam produk yang dibeli = ");
        banyakbrgbelanja = sc.nextInt();
        System.out.print("Apakah pelanggan member = (ya atau tidak) ");
        statuspelanggan = sc.next();

        boolean ulangi=true;
        
        while(ulangi){

            System.out.print("Produk yang dibeli = ");
            namaproduk = sc.next();
            System.out.print("Masukkan jumlah barang = ");
            kuantitasbrg = sc.nextInt();
            System.out.print("harga = ");
            harga = sc.nextInt();
            

            subtotalbelanja = kuantitasbrg*harga;

            System.out.println("apakah akan menambah barang = ");
            
            
            
            
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
