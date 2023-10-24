package MidtermTest;
import java.util.Scanner;

public class toko06 {
    public static void main(String [] args){

        String namapelanggan, namaproduk, statuspelanggan, ulang;
        int kuantitasbrg, harga,  i = 0,banyakbrgbelanja;
        double  tagihan,  discount = 0, subtotalbelanja, totalbelanja=0;
        String tambahbarang="ya";
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Pelanggan = ");
        namapelanggan = sc.next();
        
        System.out.print("Apakah pelanggan member = (ya atau tidak) ");
        statuspelanggan = sc.next();

        
        
        while(true){

            System.out.print("Produk yang dibeli = ");
            namaproduk = sc.next();
            System.out.print("Masukkan jumlah barang = ");
            kuantitasbrg = sc.nextInt();
            System.out.print("harga = ");
            harga = sc.nextInt();
            

            subtotalbelanja = kuantitasbrg*harga;
            totalbelanja+= subtotalbelanja;

            System.out.println("apakah akan menambah barang = ya/tidak");
            tambahbarang = sc.next();
            if(tambahbarang.equalsIgnoreCase("tidak")){
                break;
            }else{

            }
            
        }    
            
            
            if (statuspelanggan.equalsIgnoreCase("ya")){
                if(totalbelanja>=200000){
                discount = 0.1*totalbelanja;
                
            }if(totalbelanja>=200000){
                discount = 0.05*totalbelanja;
                
            }
            
            
            }
            
            


        
        
            tagihan = totalbelanja-discount;
            System.out.println("---------struk-----------");
            System.out.println("total belanja = "+ totalbelanja);
            System.out.println("tagihan = "+ tagihan );
            System.out.println();
        
    }

}
