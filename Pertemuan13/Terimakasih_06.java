package Pertemuan13;

public class Terimakasih_06 {
    public static void ucapanterimakasih () {//fungsi ucapan terimakasih
        System.out.println("thank u for being the best teacher in the wrld.\n"+
        "you inspired in me a love for learning and made me feel like i could ask u anything.");
    }
    public static void main(String [] args){//fungsi utama
        ucapanterimakasih(); //Eksekusi fungsi UcapanTambahan dari dalam fungsi main.
        
        String ucapan = "terimakasih pak... bu... semoga sehat selalu";
        ucapantambahan(ucapan);   
        

    }
    public static void ucapantambahan(String ucapan){//Buat fungsi UcapanTambahan dengan sebuah parameter bertipe String 
        System.out.println("hello");
    }
}
