import java.util.Scanner;

public class pemilihan3percobaan306 {
    public static void main(String[] args){
        Scanner input06 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajinet;
        double pajak = 0;
        System.out.println("masukkan kategori");
        kategori = input06.next();
        System.out.println("masukkan besarnya penghasilan : ");
        penghasilan = input06.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajinet = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih = " + gajinet);
        } else if (kategori.equalsIgnoreCase("pengusaha")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajinet = (int) (penghasilan - (pajak* penghasilan));
            System.out.println("penghasilan bersih = " + gajinet);
        } else
            System.out.println("masukkan kategori salah");
    }
}
