import java.util.Scanner;

public class nestedloop06 {
    public static void main(String[] args) { //Buatlah fungsi main() 
        
        
        Scanner sc = new Scanner(System.in);
        //tambahkan deklarasi untuk Scanner dan deklarasi array 2 dimenasi
        //dengan jumlah baris 5 dan kolom 7. 
        double temps [][] = new double[5][7];
        
        double ratasuhu;

        for ( int i = 0; i < temps.length;i++){
            System.out.println("kota ke-"+ (i+1));
            
            for (int j = 0; j < temps[i].length; j++){
                System.out.print("hari ke-"+ (j+1)+" ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }for (int i = 0; i < temps.length; i++){
            System.out.println("kota ke-"+(i+1)+":");
            double jumlahsuhu = 0;
            for (double suhu : temps[i]){
                System.out.println(suhu+"\n ");
                jumlahsuhu += suhu;
            }
            ratasuhu = jumlahsuhu/temps[i].length;
            System.out.println("rata - rata suhu = "+ ratasuhu);
            
            
            System.out.println();
        } 
    }
}
