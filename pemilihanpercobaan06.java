import java.util.Scanner;

public class pemilihanpercobaan06 {
    public static void main(String[] args){
        Scanner input06 = new Scanner(System.in);
        System.out.println("masukan angka:");
        int angka = input06.nextInt();
        String hasil = (angka %2 == 0) ? "angka " +angka+ " bilangan genap " : "Angka" +angka+ "Bilangan ganjil";
        System.out.println(hasil);
        
        
    }
}
