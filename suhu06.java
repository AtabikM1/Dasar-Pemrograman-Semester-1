import java.util.Scanner;

public class suhu06 {
    public static void main(String[] args){
        Scanner input06 = new Scanner(System.in);

        int suhu;
        char hujan;

        System.out.println("masukkan suhu: ");
        suhu = input06.nextInt();
        System.out.println("masukkan status: ");
        hujan = input06.next().charAt(0);

        if (suhu >27) {
            System.out.println("memakai dress");
        if (hujan == 'y'|| hujan == 'Y'){
            System.out.println("membawa payung");
        }else {
            System.out.println("sunscreen");
        
        }
    }else{
        System.out.println("memakai celana panjang");
    }
}
}

