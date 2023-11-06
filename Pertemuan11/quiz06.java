import java.util.Random;
import java.util.Scanner;//Buat class baru dengan nama Triangle dan simpan dengan nama file Quiz.java.
//Import class Random dan class Scanner,

public class quiz06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);//deklarasikan objek dari class Random dan class Scanner.
        Random random = new Random();//Class Random,

        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean succes = false;
            do{
               System.out.println("tebak angka (1-10) = ");
               int answer = input.nextInt();
               input.nextLine();
               succes =(answer==number); 
               if (answer > number){
                System.out.println("jawaban lebih besar dari yang saya maksud");
               }else if (answer < number){
                System.out.println("jawaban lebih kecil dari yang saya maksud");
               }else{
                System.out.println("gud");
               }
            }while(!succes);
            System.out.println("jawaban benar! apakah anda ingin mengulang permainan (Y/y)");
            menu = input.nextLine().charAt(0);
        }while (menu=='y'||menu=='Y');
    }
}