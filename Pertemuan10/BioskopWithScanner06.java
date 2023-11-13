package Pertemuan10;

import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        // menulis struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
        Scanner sc = new Scanner(System.in);//Tambahkan library Scanner
        
        //mendeklarasi variable baris dan kolom bertipe int serta nama dan next bertipe String
        int baris, kolom;
        String nama, text, next;
        boolean exit = false;


        //Buat array bertipe String dengan nama penonton dengan 4 baris dan 2 kolom
        String [][] penonton = new String[4][2];

        

        do{
            System.out.println("silahkan pilih opsi menu dibawah ini = ");
            System.out.println("1. input data penonton");
            System.out.println("2. tampilkan daftar penonton");
            System.out.println("3. exit");

            System.out.print("Menu yang dipilih (angka) : "); // User input pilihan menu berupa angka
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
            
                    //Gunakan scanner untuk mengisi elemen pada array penonton
                    while (true){
                        System.out.print("masukkan nama = ");
                        nama = sc.nextLine();
                        do{
                            System.out.print("masukkan baris = ");
                            baris = sc.nextInt();
                            System.out.print("masukkan kolom = ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            

                            if(penonton[baris-1][kolom-1]== null||penonton[baris-1][kolom-1]== "***"){
                                penonton[baris-1][kolom-1] = nama;
                                break;
                            }else{
                                System.out.println("kursi tidak tersedia");
                            }
                        }while(penonton[baris-1][kolom-1]!=null);

                        System.out.println("input penonton lainnya = ? (y/n)");
                        next = sc.nextLine();

                        if(next.equalsIgnoreCase("n")){
                            break;
                        }
                    }break;
                case 2:
                    System.out.println("menampilkan data penonton");
                    for (int i = 0; i < penonton.length; i++){
                        for(int j = 0; j < penonton[i].length; j++){
                            if(penonton[i][j] == null){
                                penonton[i][j] = "***";
                            }
                        }
                    System.out.println("penonton pada baris ke = " + (i+1) +" = " + String.join(" , ", penonton[i]));
                    
                    
                }
                case 3:
                exit = true;
                break;
                
        }
            
        
    }while(exit == false);
    
}
}
