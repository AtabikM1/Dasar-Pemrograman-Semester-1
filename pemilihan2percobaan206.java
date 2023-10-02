import java.util.Scanner;

public class pemilihan2percobaan206 {

    public static void main(String[] args){

        float totalsudut;

        Scanner input06 = new Scanner(System.in);
        System.out.println("masukkan sudut 1 = ");
        float sudut1 = input06.nextFloat();
        System.out.println("masukkan sudut 2 = ");
        float sudut2 = input06.nextFloat();
        System.out.println("masukkan sudut 3 = ");
        float sudut3 = input06.nextFloat();
        
        totalsudut = sudut1 + sudut2 + sudut3;
        
        if ( totalsudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("segitiga tersebut siku-siku");
            else
                System.out.println("segitiga tersebut bukan siku-siku");
        }else 
        System.out.println("bukan segitiga");
    }
}