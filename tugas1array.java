import java.util.Scanner;

public class tugas1array {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int lulus = 0, tidaklulus = 0;
        double total = 0;
        double rata2;
        double rata2tidaklulus = 0;
        double rata2lulus = 0;
        System.out.print("masukkan jumlah mata kuliah = ");
        int length = sc.nextInt();
        int [] nilaimhs = new int[length];
        for (int i = 0; i < nilaimhs.length; i++){
            System.out.print("masukkan nilai matakuliah ke-"+(i+1)+" = ");
            nilaimhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaimhs.length; i++){
            total += nilaimhs[i];
            if (nilaimhs[i]>70){
                rata2lulus += nilaimhs[i];
                lulus++;
                
            } else{
                rata2tidaklulus += nilaimhs[i];
                tidaklulus++;
                
            }
        }
        int temp = 0;

            for (int i = 0; i < nilaimhs.length; i++){
                for (int j = 1; j < nilaimhs.length; j++){
                    if(nilaimhs[j-1]<nilaimhs[j]){
                        //swap elemen
                        temp = nilaimhs[j];
                        nilaimhs[j] = nilaimhs[j-1];
                        nilaimhs[j-1] = temp;
    
                    }
                }
            }
        System.out.println("lulus: " + lulus);
        rata2 = total/nilaimhs.length;
        
        System.out.println("rata-rata ="+rata2);
        System.out.println("rata-rata nilai lulus = "+rata2lulus/lulus);
        System.out.println("rata-rata nilai tidak lulus = "+rata2tidaklulus/tidaklulus);
    }
}
